package serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CollectMapper;
import pojo.Collect;
import pojo.CollectExample;
import pojo.CollectExample.Criteria;
import service.CollectService;

@Service
public class CollectServiceImpl implements CollectService {
	@Autowired
	CollectMapper collectMapper;

	// 删除一个文章的所有收藏
	@Override
	public int delTextAllCollection(int textId) {
		CollectExample example = new CollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCollectTextidEqualTo(textId);
		return collectMapper.deleteByExample(example);
	}

	// 添加一个收藏，需要用户收藏数加一,文章的收藏数加一
	@Override
	public int saveCollect(Collect collect) {
		collect.setCollectDate(new Date());
		int i = collectMapper.insertSelective(collect);
		 return i;
	}

	// 取消收藏，需要用户收藏数减一,文章的收藏数减一
	@Override
	public int delCollect(Collect collect) {

		CollectExample example = new CollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCollectTextidEqualTo(collect.getCollectTextid());
		createCriteria.andCollectUseridEqualTo(collect.getCollectUserid());
		int i = collectMapper.deleteByExample(example);
		 
			return i;
		 
	}

	// 查看一个用户的所有收藏
	@Override
	public List<Collect> getUserAllCollect(int userId) {
		CollectExample example = new CollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCollectUseridEqualTo(userId);
		return collectMapper.selectByExample(example);
	}

	// 查看一个用户是否收藏
	@Override
	public boolean getUserCheckText(Collect collect) {
		CollectExample example = new CollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCollectUseridEqualTo(collect.getCollectUserid());
		createCriteria.andCollectTextidEqualTo(collect.getCollectTextid());
		List<Collect> list = collectMapper.selectByExample(example);
		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}
	//查看所有收藏该文章的用户
	@Override
	public List<Collect> getAllUserCollectText(int textId){
		CollectExample example = new CollectExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCollectTextidEqualTo(textId);
		List<Collect> list = collectMapper.selectByExample(example);
		return list;
	}

}
