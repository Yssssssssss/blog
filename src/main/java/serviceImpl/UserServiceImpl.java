package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import pojo.Focus;
import pojo.User;
import pojo.UserExample;
import pojo.UserExample.Criteria;
import service.UserService;

/**
 * @author win10 粉丝 文章 关注 收藏数 变化后 对应的user表里的字段加一
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper usermapper;

	@Override
	public int saveUser(User user) {
		return usermapper.insert(user);
	}

	@Override
	public int login(User user) {
		User sleUser = this.getUserByUsername(user.getUserName());
		if (sleUser == null) {
			return 0;
		} else if (sleUser.getUserPassword().equals(user.getUserPassword())) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public User getUserByUsername(String username) {// 查找用户的信息
		UserExample example = new UserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserNameEqualTo(username);
		List<User> list = usermapper.selectByExample(example);
		if (list.size() != 0) {
			return (User) list.get(0);
		} else {
			return null;
		}

	}

	@Override
	public User getUserByUserId(int userId) {// 查找用户的信息
		UserExample example = new UserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserIdEqualTo(userId);
		List<User> list = usermapper.selectByExample(example);
		if (list.size() != 0) {
			return (User) list.get(0);
		} else {
			return null;
		}

	}

	@Override
	public int updUser(User user) {
		return usermapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int updUserDataNumAdd(String type, int id) {
		User user = new User();
		user.setUserId(id);
		int i = 0;
		if (type.equalsIgnoreCase("focus")) {
			user.setUserFocusnum(1);// 添加的数量
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		} else if (type.equalsIgnoreCase("text")) {
			user.setUserTextsnum(1);
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		} else if (type.equalsIgnoreCase("collection")) {
			user.setUserCollectionsnum(1);
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		} else if (type.equalsIgnoreCase("fan")) {
			user.setUserFansnum(1);
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		}
		return i;
	}

	@Override
	public int updUserDataNumSub(String type, int id) {
		User user = new User();
		user.setUserId(id);
		int i = 0;
		if (type.equalsIgnoreCase("focus")) {
			user.setUserFocusnum(-1);// 添加的数量
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		} else if (type.equalsIgnoreCase("text")) {
			user.setUserTextsnum(-1);
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		} else if (type.equalsIgnoreCase("collection")) {
			user.setUserCollectionsnum(-1);
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		} else if (type.equalsIgnoreCase("fan")) {
			user.setUserFansnum(-1);
			i = usermapper.updateByPrimaryKeySelectiveCountAdd(user);
		}
		return i;
	}

}
