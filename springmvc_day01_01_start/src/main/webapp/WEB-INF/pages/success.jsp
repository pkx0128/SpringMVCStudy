<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/2/23
  Time: 6:00 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>success</title>
</head>
<body>

<h1>Success!!</h1>
<%--获取request请求域的内容--%>
<h2>${requestScope.get("userSession")}</h2>
<h2>${sessionScope}</h2>

</body>
</html>
