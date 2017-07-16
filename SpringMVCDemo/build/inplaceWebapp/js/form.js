function validateForm(){
var x=document.forms["myForm"]["username"].value;
var y=document.forms["myForm"]["password"].value;
var z=document.forms["myForm"]["email"].value;
var q=document.forms["myForm"]["question"].value;
var a=document.forms["myForm"]["answer"].value;
var atpos=z.indexOf("@");
var dotpos=z.lastIndexOf(".");
if (atpos<1 || dotpos<atpos+2 || dotpos+2>=z.length){
	alert("不是一个有效的 e-mail 地址");
		return false;
}

if (x==null || x==""){
  alert("姓名必须填写");
  return false;
  }
if(y==null||y==""){
	alter("请设置6位数以上的密码")
  }

if (q==null || q==""){
  alert("请输入密保问题");
  return false;
  }
if (a==null || a==""){
	  alert("密保答案不能为空");
	  return false;
	  }
}


