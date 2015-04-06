<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>信息管理-性能测试服务系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="css/main.css" rel="stylesheet" type="text/css" />
		<script src="javascript/jquery-1.3.2.min.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="mainDiv">
			<div class="header">
				<div class="logo"></div>
				<div class="sbar">
					<table border="0" cellspacing="0" cellpadding="0" height="28">
						<tr>
							<td><img src="images/sbl.jpg" /></td>
							<td>欢迎您:性能测试团队&nbsp;|&nbsp;<a href="javascript:void(0)" onclick="goHome()">首页</a>&nbsp;</td>
							<td><img src="images/sbr.jpg" /></td>
						</tr>
					</table>
				</div>
			</div>
			<div class="mainbox">
				<div class="left">
					<div id="menu">
						<ul>  
							<h1><div class="ic_1"></div>主菜单</h1>
							<li><a href="javascript:void(0)" alt="SignService" onclick="clickChildMenu(this);">电子支付证书签名</a></li>
						</ul>
					</div>
				</div>
				<div class="main">
			    	<iframe src="welcome.jsp" frameborder="0" id="mainFrame" width="780px" scrolling="no"></iframe>
				</div>
			</div>
			<div class="clear"></div>
			<div class="footer">
				Copyright&copy;2013&nbsp;&nbsp;性能测试服务系统&nbsp;&nbsp;版权所有</br>
				<span style="color:rgb(217,217,217);">Powered by Xuxy</span>
			</div>
		</div>
		<form name="logoff" action="logoff"></form>
	</body>
</html>
<script type="text/javascript">
	$("#menu li a").mouseover(function(){$(this).addClass("on");});   
	$("#menu li a").mouseout(function(){$(this).removeClass("on");});   
	$("h1").click(function(){   
		$(this).next("ul").slideToggle(50).siblings("ul").slideUp(50);
		$(this).toggleClass("on");
		$(this).siblings("h1").removeClass("on");
	});
	
	function clickChildMenu(obj){
		$("#menu a").each(function(){
			$(this).removeClass("visit");
		});
		$(obj).addClass("visit");
		$("#mainFrame").attr("src","signservice.jsp");
	}
	
	function goHome(){
		$("#menu a").each(function(){
			$(this).removeClass("visit");
		});
		$("#mainFrame").attr("src","welcome.jsp");	
	}
	
	function dologoff(){
		if(window.confirm("确定退出吗?")){
			document.logoff.submit();
		}
	}
	
	document.oncontextmenu = function () {
		return false;
	};
</script>