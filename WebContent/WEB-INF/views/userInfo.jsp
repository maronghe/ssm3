<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户基本信息</title>
</head>
<body>
  <form name="userInfo" action="${pageContext.request.contextPath}/user/updateUser" method="post">
	<table>	  
	  <tr>
	   <td>用户名：<input type="hidden" name="userId" value="${requestScope.user.userId }"></td>
	   <td><input type="text" name="userName" readonly value="${requestScope.user.userName }"/></td>
	  </tr>
	  <tr>
	   <td>密码：</td>
	   <td><input type="password" name="password" value="${requestScope.user.password}"></td>
	  </tr>
	  <tr>
	   <td>全名：</td>
	   <td><input type="text" name="name" value="${requestScope.user.name }"/></td>
	  </tr>
	  <tr>
	    <td><input type="submit" value="修改"></td>
	    <td><a href="${pageContext.request.contextPath}/user/userlist">返回用户列表</a> <br></td>
	  </tr>	
	</table>
  </form>
</body>
</html>
