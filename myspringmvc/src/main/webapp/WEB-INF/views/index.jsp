<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>homepage</title>
<body>
<h2>Hello World!</h2>
<a href="hello?name=zhangsan">click</a>
<c:if test="${username==null || username.length()==0}">
<a href="user/showlogin">登录</a>
</c:if>
<c:if test="${username!=null}">
<a href="user/loginout">注销登录</a>
</c:if>

</body>
</html>
