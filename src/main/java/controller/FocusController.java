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

import pojo.Focus;
import pojo.Msg;
import pojo.Text;
import pojo.User;
import service.FocusService;
import service.UserService;

/**
 * @author win10
 *	关注默认某人 ✔
 *	取消关注✔
 *	查找某人的关注列表✔
 *	查找某人的粉丝列表✔
 *	查看是否关注某人（用于动态显示 是否关注某人）✔
 *	查看关注的人的文章
 */
@ResponseBody
@Controller
public class FocusController {

	@Autowired
	FocusService focusService;
	@Autowired
	UserService userService;
	
	@RequestMapping("focus")
	public Msg saveFocus(Focus focus) {
		User user = userService.getUserByUserId(focus.getFocusUserid());
		User user2 = userService.getUserByUserId(focus.getFocusBeuserid());
		int saveFocus=0;
		if (user != null && user2 != null) {
			saveFocus = focusService.saveFocus(focus);
		}
		if(saveFocus==1) {
			userService.updUserDataNumAdd("focus", focus.getFocusUserid());// 关注的人加一
			userService.updUserDataNumAdd("fan", focus.getFocusBeuserid());// 粉丝加一
			return Msg.success().add("saveFocus", true);
		}else {
			return Msg.failed().add("saveFocus", false);
		}
	}
	@RequestMapping(value="focus",method=RequestMethod.DELETE)
	public Msg delFocus(Focus focus) {
		int saveFocus = focusService.delFocus(focus);
		if(saveFocus==1) {
			userService.updUserDataNumSub("focus", focus.getFocusUserid());// 关注减一
			userService.updUserDataNumSub("fan", focus.getFocusBeuserid());// 粉丝减一
			return Msg.success().add("delFocus", true);
		}else {
			return Msg.failed().add("delFocus", false);
		}
	}
	@RequestMapping(value="focus/{userId}",method=RequestMethod.GET)//查看某人的关注列表
	public Msg getUserFocus(@PathVariable int userId,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		int pageSize=10;
		PageHelper.startPage(pageNum, pageSize);
		List<Focus> list = focusService.getUserFocus(userId);
		PageInfo pi=new PageInfo(list,5);
		pi.setPageSize(pageSize);
		if(list.size()!=0) {
			return Msg.success().add("getUserFocus", pi);
		}else {
			return Msg.failed().add("getUserFocus", false);
		}
	}
	@RequestMapping(value="focus/fans/{userId}",method=RequestMethod.GET)//查看某人的粉丝列表
	public Msg getUserFans(@PathVariable int userId,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		int pageSize=10;
		PageHelper.startPage(pageNum, pageSize);
		List<Focus> list = focusService.getUserFans(userId);
		PageInfo pi=new PageInfo<>(list,5);
		pi.setPageSize(pageSize);
		if(list.size()!=0) {
			return Msg.success().add("getUserFans", pi);
		}else {
			return Msg.failed().add("getUserFans", false);
		}
	}
	@RequestMapping(value="fansCheck",method=RequestMethod.GET)//查看某人是否关注你--也就是是否粉你
	public Msg getUserFans(Focus focus) {
		List<Focus> list = focusService.getUserCheckFocus(focus);
		if(list.size()!=0) {
			return Msg.success().add("getUserCheckFocus", true);
		}else {
			return Msg.failed().add("getUserCheckFocus", false);
		}
	}
	
	@RequestMapping(value="focusText",method=RequestMethod.GET)//查看关注的人的文章
	public Msg getUserFocusText(Focus focus,@RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum) {
		int pageSize=10;
		PageHelper.startPage(pageNum, pageSize);
		List<Text> list = focusService.getFocusText( focusService.getUserFocus(focus.getFocusUserid()));
		PageInfo pi=new PageInfo<>(list,5);
		pi.setPageSize(pageSize);
		if(list.size()!=0) {
			return Msg.success().add("getUserFocusText", pi);
		}else {
			return Msg.failed().add("getUserFocusText", false);
		}
	}
}
