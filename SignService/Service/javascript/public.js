$(document).ready(function(){
	setIframeHeigth();
});

document.oncontextmenu = function () {
	return false;
};

function setIframeHeigth(){
	var iframe = parent.document.getElementById("mainFrame");
	var footDefaultHeight = window.screen.height - 400;
	try{
		var bHeight = iframe.contentWindow.document.body.scrollHeight;
		var height = footDefaultHeight > bHeight ? footDefaultHeight : bHeight;
		iframe.height =  height;
		$(".al").css("height",height);
	}catch (ex){}
}

function setIframeHeigthByNum(top){
	var iframe = parent.document.getElementById("mainFrame");
	try{
		var bHeight = iframe.contentWindow.document.body.scrollHeight;
		var height = top > bHeight ? top : bHeight;
		iframe.height =  height;
		$(".al").css("height",height);
	}catch (ex){}
}

//返回值：arg1除以arg2的精确结果
function accDiv(arg1,arg2){
    var t1=0,t2=0,r1,r2;
    try{t1=arg1.toString().split(".")[1].length}catch(e){}
    try{t2=arg2.toString().split(".")[1].length}catch(e){}
    with(Math){
        r1=Number(arg1.toString().replace(".",""))
        r2=Number(arg2.toString().replace(".",""))
        return (r1/r2)*pow(10,t2-t1);
    }
}

//返回值：arg1乘arg2的精确结果
function accMul(arg1,arg2){
    var m=0,s1=arg1.toString(),s2=arg2.toString();
    try{m+=s1.split(".")[1].length}catch(e){}
    try{m+=s2.split(".")[1].length}catch(e){}
    return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m)
}

//返回值：arg1加上arg2的精确结果,若算减法，则把后面数变加个负号即可
function accAdd(arg1,arg2){
    var r1,r2,m;
    try{r1=arg1.toString().split(".")[1].length}catch(e){r1=0}
    try{r2=arg2.toString().split(".")[1].length}catch(e){r2=0}
    m=Math.pow(10,Math.max(r1,r2))
    return (arg1*m+arg2*m)/m
}

//重置table或div域id为obj中所有text文本框与下拉框
function resetRegion(obj){
	$("#" + obj).find("input[type='text']").each(function(){
		$(this).val("");
	})
	$("#" + obj + " select").each(function(){
		$(this)[0].selectedIndex = 0;
	});
}

function containSpecialss(s){
	var containSpecialss = RegExp(/[(\~)(\!)(\$)(\%)(\^)(\&)(\*)(\()(\))(\+)(\=)(\[)(\])(\{)(\})(\|)(\\)(\;)(\:)(\')(\")(\,)(\.)(\/)(\<)(\>)(\?)(\)]+/);
	return (containSpecialss.test(s));
}

function containSpecial2(s){
	var containSpecialss = RegExp(/[(\~)(\!)(\$)(\^)(\&)(\*)(\+)(\=)(\[)(\])(\{)(\})(\|)(\\)(\;)(\:)(\')(\")(\,)(\.)(\/)(\<)(\>)(\?)(\)]+/);
	return (containSpecialss.test(s));
}

function validateEmail(s){  //邮箱
	var reg = /^(?:\w|\.|-)+@(?:\w|-)+(?:\.(?:\w|-)+)+$/;
	return (reg.test(s));
}

function validatePhone(s){  //手机号码
	var reg = /^(0?\d{11})?$/;
	return (reg.test(s));
}

function validateTel(s){  //电话号码,传真
	var reg = /^(-|,|\d)*$/;
	return (reg.test(s));
}

function validatePost(s){  //邮政编码
	var reg = /^\d{6}$/;
	return (reg.test(s));
}

$("#biuuu_button").click(function(){ 
	$("#print").printArea(); 
});

function validateCustNo(custno){  //验证个人账号格式输入是否正确
	if(custno.length != 10){
		alert("个人账号输入位数不对!");
		return false;
	}
	var reg = /^\d{10}$/;
	if(reg.test(custno)){
		return true;
	}else{
		alert("个人公积账号输入格式不对!");
		return false;
	}
}

function validateNum(s){  //验证职工编号或被代理单位编码等是否是数字格式
	var reg = /^\d*$/;
	return reg.test(s);
}