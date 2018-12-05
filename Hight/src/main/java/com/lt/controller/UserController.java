package com.lt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.pojo.User;
import com.lt.service.UserService;
import com.lt.utils.Utils;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String index(ModelMap map) throws Exception {
		List<User> list = userService.findList(null);
		if(list!=null) {
			map.addAttribute("list", list);
		}
		return "thymeleaf/demo/userList";
	}
	
	@RequestMapping("/add")
	public String add(User user,ModelMap map) throws Exception {
		if(user.getId()!=null || user.getId()!="") {
			map.addAttribute("user", user);
		}
		return "thymeleaf/demo/add";
	}
	
	@RequestMapping("/save")
	public String save(User user) throws Exception {
		if(user.getId()==null || user.getId()=="") {
			//保存数据
			user.setId(Utils.getNewId());
			userService.insert(user);
		}else {
			//修改数据
			userService.update(user);
		}
		return "redirect:/user/list";
	}
	
	@RequestMapping("/toEdit")
	public String toEdit(String id,ModelMap map) throws Exception {
		User user = userService.get(id);
		if(user!=null) {
			map.addAttribute("user", user);
		}
		return "thymeleaf/demo/add";
	}
	
	@RequestMapping("/delete")
	public String delete(String id) throws Exception {
		userService.delete(id);
		return "redirect:/user/list";
	}
}
