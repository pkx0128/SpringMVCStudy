<%--
  Created by IntelliJ IDEA.
  User: pankx
  Date: 2020/2/24
  Time: 11:14 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBean作为参数传递</title>
</head>
<body>
<%--    <form action="params/javaBeanParams" method="post">--%>
<%--        姓名：<input type="text" name="name"/><br/>--%>
<%--        年龄：<input type="text" name="age"/><br/>--%>
<%--        性别：<input type="text" name="sex"/><br/>--%>
<%--        用户名：<input type="text" name="List[0].uname"/><br/>--%>
<%--        密码：<input type="text" name="List[0].upassword"/><br/>--%>
<%--        用户名：<input type="text" name="Map['one'].uname"/><br/>--%>
<%--        密码：<input type="text" name="Map['one'].upassword"/><br/>--%>

<%--        <input type="submit" value="提交"/>--%>

<%--    </form>--%>

    <form action="params/defType" method="post">
        姓名：<input type="text" name="name"/><br/>
        年龄：<input type="text" name="age"/><br/>
        性别：<input type="text" name="sex"/><br/>
        生日：<input type="text" name="birthday"/><br/>
        <input type="submit" value="提交"/>

    </form>
</body>
</html>
