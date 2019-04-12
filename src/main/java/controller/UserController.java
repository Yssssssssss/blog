package controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import pojo.Msg;
import pojo.User;
import service.UserService;

/**
 * @author win10 功能点： 登陆✔ 注册✔ 修改个人信息 ✔ 查找/搜索某个人的信息（通过用户名进行查询）✔ 检查某个name是否存在✔
 *     
 */
@Controller
@ResponseBody
public class UserController {
    public static String FILE_REAL_PATH = "/www/server/apache-tomcat-8.5.32/webapps/blog/static/files/imgs";
    Logger logger= Logger.getLogger(UserController.class);
	@Autowired
	UserService userService;

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public Msg regist(User user ,HttpServletRequest req) {
		user.setUserRegistdate(new Date());
		user.setUserCollectionsnum(0);
		user.setUserFansnum(0);
		user.setUserTextsnum(0);
		user.setUserFocusnum(0);
		int regist = userService.saveUser(user);
		if (regist == 1) {
			return Msg.success().add("msg", "注册成功");
		} else {
			return Msg.failed().add("msg", "注册失败");
		}

	}
	@RequestMapping(value = "file", method = RequestMethod.POST)
	public Msg regist(MultipartFile file, HttpServletRequest req) {
		String photo = "";
		if (file != null) {
			String fileName = UUID.randomUUID().toString()
					+ file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.'));
			String path = req.getServletContext().getRealPath("static/files/imgs") + "/" + fileName;
			//String path =  FILE_REAL_PATH + fileName;
			 logger.error("path="+path);
			photo =fileName;
			try {
				FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
			} catch (IOException e) {
				e.printStackTrace();
				photo = "default.jpg";
			}
		} else {
			photo = "default.jpg";
		}
		System.out.println(photo);
		return Msg.success().add("headPortrait", photo);
	}
	// 登陆
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Msg login(User user) {
		int flag = userService.login(user);
		if (flag == 1) {
			return Msg.success().add("user", userService.getUserByUsername(user.getUserName()));
		} else {
			return Msg.failed().add("msg", "账号或密码错误");
		}
	}

	// 更改用户信息
	@RequestMapping(value = "user/{userId}", method = RequestMethod.PUT)
	public Msg updateUser(User user) {
		int i = userService.updUser(user);
		if (i == 1) {
			return Msg.success().add("updUser", true);
		} else {
			return Msg.failed().add("updUser", false);
		}
	}

	// 查找某个用户是否存在
	@RequestMapping(value = "user/{userName}", method = RequestMethod.GET)
	public Msg getUserByName(@PathVariable String userName) {
		User user = userService.getUserByUsername(userName);
		if (user != null) {
			return Msg.success().add("getUser", true);
		} else {
			return Msg.failed().add("getUser", false);
		}
	}
	// 查找某用户信息
		@RequestMapping(value = "userId/{userId}", method = RequestMethod.GET)
		public Msg getUserByName(@PathVariable int userId) {
			User user = userService.getUserByUserId(userId);
			if (user != null) {
				user.setUserPassword("***");
				return Msg.success().add("getUser", user);
			} else {
				return Msg.failed().add("getUser", false);
			}
		}
}
