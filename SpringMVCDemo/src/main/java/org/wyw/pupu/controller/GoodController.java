package org.wyw.pupu.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wyw.pupu.domain.Good;
import org.wyw.pupu.domain.Remark;


@Controller
public class GoodController {
	@Autowired
	@Qualifier("GoodService")
	private org.wyw.pupu.service.GoodService GoodService;
	// 获得所有clothes的集合
		@RequestMapping(value="/clothes")
		 public String clothes(Model model){
			// 获得所有商品集合
			String type="clothes";
			List<Good> clothes_list = GoodService.typegetAll(type);
			// 将商品集合添加到model当中
			model.addAttribute("clothes_list", clothes_list);
			// 跳转到wenyibook页面
			return "clothes";
		}
		
		// 获得所有shoes的集合
				@RequestMapping(value="/shoes")
				 public String shoes(Model model){
					// 获得所有商品集合
					String type="shoes";
					List<Good> shoes_list = GoodService.typegetAll(type);
					// 将商品集合添加到model当中
					model.addAttribute("shoes_list", shoes_list);
					// 跳转到wenyibook页面
					return "shoes";
				}
				
				// 获得所有sport的集合
				@RequestMapping(value="/sport")
				 public String sport(Model model){
					// 获得所有商品集合
					String type="sport";
					List<Good> sport_list = GoodService.typegetAll(type);
					// 将商品集合添加到model当中
					model.addAttribute("sport_list", sport_list);
					// 跳转到wenyibook页面
					return "sport";
				}
				
				// 获得所有other的集合
				@RequestMapping(value="/other")
				 public String other(Model model){
					// 获得所有商品集合
					String type="other";
					List<Good> other_list = GoodService.typegetAll(type);
					// 将商品集合添加到model当中
					model.addAttribute("other_list", other_list);
					// 跳转到wenyibook页面
					return "other";
				}
				
				@RequestMapping(value ="/single")
				public String show(HttpServletRequest request,
						HttpSession session,
						Model model) {
					Integer good_id =Integer.parseInt( request.getParameter("id"));
					Good good=GoodService.show( good_id);
					List<Remark> remark_list = GoodService.remarkgetAll(good_id);
					model.addAttribute("good", good);
					System.out.println(good);
					model.addAttribute("remark_list",remark_list);
					System.out.println(remark_list);
					request.getSession().setAttribute("goodnumb",good.getId());
					return "single";
					
				}
				
				@RequestMapping(value="/index")
				public String hot(Model model){
					String now="hot";
					List<Good> hot_list=GoodService.nowgetAll(now);
					model.addAttribute("hot_list",hot_list);
					String now1="new";
					List<Good> new_list=GoodService.nowgetAll(now1);
					model.addAttribute("new_list",new_list);
					return"index";
				}
				
				// 获得所有上衣的集合
				@RequestMapping(value="/clothes1")
				 public String clothes1(Model model){
					// 获得所有商品集合
					String type1="clothes1";
					List<Good> clothes1_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("clothes1_list", clothes1_list);
					// 跳转到wenyibook页面
					return "item";
				}
				
				// 获得所有裤子的集合
				@RequestMapping(value="/clothes2")
				 public String clothes2(Model model){
					// 获得所有商品集合
					String type1="clothes2";
					List<Good> clothes2_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("clothes2_list", clothes2_list);
					// 跳转到wenyibook页面
					return "item";
				}
				
				// 获得所有套装的集合
				@RequestMapping(value="/clothes3")
				 public String clothes3(Model model){
					// 获得所有商品集合
					String type1="clothes3";
					List<Good> clothes3_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("clothes3_list", clothes3_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有套装的集合
				@RequestMapping(value="/clothes4")
				 public String clothes4(Model model){
					// 获得所有商品集合
					String type1="clothes4";
					List<Good> clothes4_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("clothes4_list", clothes4_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有亲子装的集合
				@RequestMapping(value="/clothes5")
				 public String clothes5(Model model){
					// 获得所有商品集合
					String type1="clothes5";
					List<Good> clothes5_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("clothes5_list", clothes5_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有凉鞋的集合
				@RequestMapping(value="/shoes1")
				 public String shoes1(Model model){
					// 获得所有商品集合
					String type1="shoes1";
					List<Good> shoes1_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("shoes1_list", shoes1_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有帆布鞋的集合
				@RequestMapping(value="/shoes2")
				 public String shoes2(Model model){
					// 获得所有商品集合
					String type1="shoes2";
					List<Good> shoes2_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("shoes2_list", shoes2_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有运动衣的集合
				@RequestMapping(value="/sport1")
				 public String sport1(Model model){
					// 获得所有商品集合
					String type1="sport1";
					List<Good> sport1_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("sport1_list", sport1_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有运动衣的集合
				@RequestMapping(value="/sport2")
				 public String sport2(Model model){
					// 获得所有商品集合
					String type1="sport2";
					List<Good> sport2_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("sport2_list", sport2_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有运动衣的集合
				@RequestMapping(value="/other1")
				 public String other1(Model model){
					// 获得所有商品集合
					String type1="other1";
					List<Good> other1_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("other1_list", other1_list);
					// 跳转到wenyibook页面
					return "item";
				}
				// 获得所有运动衣的集合
				@RequestMapping(value="/other2")
				 public String other2(Model model){
					// 获得所有商品集合
					String type1="other2";
					List<Good> other2_list = GoodService.type1getAll(type1);
					// 将商品集合添加到model当中
					model.addAttribute("other2_list", other2_list);
					// 跳转到wenyibook页面
					return "item";
				}
}
