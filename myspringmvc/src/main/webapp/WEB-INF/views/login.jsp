<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<body>
  <div>
  <form action="login" method="post">
     username:<input type="text" name="username"/> <br /><br />
     password:<input type="password" name="password"/> <br />
     <button type="submit">登录</button> <button type="reset">重置</button>
  </form>
  ${error}
  </div>
 
</body>
</html>
