package service;

import pojo.User;

public interface UserService {
	public int saveUser(User user);

	public int login(User user);

	public User getUserByUsername(String username);

	public User getUserByUserId(int userId);

	public int updUser(User user);

	public int updUserDataNumAdd(String type, int id);

	public int updUserDataNumSub(String type, int id);
}
