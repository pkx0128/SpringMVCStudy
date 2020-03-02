<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/3/2
  Time: 11:27 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件实例</title>
</head>
<body>
<%--    <a href="user/fileupload1">上传文件实例</a>--%>
       <form action="user/fileupload1" method="post" enctype="multipart/form-data">
            选择文件：<input type="file" name="upload"/><br/>
                    <input type="submit" value="上传"/>
        </form>
</body>
</html>
