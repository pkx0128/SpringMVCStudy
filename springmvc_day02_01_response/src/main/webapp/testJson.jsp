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
                //发送ajax请求
                $.ajax({
                    type:"post",
                    url:"user/testJson",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"name":"pantest","age":18}',
                    dataType:"json",
                    success: function(data){
                        alert(data);
                        alert(data.name);
                        alert(data.age);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <button id="btn">发送ajax</button>
</body>
</html>
