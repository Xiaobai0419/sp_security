<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/23
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
<h1>标题: ${title}</h1>
<h1>消息 : ${message}</h1>

<c:if test="${pageContext.request.userPrincipal.name != null}">
    <h2>欢迎: ${pageContext.request.userPrincipal.name}
        | <a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>
</c:if>
</body>
</html>
