<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/1/19
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/add" method="post">
            <h1>记账</h1>
        类型:
        <cc:forEach items="${tList}" var="str">
        <input type="radio" name="type_id" value="${str.id}">${str.name}
        </cc:forEach>
        标题:<input name="title" type="text">
        日期:<input name="title_time" type="text">
        金额:<input name="price" type="text">
        说明:<input name="explain" type="text">
        <input type="submit" value="保存">
    </form>
</body>
</html>
