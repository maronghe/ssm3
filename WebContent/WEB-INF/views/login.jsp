<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title> 
</head>
<body>
  <h3>用户登录</h3>  <br>
  <form name="form1" method="post" action="${pageContext.request.contextPath}/user/validateUser">
    <table>
        <tr>
            <td><label>用户名：</label></td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="password" name="password"></td>
        </tr>        
        <tr>
            <td><input id="submit" type="submit" value="登录"></td>
			<td><a href="${pageContext.request.contextPath}">返回首页</a></td>            
        </tr>
    </table>
  </form>
</body>
</html>
