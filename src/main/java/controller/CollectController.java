package controller;

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
import service.CollectService;
import service.TextService;
import service.UserService;

/**
 * @author win10 查看某人的收藏列表✔ 收藏✔ 取消收藏✔ 查看某人是否收藏谋篇文章✔
 */
@ResponseBody
@Controller
public class CollectController {

	@Autowired
	CollectService collectService;
	@Autowired
	UserService userService;
	@Autowired
	TextService textService;

	@RequestMapping("collect") // 保存收藏
	public Msg saveCollect(Collect collect) {
		int i = collectService.saveCollect(collect);
		if (i == 1) {
			userService.updUserDataNumAdd("collection", collect.getCollectUserid());
			textService.updTextDataNumAdd("collection", collect.getCollectTextid());
			return Msg.success().add("saveCollect", true);
		} else {
			return Msg.failed().add("saveCollect", false);
		}
	}

	@RequestMapping(value = "collect", method = RequestMethod.DELETE) // 删除收藏
	public Msg delCollect(Collect collect) {
		int i = collectService.delCollect(collect);
		if (i == 1) {
			userService.updUserDataNumSub("collection", collect.getCollectUserid());
			textService.updTextDataNumSub("collection", collect.getCollectTextid());
			return Msg.success().add("delCollect", true);
		} else {
			return Msg.failed().add("delCollect", false);
		}
	}

	@RequestMapping(value = "collect/{userId}", method = RequestMethod.GET) // 获取用户的所有收藏
	public Msg getUserAllCollection(@PathVariable int userId,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		int pageSize=10;
		PageHelper.startPage(pageNum, pageSize);
		List<Collect> list = collectService.getUserAllCollect(userId);
		PageInfo pi=new PageInfo<>(list,5);
		pi.setPageSize(pageSize);
		if (list.size() != 0) {
			return Msg.success().add("userAllCollect", pi);
		} else {
			return Msg.failed().add("userAllCollect", false);
		}
	}

	@RequestMapping(value = "collectCheck", method = RequestMethod.GET) // 用户是否收藏该文章
	public Msg getUserCheckText(Collect collect) {
		boolean flag = collectService.getUserCheckText(collect);
		if (flag) {
			return Msg.success().add("userCheckText", true);
		} else {
			return Msg.failed().add("userCheckText", false);
		}
	}
}
