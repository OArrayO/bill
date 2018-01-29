<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/1/16
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
            <h1>记账管理</h1>
        <form action="/proList" method="get">
            类型:<select id="fild" name="fild">
            <option value="-1">全部</option>
            <option value="0">支出</option>
            <option value="1">收入</option>
            <option value="2">还入</option>
        </select>
        <script>
            form.fild.value='${bool}'
        </script>
        时间:从<input name="frdate" type="text">到<input name="twDate" type="text"><input type="submit" value="查询"> <a href="/add">记账</a>

        </form>
            <table>
                <tr>
                    <td>标题</td>
                    <td>记账时间</td>
                    <td>类别</td>
                    <td>金额</td>
                    <td>说明</td>
                </tr>
                <cc:forEach items="${BList}" var="stu">
                    <tr>
                   <td> ${stu.title}</td>
                        <td>     ${stu.title_time}</td>
                        <td>  ${stu.name}</td>

                        <td>    ${stu.price}</td>
                        <td>   ${stu.explain}</td>
                    </tr>
                </cc:forEach>

            </table>
            <a href="proList?pageIndex=${pojobill.pageIndex-1}&fild=${fild}&frdate=${frdate}&twDate=${twDate}">上一页</a>
            <a href="proList?pageIndex=${pojobill.pageIndex+1}&fild=${fild}&frdate=${frdate}&twDate=${twDate}">下一页</a>

</body>
</html>
