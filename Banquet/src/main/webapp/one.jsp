<%--
  Created by IntelliJ IDEA.
  User: xiaom
  Date: 2024/7/27
  Time: 上午10:14
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
    <title>起始页</title>
</head>
<body>

<jsp:forward page="index"/>

</body>
</html>
