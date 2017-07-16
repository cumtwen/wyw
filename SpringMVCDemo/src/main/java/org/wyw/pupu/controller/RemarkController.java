package org.wyw.pupu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.wyw.pupu.service.RemarkService;

@Controller
public class RemarkController {
	@Autowired
	@Qualifier("remarkService")
	private RemarkService remarkService;

	@RequestMapping(value="/submit")
	public ModelAndView remark(ModelAndView mv,HttpSession session,int good_id,int order_id,String remark,String  logistics,String  quality,String service){
		int user_id1=(Integer)session.getAttribute("numb");
		remarkService.insRemark(user_id1, good_id, order_id, remark, logistics, quality, service);
		mv.setViewName("redirect:/myorder");
	    return mv;

	}
}
