package sy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import sy.model.User;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	protected Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private UserServiceI userService;

	@RequestMapping("/success")
	@ResponseBody
	public String success(String name, String gender) {
		log.info(name + "\t" + gender);
		return "success";
	}

	@RequestMapping("/form")
	public String form() {
		return "form";
	}

	@RequestMapping("/showUser/{id}")
	public String showUser(@PathVariable Integer id, HttpServletRequest request) {
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		return "showUser";
	}

	@RequestMapping(value = "/getUserJson")
	@ResponseBody
	public String getUserJson() {
		List<User> users = userService.selectAll();
		return JSON.toJSONStringWithDateFormat(users, "yyyy-MM-dd HH:mm:ss");
	}

	@RequestMapping(value = "/addUser")
	@ResponseBody
	public String addUser(User user) {
		log.info(JSON.toJSON(user));
		return JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd HH:mm:ss");
	}
}
