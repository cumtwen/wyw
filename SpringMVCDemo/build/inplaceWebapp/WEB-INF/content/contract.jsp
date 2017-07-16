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
							<li  ><a href="wishlist.html">我的订单</a> </li>
							<li  ><a href="account.html"> 我的账户</a></li>
							<li ><a href="#" > 购物车</a></li>
							<li > <a href="checkout.html" >收藏</a> </li>	
							<li><div class="cart">
									<a href="#" class="cart-in"> </a>
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
							  <div class="check_button"><a href="checkout.html">查看</a></div>
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
					<li class="active"><a href="clothes"><i> </i>精选童装</a>
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
			<p class="wel"><a href="login">亲，请登录&nbsp;&nbsp;&nbsp;&nbsp;</a></p>
			&nbsp;
			<p class="wel"><a href="register">&nbsp;&nbsp;免费注册</a></p>
			<div class="clearfix"></div>
		</div>
		</div>
		</div>
	</div>
		<div class="container">
			<div class="contact">
			<h2 class=" contact-in">CONTACT</h2>
				
				<div class="col-md-6 contact-top">
					<h3>Info</h3>
					<div class="map">
						<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d37494223.23909492!2d103!3d55!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x453c569a896724fb%3A0x1409fdf86611f613!2sRussia!5e0!3m2!1sen!2sin!4v1415776049771"></iframe>
					</div>
					
					<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas </p>
					<p>Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id </p>				
					<ul class="social ">
						<li><span><i > </i>124 Avenue Street, Los angeles,California </span></li>
						<li><span><i class="down"> </i>+ 00 123 456 7890</span></li>
						<li><a href="mailto:info@example.com"><i class="mes"> </i>info@example.com</a></li>
					</ul>
				</div>
				<div class="col-md-6 contact-top">
					<h3>Want to work with me?</h3>
						<form>
						<div>
							<span>Your Name </span>		
							<input type="text" value="" >						
						</div>
						<div>
							<span>Your Email </span>		
							<input type="text" value="" >						
						</div>
						<div>
							<span>Subject</span>		
							<input type="text" value="" >	
						</div>
						<div>
							<span>Your Message</span>		
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
						<h4><i> </i>Suspendisse sed</h4>
						<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="cross"> </i>Suspendisse sed</h4>
						<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="down"> </i>Suspendisse sed</h4>
						<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!---->
			<div class="footer-middle">
				<div class="container">
					<div class="footer-middle-in">
						<h6>About us</h6>
						<p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>
					</div>
					<div class="footer-middle-in">
						<h6>Information</h6>
						<ul>
							<li><a href="#">About Us</a></li>
							<li><a href="#">Delivery Information</a></li>
							<li><a href="#">Privacy Policy</a></li>
							<li><a href="#">Terms & Conditions</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>Customer Service</h6>
						<ul>
							<li><a href="contact.html">Contact Us</a></li>
							<li><a href="#">Returns</a></li>
							<li><a href="#">Site Map</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>My Account</h6>
						<ul>
							<li><a href="account.html">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="wishlist.html">Wish List</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>Extras</h6>
						<ul>
							<li><a href="#">Brands</a></li>
							<li><a href="#">Gift Vouchers</a></li>
							<li><a href="#">Affiliates</a></li>
							<li><a href="#">Specials</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<p class="footer-class">Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
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