<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/2/27
  Time: 10:21 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注解@ModelAttribute实例</title>
</head>
<body>
    <form action="modelAttribute/testModelAttribute" method="post">
        用户名：<input type="text" name="uname"/><br/>
        密码：<input type="text" name="password"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
