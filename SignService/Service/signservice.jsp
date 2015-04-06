<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.dpcbj.service.sign.ServiceProcess"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>信息管理-性能测试服务系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/inquiry.css" rel="stylesheet" type="text/css" />
<script src="javascript/jquery-1.3.2.min.js" type="text/javascript"></script>
</head>
<body>
	<div class="tit">
		<div class="titr"></div>
		<div class="titl"></div>
		&nbsp;&nbsp;欢迎页面
	</div>
	<div class="wvinfo">
		<div class="bgl"></div>
		<div class="bgr"></div>
		<div class="title"></div>
		<div class="con">
			<form>
				<tr>
					<!--td width="25%" colspan="2">欢迎使用BOC COM(DLL)中间服务器，提供COM接口压力测试服务。主要应用于证书签名、动态验证码、加密密钥。</td-->
				</tr>
				<table width="100%" border="0" cellpadding="2" cellspacing="8">
					<tr>
						<td align="right">调用类型：</td>
						<td colspan="2">
							<div class="selbg">
								<select id="callkind" name="callkind" class="sel" TABINDEX="2">
									<option value="A">签名服务器</option>
									<option value="B">COM服务器</option>
								</select>
							</div></td>
					</tr>
					<tr>
						<td width="25%" align="right">证书主题：</td>
						<td width="55%" colspan="2"><div class="txtbg">
								<input class="txt" id="certinfo" TABINDEX="1" style="width:98%" />
							</div></td>
					</tr>
					<tr>
						<td align="right">原文：</td>
						<td colspan="2"><div class="txtbg">
								<input class="txt" id="srcstr" TABINDEX="3" style="width:98%" />
							</div></td>
					</tr>
					<tr>
						<td align=right></td>
						<td align=right colspan="2"><input type="button"
							class="sbtn" value="提交" TABINDEX="20" onclick="doSubmit()" /></td>
						<td align=right></td>					
					</tr>
				</table>
			</form>
			<form action="ServiceSign" name="subForm" method="POST" />
			 <input type="hidden" name="ServiceSign" value="com.dpcbj.service.sign.ServiceProcess.DetachSign">
			 <input type="hidden" name="certinfo" value="" /> 
			 <input type="hidden" name="srcstr" value="" />
	    	<input type="hidden" name="callkind" value=""/>			 
			</form>
		</div>
	</div>
	<div class="prompt">
		<div class="title">系统提示:</div>
		<div class="con">欢迎使用BOC COM(DLL)中间服务器，提供COM接口压力测试服务。主要应用于证书签名、动态验证码、加密密钥。</div>
	</div>
</body>
</html>
<script src="javascript/public.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	function doSubmit() {
		var certinfo = jQuery.trim($("#certinfo").val());
		var calltype = document.getElementById('callkind').value;
		if (certinfo == "" && calltype == "B") {
			alert("请输入证书主题!");
			return;
		}
		var srcstr = jQuery.trim($("#srcstr").val());
		if (srcstr == "") {
			alert("请输入原文!");
			return;
		}
		document.subForm.certinfo.value = certinfo;
		document.subForm.srcstr.value = srcstr;
		document.subForm.callkind.value = calltype;
		document.subForm.submit();
	}
</script>