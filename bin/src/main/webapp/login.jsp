<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
			#div1{
				color:red;
			}
	</style>
		<script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
		
</head>

<body>
	<h3>用户登陆界面</h3>
	<form action="login.do" method="post" onsubmit="return false;">
		用户名<input type="text" name="name" /><br /> 
		密码<input type="password"name="password" /><br /> 
		<input type="submit" value="登陆" /> 
	</form>
</body>
		<script type="text/javascript">
			$("form").submit(function(){
				$.ajax({
					type:"post",
					url:"login.do",
					data:$("form").serialize(),
					dataType:"json",
					success:function(data){
						if(data.code == 1){
							window.location.href = "index.html";
						}else{
							alert(data.info);
						}
					}
				})
			})
		</script>
</html>















