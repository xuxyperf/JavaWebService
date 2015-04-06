<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.dpcbj.service.sign.ServiceProcess"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	session.setMaxInactiveInterval(15 * 60);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>BocDetachSign</title>
<script src="javascript/jquery-1.3.2.min.js" type="text/javascript"></script>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<style type="text/css">
.tabCon.sbtn {
	border: 2 none;
	width: 108px;
	height: 25px;
	cursor: pointer;
}
</style>
<body>
	<div class="tabCon" style="display:block;">
		<form>
			<tr>
				<!--td width="25%" colspan="2">欢迎使用BOC COM(DLL)中间服务器，提供COM接口压力测试服务。主要应用于证书签名、动态验证码、加密密钥。</td-->
			</tr>
			<table width="100%" border="0" cellpadding="2" cellspacing="8">
				<tr>
					<td width="25%" align="right">证书主题：</td>
					<td width="75%" colspan="2"><div class="txtbg">
							<input class="txt" id="certinfo" TABINDEX="1" style="width:55%" />
						</div>
					</td>
				</tr>
				<tr>
					<td align="right">原文：</td>
					<td colspan="2"><div class="txtbg">
							<input class="txt" id="srcstr" TABINDEX="3" style="width:55%" />
						</div>
					</td>
				</tr>
				<tr>
					<td align="right" colspan="2"><input type="button"
						class="sbtn" value="提交" TABINDEX="20" onclick="doSubmit()" />
					</td>
				</tr>
			</table>
		</form>
		<form action="ServiceSign" name="subForm" method="POST" />
		<input type="hidden" name="ServiceSign"
			value="com.dpcbj.service.sign.ServiceProcess.DetachSign"> <input
			type="hidden" name="certinfo" value="" /> <input type="hidden"
			name="srcstr" value="" />
		</form>
	</div>
</body>
</html>
<script type="text/javascript">
	function doSubmit() {
		var certinfo = jQuery.trim($("#certinfo").val());
		if (certinfo == "") {
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
		document.subForm.submit();
	}
</script>
