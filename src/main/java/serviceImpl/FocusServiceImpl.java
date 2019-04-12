package serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FocusMapper;
import dao.TextMapper;
import pojo.Focus;
import pojo.FocusExample;
import pojo.FocusExample.Criteria;
import pojo.Text;
import pojo.TextExample;
import service.FocusService;

/**
 * @author win10 关注默认某人 取消关注 查找某人的关注列表 查找某人的粉丝列表 查看是否关注某人（用于动态显示 是否关注某人）
 */
@Service
public class FocusServiceImpl implements FocusService {
	@Autowired
	FocusMapper focusMapper;
	@Autowired
	TextMapper textMapper;

	@Override
	public int saveFocus(Focus focus) {
		return focusMapper.insertSelective(focus);
	}

	@Override
	public int delFocus(Focus focus) {
		FocusExample example = new FocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFocusUseridEqualTo(focus.getFocusUserid());
		createCriteria.andFocusBeuseridEqualTo(focus.getFocusBeuserid());
		return focusMapper.deleteByExample(example);// 根据主键删除
	}

	@Override
	public List<Focus> getUserFocus(int userId) {// 返回关注列表
		FocusExample example = new FocusExample();
		example.setDistinct(true);
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFocusUseridEqualTo(userId);
		return focusMapper.selectByExampleGetFocus(example);
	}

	@Override
	public List<Focus> getUserFans(int userId) {// 返回粉丝列表
		FocusExample example = new FocusExample();
		example.setDistinct(true);
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFocusBeuseridEqualTo(userId);
		return focusMapper.selectByExampleGetFans(example);
	}

	@Override
	public List<Focus> getUserCheckFocus(Focus focus) {// 返回某人是否关注某人
		FocusExample example = new FocusExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andFocusUseridEqualTo(focus.getFocusUserid());
		createCriteria.andFocusBeuseridEqualTo(focus.getFocusBeuserid());
		return focusMapper.selectByExampleGetFocus(example);
	}

	@Override
	public List<Text> getFocusText(List<Focus> list) {
		System.out.println(list);
		List<Integer> writerId = new ArrayList();
		for(Focus f:list) {
			writerId.add(f.getFocusBeuserid());
		}
		TextExample example = new TextExample();
		pojo.TextExample.Criteria createCriteria = example.createCriteria();
		example.setOrderByClause("text_releasedate desc");
		createCriteria.andTextWriteridIn(writerId);
		return textMapper.selectByExampleForFocus(example);
	}

}
