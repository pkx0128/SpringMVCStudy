<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/3/8
  Time: 9:59 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <h1>List</h1>
    <c:forEach items="${list}" var="account">
        id:${account.id},name:${account.name},money:${account.money}<hr/>
    </c:forEach>
</body>
</html>
