<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/2/26
  Time: 6:24 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注解@RequestBody实例</title>
</head>
<body>
    <form action="requestbody/requestBodyDemo" method="post">
        姓名：<input type="text" name="name"/><br/>
        年龄：<input type="text" name="age"/><br/>
        <input type="submit" value="提交"/>

    </form>
</body>
</html>
