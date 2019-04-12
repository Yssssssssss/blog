package service;

import pojo.Likes;

public interface LikesService {
	public int saveLike(Likes likes);
	public int delLike(Likes likes);
	public boolean getCheckLike(Likes likes);
	public int delTextAllLike(int textId);
}
