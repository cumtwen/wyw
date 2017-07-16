package org.wyw.pupu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wyw.pupu.domain.Cart;
import org.wyw.pupu.domain.Order;
import org.wyw.pupu.service.CartService;
import org.wyw.pupu.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	
	@RequestMapping(value="/order")
	public String order(HttpServletRequest request,Model model,HttpSession session){
		int good_id =Integer.parseInt(request.getParameter("good_id"));
		String good_price =request.getParameter("good_price");
		int count =Integer.parseInt(request.getParameter("count"));
		Float total=count*Float.parseFloat(good_price);
		String state="待发货";
		String porr="确认收货";
		System.out.println(porr);
		if(session.getAttribute("numb")==null){
			return "login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		System.out.println(porr);
		orderService.insertorder( user_id, good_id, good_price,state, count,total,porr);
		System.out.println(porr);
		orderService.updategood(good_id, count);
		orderService.deletecart(user_id, good_id);
		orderService.updatesale(good_id, count);
		}
		int user_id=(Integer)session.getAttribute("numb");
		List<Order> order_1=orderService.ordergetAll(user_id);
		model.addAttribute("order",order_1);
		return"order";	
		
	}
	
	@RequestMapping(value="/premit")
	public String premit(HttpServletRequest request,Model model,HttpSession session){
		int id =Integer.parseInt(request.getParameter("id"));
		if(request.getParameter("state").equals("待发货")){
		String state="已收货";
		String porr="商品评价";
		orderService.updateorder(id,state,porr);
		int user_id=(Integer)session.getAttribute("numb");
		List<Order> order_1=orderService.ordergetAll(user_id);
		model.addAttribute("order",order_1);
		return "order";
		}else
		{
			int user_id=(Integer)session.getAttribute("numb");
			Order order_1=orderService.orderGet(user_id,id);
			model.addAttribute("order",order_1);
			return "remark";
		}
		
	}
	
	@RequestMapping(value="/myorder")
	public String myorder(Model model,HttpSession session){
		if(session.getAttribute("numb")==null){
			return "login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		List<Order> order_1=orderService.ordergetAll(user_id);
		model.addAttribute("order",order_1);
		return"order";
		}
	}
}
