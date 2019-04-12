package service;

import java.util.List;

import pojo.Comment;

public interface CommentService {
	public int saveComment(Comment comment);

	public List<Comment> getByReplyid(int id);

	public List<Comment> getByCommentId(int id);

	public int delByCommentId(Comment comment);

	public int delByReplyid(int id);

	public int delOneByReplyid(Comment comment);

	public int delTextAllComment(int textId);

	public List<Comment> getAllByTextId(int id);
}
