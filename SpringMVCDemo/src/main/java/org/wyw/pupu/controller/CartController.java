package org.wyw.pupu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wyw.pupu.domain.Cart;
import org.wyw.pupu.service.CartService;

@Controller
public class CartController {
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	

	@RequestMapping(value="/cart")
	public String cart(HttpServletRequest request,Model model,HttpSession session){
		int good_id =Integer.parseInt(request.getParameter("good_id"));
		System.out.println(good_id);
		String good_price =request.getParameter("good_price");
		System.out.println(good_price);
		if(session.getAttribute("numb")==null){
			return "login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		Cart cart=cartService.cartSelect(user_id, good_id);
		int count;
		if(cart!=null){
			int a=cart.getCount();
			count=a+1;
			cartService.updateCart(user_id, good_id, count);
		}else{
			count=1;
			cartService.inCart(user_id, good_id, count, good_price);
		}
		List<Cart> cart_1=cartService.cartgetAll(user_id);
		model.addAttribute("cart", cart_1);
		return "cart";
					}
	}
	
	@RequestMapping(value="/mycart")
	public String mycart(HttpServletRequest request,Model model,HttpSession session){
		if(session.getAttribute("numb")==null){
			return "login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		List<Cart> cart_1=cartService.cartgetAll(user_id);
		model.addAttribute("cart", cart_1);
		return "cart";
	}
	}
	
	@RequestMapping(value="/removecart")
	public String removecart(HttpServletRequest request,Model model,HttpSession session){
		if(session.getAttribute("numb")==null){
			return "login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		cartService.delAll(user_id);
		List<Cart> cart_1=cartService.cartgetAll(user_id);
		model.addAttribute("cart", cart_1);
		return "cart";
	}
	}
	
	@RequestMapping(value="/delcart")
	public String delcart(HttpServletRequest request,Model model,HttpSession session){
		int good_id =Integer.parseInt(request.getParameter("good_id"));
		System.out.println(good_id);
		if(session.getAttribute("numb")==null){
			return "login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		cartService.delCart(user_id, good_id);
		List<Cart> cart_1=cartService.cartgetAll(user_id);
		model.addAttribute("cart", cart_1);
		return "cart";
	}
	}
	
	@RequestMapping(value="/reducecart")
	public String reducecart(HttpServletRequest request,Model model,HttpSession session){
		int good_id =Integer.parseInt(request.getParameter("good_id"));
		System.out.println(good_id);
		if(session.getAttribute("numb")==null){
			return "login";
		}else{
		int user_id=(Integer)session.getAttribute("numb");
		Cart cart=cartService.cartSelect(user_id, good_id);
		int count;
			int a=cart.getCount();
			count=a-1;
			if(count<1){
				cartService.delCart(user_id, good_id);
			}else{
			cartService.updateCart(user_id, good_id, count);
			}
			List<Cart> cart_1=cartService.cartgetAll(user_id);
		model.addAttribute("cart", cart_1);
		return "cart";
					}
	}
}