package org.wyw.pupu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.wyw.pupu.domain.Cart;
import org.wyw.pupu.domain.Collect;
import org.wyw.pupu.service.CollectService;

@Controller
public class CollectController {
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;
	
	@RequestMapping(value="/collect")
	public String collect(HttpServletRequest request,Model model,ModelAndView mv,HttpSession session){
		int good_id =Integer.parseInt(request.getParameter("good_id"));
		System.out.println(good_id);
		String good_price =request.getParameter("good_price");
		System.out.println(good_price);
		if(session.getAttribute("numb")==null){
			return"login";
		}else{
			int user_id=(Integer)session.getAttribute("numb");
			Collect collect=collectService.collectfind(user_id, good_id);
			if(collect!=null){
				mv.addObject("message","您之前已经收藏该商品！");
				mv.setViewName("index"); 
			}else{
				collectService.insertcollect(user_id, good_id, good_price);
			}
			List<Collect> collect_1=collectService.collectgetAll(user_id);
			model.addAttribute("collect", collect_1);
		return"collect";
			
		}
	}
	
	@RequestMapping(value="/mycollect")
	public String mycollect(Model model,HttpSession session){
		if(session.getAttribute("numb")==null){
			return"login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		List<Collect> collect_1=collectService.collectgetAll(user_id);
		model.addAttribute("collect",collect_1);
		return"collect";
		}
	}
	
	@RequestMapping(value="/delcollect")
	public String delcollect(Model model,HttpServletRequest request,HttpSession session){
		int user_id=(Integer)session.getAttribute("numb");
		int good_id =Integer.parseInt(request.getParameter("good_id"));
		collectService.delcollect(user_id, good_id);
		List<Collect> collect_1=collectService.collectgetAll(user_id);
		model.addAttribute("collect",collect_1);
		return"collect";
	}
	
	@RequestMapping(value="/removecollect")
	public String delAllcollect(HttpSession session,Model model){
		int user_id=(Integer)session.getAttribute("numb");
		collectService.delAllcollect(user_id);
		List<Collect> collect_1=collectService.collectgetAll(user_id);
		model.addAttribute("collect",collect_1);
		return"collect";
	}
}
