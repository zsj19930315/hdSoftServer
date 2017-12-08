<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>智能滴液管理系统</title>
<script src="http://how2j.cn/study/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#submit").click(function() {
		var action = $("#form").attr("action");
		var name = $("#name").val();
		var password = $("#password").val();
		$.ajax({
			url: action,
			data: {"name":name, "password":password},
			success: function(result) {
				if (result.code == '0') {
					alert(result.message)
				} else {
					var token = result.data;
					location.href = "view/index.do?token="+token;
				}
			}
		});
	});
});
</script>
</head>
<body>
	<div>
		<a href="http://www.fjiot.org.cn/Html/Main.asp">福建省物联网科学研究院</a>
		<h2>智能滴液管理系统</h2>
	</div>
	<div>
		<form id="form" action="user/login.do">
			<input id="name" type="text" placeholder="account"><br/>
			<input id="password" type="password" placeholder="password"><br/>
			<input id="submit" type="button" value="Login">
		</form>
	</div>
</body>
</html>