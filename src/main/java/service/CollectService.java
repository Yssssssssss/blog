package service;

import java.util.List;

import pojo.Collect;

public interface CollectService {
	public int delTextAllCollection(int textId);
	public int saveCollect(Collect collect);
	public int delCollect(Collect collect) ;
	public List<Collect> getUserAllCollect(int userId);
	public boolean getUserCheckText(Collect collect);
	public List<Collect> getAllUserCollectText(int textId);
}
