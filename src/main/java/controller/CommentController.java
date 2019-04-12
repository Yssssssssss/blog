package controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import pojo.Comment;
import pojo.Msg;
import service.CommentService;
import service.TextService;

/**
 * @author win10
 * 添加评论/子评论  ✔
 * 删除评论✔
 * 查找评论（某一篇文章的所有）✔
 * 删除子评论✔
 * 查找子评论（某一个评论  ，根据回复的id）✔
 */
@Controller
@ResponseBody
public class CommentController {

	@Autowired
	CommentService  commentService;
	@Autowired
	TextService textService;
	
	@RequestMapping(value="comment",method=RequestMethod.POST)
	public Msg saveComment(Comment comment) {//保存一个评论，也可以是子评论
		comment.setCommentDate(new Date());
		
		Integer commentReplyid = comment.getCommentReplyid();
		if(commentReplyid!=null) {  //如果填入的回复id错误的话，返回错误
			List<Comment> list = commentService.getByCommentId(commentReplyid);
			if(list.size()!=0) {
				int i = commentService.saveComment(comment);
				if(i==1) {
					textService.updTextDataNumAdd("comment", comment.getCommentTextid());//评论数加一
					return Msg.success().add("saveComment", true);
				}
			}
		}else {
			int i = commentService.saveComment(comment);
			if(i==1) {
				textService.updTextDataNumAdd("comment", comment.getCommentTextid());//评论数加一
				return Msg.success().add("saveComment", true);
			}
		}
			return Msg.failed().add("saveComment",false);
	}
/*	@RequestMapping("comment/{commentReplyid}")
	public Msg getByCommentReplyid(@PathVariable int commentReplyid) {//查找评论的所有子评论
		  
		List<Comment> list= commentService.getByReplyid(commentReplyid);
		if(list.size()!=0) {
			return Msg.success().add("childComment", list);
		}else {
			return Msg.failed().add("childComment",false);
		}
	}*/
	
	@RequestMapping("comment/text/{commentTextId}")
	public Msg getByCommentByTextId(@PathVariable int commentTextId) {//查找一片文章的所有评论
		List<Comment> list=commentService. getAllByTextId(commentTextId);
		if(list.size()!=0) {
			return Msg.success().add("TextComment", list);
		}else {
			return Msg.failed().add("TextComment",false);
		}
	}
	
	
	@RequestMapping(value="comment",method=RequestMethod.DELETE)
	public Msg delByCommentId(Comment comment) {//删除一个评论根据commentId,如果是一级评论，则会删除子评论
		// 删除评论 如果有子评论 需要先删除子评论，才能删除本评论
		if (comment.getCommentReplyid() == null) {// 没有replyid的情况
			List<Comment> list = commentService.getByReplyid(comment.getCommentId());
			if (list.size() != 0) {// 有子评论
				int delByReplyid = commentService.delByReplyid(comment.getCommentId());// 删除改评论的所有子评论
				if (delByReplyid != 0) {
					
						for (int i = 0; i < list.size(); i++) {
							textService.updTextDataNumSub("comment", list.get(i).getCommentTextid());// 修改文章的评论数
						}
					
					int i = commentService.delByCommentId(comment);// 删本评论
					if (i != 0) {
						textService.updTextDataNumSub("comment", comment.getCommentTextid());// 更新评论数
						return Msg.success().add("delComment", true);
					}
				}
			} else {
				int i = commentService.delByCommentId(comment);// 删本评论
				if (i == 1) {
					textService.updTextDataNumSub("comment", comment.getCommentTextid());// 更新评论数
					return Msg.success().add("delComment", true);
				}
			}
		} else {// 有replyid的情况
			int delByReplyid = commentService.delOneByReplyid(comment);// 删除改评论
			if(delByReplyid!=0) {
				textService.updTextDataNumSub("comment", comment.getCommentTextid());// 修改文章的评论数
				return Msg.success().add("delComment", true); 
			}
		}
			return Msg.failed().add("delComment",false);
	}
	 
}
