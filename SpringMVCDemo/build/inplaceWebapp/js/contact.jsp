<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>联系我们</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='https://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
				</script>
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>				
</head>
<body>
  <!--header-->
	<div class="header">
		<div class="header-top">
			<div class="container">	
			<div class="header-top-in">			
				<div class="logo">
					<a href="index"><img src="images/logo.png" alt=" " ></a>
				</div>
				<div class="header-in">
					<ul class="icon1 sub-icon1">
							<li  ><a href="order">我的订单</a> </li>
							<li ><a href="cart" > 购物车</a></li>
							<li > <a href="collect" >收藏</a> </li>	
							<li><div class="cart">
									<a href="cart" class="cart-in"> </a>
									<span> 0</span>
								</div>
								<ul class="sub-icon1 list">
						  <h3>最近添加(2)</h3>
						  <div class="shopping_cart">
							  <div class="cart_box">
							   	 <div class="message">
							   	     <div class="alert-close"> </div> 
					                <div class="list_img"><img src="images/p1.jpg" class="img-responsive" alt=""></div>
								    <div class="list_desc"><h4><a href="#">小西服</a></h4>1 x<span class="actual">
		                             $112.00</span></div>
		                              <div class="clearfix"></div>
	                              </div>
	                            </div>
	                            <div class="cart_box1">
								  <div class="message1">
							   	     <div class="alert-close1"> </div> 
					                <div class="list_img"><img src="images/p2.jpg" class="img-responsive" alt=""></div>
								    <div class="list_desc"><h4><a href="#">公主裙</a></h4>1 x<span class="actual">
		                             $120.00</span></div>
		                              <div class="clearfix"></div>
	                              </div>
	                            </div>
	                        </div>
	                        <div class="total">
	                        	<div class="total_left">总计 : </div>
	                        	<div class="total_right">$232.00</div>
	                        	<div class="clearfix"> </div>
	                        </div>
                            <div class="login_buttons">
							  <div class="check_button"><a href="cart">查看</a></div>
							  <div class="clearfix"></div>
						    </div>
					      <div class="clearfix"></div>
						</ul>
							</li>
						</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			</div>
		</div>
		<div class="header-bottom">
		<div class="container">
			<div class="h_menu4">
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
					<li class="active"><a href="index"><i> </i>首页</a></li>
					<li ><a href="clothes">精选童装</a>
						<ul class="drop">
							<li><a href="products.html">上衣</a></li>
							<li><a href="products.html">裤子</a></li>
							<li><a href="products.html">套装</a></li>
							<li><a href="products.html">裙子</a></li>
							<li><a href="products.html">亲子装</a></li>
						</ul>
					</li>
					<li ><a href="shoes" >潮流童鞋</a>
						<ul class="drop">
							<li><a href="products.html">凉鞋</a></li>
							<li><a href="products.html">亲子鞋</a></li>
							<li><a href="products.html">帆布鞋</a></li>
							<li><a href="products.html">皮鞋</a></li>
							<li><a href="products.html">学步鞋</a></li>
						</ul>
						</li> 						
					<li><a href="sport" >儿童运动</a>
						<ul class="drop">
							<li><a href="products.html">运动上衣</a></li>
							<li><a href="products.html">冲锋衣</a></li>
							<li><a href="products.html">运动裤</a></li>
							<li><a href="products.html">运动鞋</a></li>
						</ul>
					</li>            
					<li><a href="other" >内衣配件</a>
						<ul class="drop">
							<li><a href="products.html">内裤</a></li>
							<li><a href="products.html">袜子</a></li>
							<li><a href="products.html">书包</a></li>
							<li><a href="products.html">饰品</a></li>
						</ul>						
					</li>
						<li><a href="contact" >联系我们 </a></li>
				</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
		</div>
		</div>
		<div class="header-bottom-in">
			<div class="container">
			<div class="header-bottom-on">
			<c:if test="${sessionScope.user.username!=null}"><p class="wel">欢迎您，${sessionScope.user.username}&nbsp;&nbsp;&nbsp;&nbsp;</p></c:if>
			<c:if test="${sessionScope.user.username==null}">
			<p class="wel"><a href="login">亲，请登录&nbsp;&nbsp;&nbsp;&nbsp;</a></p>
			&nbsp;
			<p class="wel"><a href="register">&nbsp;&nbsp;免费注册</a></p>
			</c:if>
			<div class="clearfix"></div>
		</div>
		</div>
		</div>
	</div>
		<div class="container">
			<div class="contact">
			<h2 class=" contact-in">联系我们</h2>
				
				<div class="col-md-6 contact-top">
					<h3>关于我们</h3>
					<img  src="images/001.jpg" width="100%" alt="" />
					<p>我们坚持诚信经营，大量品牌直供从源头杜绝假货，对假冒伪劣商品“零容忍”，通过严审商家资质、严控进货渠道、自主研发质控系统等六大举措确保正品行货。坚守“正道成功”的价值取向，坚定地呼吁用合法方式获得商业成功。 </p>
					<p>我们致力于还孩子一个美好的童年，一个舒适的童年！ </p>				
					<ul class="social ">
						<li><span><i > </i>中国矿业大学</span></li>
						<li><span><i class="down"> </i>18205208223</span></li>
						<li><a href="mailto:821020776@qq.com"><i class="mes"> </i>821020776@qq.com</a></li>
					</ul>
				</div>
				<div class="col-md-6 contact-top">
					<h3>如果你想加入我们</h3>
						<form>
						<div>
							<span>姓名 </span>		
							<input type="text" value="" >						
						</div>
						<div>
							<span>邮箱</span>		
							<input type="text" value="" >						
						</div>
						<div>
							<span>学历</span>		
							<input type="text" value="" >	
						</div>
						<div>
							<span>个人简介</span>		
							<textarea> </textarea>	
						</div>
						<input type="submit" value="SEND" >	
						</form>
				</div>
			<div class="clearfix"> </div>
		</div>
	</div>
		<!---->
		<div class="footer">
			<div class="footer-top">
				<div class="container">
					<div class="col-md-4 footer-in">
					<br /><br />
						<h4><i> </i>卖家实名认证</h4>
						</div>
					<div class="col-md-4 footer-in">
					<br /><br />
						<h4><i class="cross"> </i>专业团队支持</h4>
					</div>
					<div class="col-md-4 footer-in">
					<br /><br />
						<h4><i class="down"> </i>客服</h4>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!---->
			<div class="footer-middle">
				<div class="container">
					<div class="footer-middle-in">
						<h6>关于我们</h6>
						<p>专注于精品，注重舒适，给孩子以舒适体验</p>
					</div>
					<div class="footer-middle-in">
						<h6>信息</h6>
						<ul>
							<li><a href="#">关于我们</a></li>
							<li><a href="#">配送信息</a></li>
							<li><a href="#">条款和条件</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>客户服务</h6>
						<ul>
							<li><a href="contact.html">联系我们</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>我的账户</h6>
						<ul>
							<li><a href="account.html">我的账户</a></li>
							<li><a href="#">订单历史</a></li>
							<li><a href="wishlist.html">愿望清单</a></li>
					</div>
					<div class="footer-middle-in">
						<h6>额外功能</h6>
						<ul>
							<li><a href="#">品牌</a></li>
							<li><a href="#">购物券</a></li>
							<li><a href="#">特权</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

		</div>
</body>
</html>