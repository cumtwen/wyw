<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>购物车</title>
<!-- 关于邮箱，电话要求的js -->
<script type="text/javascript" src="js/form.js"></script>
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
							<li  ><a href="mycount">我的账号</a>
								<ul >
									<li ><a href="clothes1" >账号信息</a></li>
									<li><a href="clothes2">修改信息</a></li>
									<li><a href="clothes3">修改密码</a></li>
									<li><a href="clothes4">修改密保</a></li>
								</ul>
							 </li>
							<li  ><a href="myorder">我的订单</a> </li>
							<li ><a href="mycart" > 我的购物车</a></li>
							<li > <a href="mycollect" >我的收藏</a> </li>	
							<li><div class="cart">
									<a href="mycart" class="cart-in"> </a>
								</div>
							  <div class="clearfix"></div>
							  </ul>
						    </div>
					      <div class="clearfix"></div>
						
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
							<li><a href="clothes1">上衣</a></li>
							<li><a href="clothes2">裤子</a></li>
							<li><a href="clothes3">套装</a></li>
							<li><a href="clothes4">裙子</a></li>
							<li><a href="clothes5">亲子装</a></li>
						</ul>
					</li>
					<li ><a href="shoes" >潮流童鞋</a>
						<ul class="drop">
							<li><a href="shoes1">凉鞋</a></li>
							<li><a href="shoes2">帆布鞋</a></li>
						</ul>
						</li> 						
					<li><a href="sport" >儿童运动</a>
						<ul class="drop">
							<li><a href="sport1">运动上衣</a></li>
							<li><a href="sport2">运动裤</a></li>
						</ul>
					</li>            
					<li><a href="other" >内衣配件</a>
						<ul class="drop">
							<li><a href="other1">内裤</a></li>
							<li><a href="other2">袜子</a></li>
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

	
	<div class="container">
		<div class="account" style="padding-bottom: 10px;">
			<h2 class="account-in">基本信息</h2>
				<div class="form-group">
				    <label for="exampleInputEmail1">邮&nbsp;箱</label>
				    <input name="email" class="form-control" id="exampleInputEmail1" placeholder="合法邮箱" value="${user.email}">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputphone">电话号</label>
				    <input name="phone" class="form-control" id="exampleInputphone" placeholder="电话号码" value="${user.phone}">
				  </div>
				    <div class="form-group">
				    <label for="exampleInputaddress">地址</label>
				    <input name="address" class="form-control" id="exampleInputaddress" placeholder="省市区" value="${user.address}">
				  </div>
		</div>
			<input type="submit" class="form-control" value="修改" style="margin-bottom:40px;background-color:red;" />
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
							<li><a href="contact">关于我们</a></li>
							<p>配送信息以商家发布信息为主</p>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>客户服务</h6>
						<ul>
							<li><a href="contact">联系我们</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>我的账户</h6>
						<ul>
							<li><a href="mycart">我的购物车</a></li>
							<li><a href="myorder">订单历史</a></li>
							<li><a href="mycollect">愿望清单</a></li>
					</div>
					<div class="footer-middle-in">
						<h6>额外功能</h6>
						<p>暂时未开放，敬请期待！</p>
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