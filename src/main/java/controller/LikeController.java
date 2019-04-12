package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Likes;
import pojo.Msg;
import pojo.Text;
import pojo.User;
import service.LikesService;
import service.TextService;
import service.UserService;

/**
 * @author win10 点赞✔ 对取消赞✔ 查看某人对某篇文章是点赞（用于动态显示点赞按钮）✔
 */
@ResponseBody
@Controller
public class LikeController {
	@Autowired
	LikesService likesService;

	@Autowired
	UserService userService;
	@Autowired
	TextService textService;
 	@RequestMapping("like")
	public Msg saveLike(Likes likes) {
		User user = userService.getUserByUserId(likes.getLikesUserid());
		Text text = textService.getById(likes.getLikesTextid());
		int i = 0;
		if (text != null && user != null) {
			i = likesService.saveLike(likes);
		}
		if (i != 0) {
			textService.updTextDataNumAdd("like", likes.getLikesTextid());
			return Msg.success().add("saveLike", true);
		} else {
			return Msg.failed().add("saveLike", false);
		}
	}

	@RequestMapping(value = "like", method = RequestMethod.DELETE)
	public Msg delLike(Likes likes) {
		int i = likesService.delLike(likes);
		if (i != 0) {
			textService.updTextDataNumSub("like", likes.getLikesTextid());
			return Msg.success().add("delLike", true);
		} else {
			return Msg.failed().add("delLike", false);
		}
	}

	@RequestMapping(value = "likeCheck", method = RequestMethod.GET)
	public Msg getCheckLike(Likes likes) {
		boolean flag = likesService.getCheckLike(likes);
		if (flag == true) {
			return Msg.success().add("getCheckLike", true);
		} else {
			return Msg.failed().add("getCheckLike", false);
		}
	}
}
