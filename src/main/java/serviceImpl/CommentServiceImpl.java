package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CommentMapper;
import pojo.Comment;
import pojo.CommentExample;
import pojo.CommentExample.Criteria;
import service.CommentService;
import service.TextService;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentMapper commentMapper;

	@Override
	public int saveComment(Comment comment) {
		return  commentMapper.insertSelective(comment);
	}

	@Override
	public List<Comment> getByReplyid(int id) {
		CommentExample example = new CommentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCommentReplyidEqualTo(id);
		return commentMapper.selectByExample(example);
	}

	@Override
	public List<Comment> getByCommentId(int id) {
		CommentExample example = new CommentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCommentIdEqualTo(id);
		return commentMapper.selectByExample(example);
	}

	@Override
	public int delByCommentId(Comment comment) {
		 return  commentMapper.deleteByPrimaryKey(comment.getCommentId());// 删本评论
	}

	public int delByReplyid(int id) {// 删除一个评论的所有子评论
		// 删除所有子评论
		CommentExample example = new CommentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCommentReplyidEqualTo(id);
		return commentMapper.deleteByExample(example);
	}

	public int delOneByReplyid(Comment comment) {// 删除一个评论的子评论
		// 删除所有子评论
		CommentExample example = new CommentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCommentIdEqualTo(comment.getCommentId());
		return  commentMapper.deleteByExample(example);
		 
	}

	public int delTextAllComment(int textId) {// 删除文章的所有评论
		CommentExample example = new CommentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCommentTextidEqualTo(textId);
		return commentMapper.deleteByExample(example);
	}

	public List<Comment> getAllByTextId(int id) {
		CommentExample example = new CommentExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCommentTextidEqualTo(id);
		return commentMapper.selectByExample(example);
	}
}
