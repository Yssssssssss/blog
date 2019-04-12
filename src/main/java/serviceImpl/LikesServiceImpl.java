package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LikesMapper;
import pojo.Likes;
import pojo.LikesExample;
import pojo.LikesExample.Criteria;
import pojo.Text;
import pojo.User;
import service.LikesService;
import service.TextService;
import service.UserService;

/**
 * @author win10 点赞 取消赞 查看某人对某篇文章是点赞（用于动态显示点赞按钮）
 */
@Service
public class LikesServiceImpl implements LikesService {
	@Autowired
	LikesMapper likesMapper;
 

	@Override
	public int saveLike(Likes likes) {
		// 检查文章，用户是否存在
		return  likesMapper.insertSelective(likes);
	}

	@Override
	public int delLike(Likes likes) {
		LikesExample example = new LikesExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andLikesTextidEqualTo(likes.getLikesTextid());
		createCriteria.andLikesUseridEqualTo(likes.getLikesUserid());
		return  likesMapper.deleteByExample(example);
	}

	@Override
	public boolean getCheckLike(Likes likes) {
		LikesExample example = new LikesExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andLikesTextidEqualTo(likes.getLikesTextid());
		createCriteria.andLikesUseridEqualTo(likes.getLikesUserid());
		List<Likes> list = likesMapper.selectByExample(example);
		if (list.size() != 0) {
			return true;
		}
		return false;
	}

	@Override
	public int delTextAllLike(int textId) {
		LikesExample example = new LikesExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andLikesTextidEqualTo(textId);
		int i = likesMapper.deleteByExample(example);
		return i;
	}

}
