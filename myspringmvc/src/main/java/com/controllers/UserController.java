package com.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bean.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession httpSession, RedirectAttributes redirectAttributes) {
		if (username == null || username.length() == 0) {
			System.out.println("用户名不能为空");
			redirectAttributes.addFlashAttribute("error", "用户名不能为空");
			return "redirect:/user/showlogin";
		}

		if (password == null || password.length() == 0) {
			redirectAttributes.addFlashAttribute("error", "密码不能为空");
			System.out.println("密码不能为空");
			return "redirect:/user/showlogin";
		}

		User user = userService.login(username, password);
		if (user != null) {
			System.out.println("登录成功: " + user);
			httpSession.setMaxInactiveInterval(30 * 60);
			httpSession.setAttribute("username", user.getUsername());
			return "redirect:/";
		} else {
			System.out.println("登录失败");
			redirectAttributes.addFlashAttribute("error", "登录失败");
			return "redirect:/user/showlogin";
		}

	}

	@RequestMapping(value = "/showlogin")
	public String showPage() {
		return "login";
	}

	@RequestMapping(value = "loginout", method = RequestMethod.GET)
	public String loginout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:/";
	}

}
