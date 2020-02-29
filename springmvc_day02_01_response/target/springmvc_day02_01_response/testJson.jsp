<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/2/29
  Time: 2:48 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.8.0.min.js"></script>
    <script>
        $(function(){
            $("#btn").click(function(){
                alert("ajax btn");
            });
        });
    </script>
</head>
<body>
    <button id="btn">发送ajax</button>
</body>
</html>
