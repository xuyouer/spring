<%--
  Created by IntelliJ IDEA.
  User: xiaom
  Date: 2024/7/27
  Time: 下午3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%
    // String pathname = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    // pageContext.setAttribute("path", pathname);

    String protocol = request.getHeader("X-Scheme") != null ? request.getHeader("X-Scheme") : request.getScheme();
    String pathname = protocol + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    pageContext.setAttribute("path", pathname);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <base href="<%=pathname %>"/>
    <title><spring:message code="xiaomizha.cloud"/> | <spring:message code="user.register"/></title>
    <link rel="stylesheet" href="css/initial.css">
    <link rel="stylesheet" href="css/normal.css">
    <link rel="stylesheet" href="css/login.css">
    <script src="js/jquery-3.7.1.js"></script>
    <script src="js/normal.js"></script>
    <script src="js/login.js"></script>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</head>
<body>

<div id="login">
    <div id="login-container">
        <div id="section">
            <spring:message code="user.register"/>
            ${originalRequest}
        </div>
    </div>
</div>

</body>
</html>
