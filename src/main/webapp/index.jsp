<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/30
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>HelloSpringMvc</title>
</head>
<body>

<br>
<a href="springMvc/testSessionAttributes">testSessionAttributes</a>
<br>
<a href="springMvc/testMap">testMap</a>
<br>
<a href="springMvc/testModelAndView">testModelAndView</a>
<br>
<a href="springMvc/helloworld">Hello World</a>
<a href="springMvc/testMethod">testMethod</a>
<form action="springMvc/testMethod" method="post">
    <input type="submit" value="testMethodPost"/>
</form>
<br>
<a href="springMvc/testParamsAndHeader?userName=555&&age=3">testParamsAndHeader</a>
<br>
<a href="springMvc/testPathVariable/101">testPathVariable</a>
<br>
<a href="springMvc/testRequestParams?username=张三&&age=25">testRequestParams</a>
<br>
<a href="springMvc/testRequestHeader">testRequestHeader</a>
<br>
<a href="springMvc/testCookieValue">testCookieValue</a>
<br>
<form action="springMvc/testPOJOParams" method="post">
    姓名:<input type="text" name="name"/><br>
    年龄:<input type="number" name="age"/><br>
    省:<input type="text" name="address.province"/><br>
    市:<input type="text" name="address.city"/><br>
    <input type="submit" value="testPOJOParams"/>
</form>
</body>
</html>
