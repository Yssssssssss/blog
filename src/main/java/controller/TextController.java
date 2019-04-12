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

import pojo.Collect;
import pojo.Msg;
import pojo.Text;
import service.CollectService;
import service.CommentService;
import service.LikesService;
import service.TextService;
import service.UserService;

/**
 * @author win10 写文章✔ 删文章✔ 改文章✔ 查找文章（根据title 或者id）✔ 查找某个人的所有文章 ✔查找点击量 最多的文章✔
 *         查找评论最多的文章✔ 查找赞最多的文章✔ 查找赞收藏的文章✔
 */
@Controller
@ResponseBody
public class TextController {

	@Autowired
	TextService textService;
	@Autowired
	UserService userService;
	@Autowired
	CommentService commentService;
	@Autowired
	CollectService collectService;
	@Autowired
	LikesService likesService;
	@RequestMapping(value = "text", method = RequestMethod.POST)
	public Msg saveText(Text text) {
		text.setTextReleasedate(new Date());
		int i = textService.saveText(text);
		if (i == 1) {
			userService.updUserDataNumAdd("text", text.getTextWriterid());
			return Msg.success().add("saveText", true);
		} else {
			return Msg.failed().add("saveText", false);
		}
	}

	@RequestMapping(value = "text/{id}", method = RequestMethod.DELETE)
	public Msg deleteText(@PathVariable int id) {
		// 获取所有收藏该文章的用户
		List<Collect> list = collectService.getAllUserCollectText(id);
		System.out.println(list);
		if (list.size() != 0) {
			int j = collectService.delTextAllCollection(id);//删除改文章的所有收藏
			if (j != 0) {
				for (int k = 0; k < list.size(); k++) {// 更新所有收藏该文章的用户的收藏数
					userService.updUserDataNumSub("collection", list.get(k).getCollectUserid());
				}
			}
		}
		//删除所有该文章的点赞信息
		likesService.delTextAllLike(id);
		commentService.delTextAllComment(id);// 文章的信息会被删除，所以不用更新评论数
		System.out.println("=======");
		Integer writerid = textService.getById(id).getTextWriterid();
		int i = textService.detById(id);
		if (i == 1) {
			userService.updUserDataNumSub("text", writerid);// 更新用户的文章数
			return Msg.success().add("deleteText", true);
		}  
			return Msg.failed().add("deleteText", false);
	}

	@RequestMapping(value = "text/{id}", method = RequestMethod.PUT)
	public Msg updateText(Text text) {
		text.setTextReleasedate(new Date());
		int i = textService.updById(text);
		if (i == 1) {
			return Msg.success().add("updateText", true);
		} else {
			return Msg.failed().add("updateText", false);
		}
	}

	@RequestMapping(value = "text/{id}", method = RequestMethod.GET)
	public Msg selTextById(@PathVariable int id) {
		Text text = textService.getById(id);
		if (text != null) {
			return Msg.success().add("texts", text);
		} else {
			return Msg.failed().add("texts", null);
		}
	}

	@RequestMapping("textByUser/{id}")
	public Msg getAllTextByWriterId(@PathVariable int id,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		int pageSize=10;
		PageHelper.startPage(pageNum, pageSize);
		List<Text> all = textService.getAllByWriterId(id);
		PageInfo pi=new PageInfo(all,5);
		pi.setPageSize(pageSize);
		if (all.size() != 0) {
			return Msg.success().add("texts", pi);
		} else {
			return Msg.failed().add("texts", null);
		}
	}

	@RequestMapping(value = "textByTitle", method = RequestMethod.GET)
	public Msg getTextByTitle(String title,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		int pageSize=10;
		PageHelper.startPage(pageNum, pageSize);
		List<Text> list = textService.getTextsByTitle(title);
		PageInfo pi=new PageInfo(list,5);
		if (list.size() != 0) {
			return Msg.success().add("texts", pi);
		} else {
			return Msg.failed().add("texts", null);
		}
	}

	@RequestMapping(value = "textByTopCount", method = RequestMethod.GET)
	public Msg getTopCount(@RequestParam(defaultValue = "10") int top) {
		List<Text> list = textService.getByCount(top);
		if (list.size() != 0) {
			return Msg.success().add("texts", list);
		} else {
			return Msg.failed().add("texts", null);
		}
	}

	@RequestMapping(value = "textByTopLike", method = RequestMethod.GET)
	public Msg getTopLike(@RequestParam(defaultValue = "10") int top) {
		List<Text> list = textService.getByLike(top);
		if (list.size() != 0) {
			return Msg.success().add("texts", list);
		} else {
			return Msg.failed().add("texts", null);
		}
	}

	@RequestMapping(value = "textByTopComment", method = RequestMethod.GET)
	public Msg getTopComment(@RequestParam(defaultValue = "10") int top) {
		List<Text> list = textService.getByComment(top);
		if (list.size() != 0) {
			return Msg.success().add("texts", list);
		} else {
			return Msg.failed().add("texts", null);
		}
	}

	@RequestMapping(value = "textByTopCollect", method = RequestMethod.GET)
	public Msg getTopCollect(@RequestParam(defaultValue = "10") int top) {
		List<Text> list = textService.getByCollect(top);
		if (list.size() != 0) {
			return Msg.success().add("texts", list);
		} else {
			return Msg.failed().add("texts", null);
		}
	}
	
	@RequestMapping(value = "textAll", method = RequestMethod.GET)
	public Msg getAllText() {//用于首页显示
		List<Text> list = textService.getAllText();
		if (list.size() != 0) {
			return Msg.success().add("texts", list);
		} else {
			return Msg.failed().add("texts", null);
		}
	}
	
}
