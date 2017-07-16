package org.wyw.pupu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.wyw.pupu.domain.User;
import org.wyw.pupu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


	@Controller
	public class UserController {
		@Autowired
		@Qualifier("userService")
		private UserService userService;

		@RequestMapping(value="/registerform",method=RequestMethod.POST)
		public String registeform(
				String username,String password,String email,String phone,String address,String question,String answer
				){
				userService.inUser(username, password, email, phone,address,question,answer);
			return "login";}

		@RequestMapping(value="/loginform",method=RequestMethod.POST)
		public ModelAndView login(String username,String password,
			ModelAndView mv,
			HttpSession session,
			HttpServletRequest request){
			session.setAttribute("numb",0);
			User user=userService.login(username,password);
			System.out.println(user);
			if(user!=null){
				session.setAttribute("user", user);
				System.out.println(user.getId());
				session.setAttribute("numb",user.getId());
				mv.setView(new RedirectView("/SpringMVCDemo/index"));
			}
			else{
				mv.addObject("message","用户名或密码错误，请重新输入！");
				mv.setViewName("login");
			}
			return mv;
		}
		@RequestMapping(value="/ifindpwd",method=RequestMethod.POST)
		public ModelAndView find(String username,String question,String answer,
			ModelAndView mv,
			HttpSession session){
			User user=userService.protect(username, question, answer);
			if(user!=null){
				session.setAttribute("user", user);
				mv.setView(new RedirectView("/SpringMVCDemo/findpwd"));
			}
			else{
				mv.addObject("message","验证失败！");
				mv.setViewName("findpwd");
			}
			return mv;
		}
		
		//修改密码
		@RequestMapping(value="/updatepwd",method=RequestMethod.POST)
		public ModelAndView updatepwd(String username,String password,String newpwd,
			ModelAndView mv,
			HttpSession session){
			
			Boolean b=userService.updatepwd(username, password,newpwd);
			
			if(b){
				mv.addObject("message","修改成功，请重新登陆！");
				mv.setViewName("login");
			}
			else{
				mv.addObject("message","验证失败，请输入正确密码！");
				mv.setViewName("updatepwd");
			}
			return mv;
		}
	}
