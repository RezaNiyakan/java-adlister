<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: rezaniyakan
  Date: 2/6/22
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Final Result</title>
</head>
<a>
    <c:choose>
        <c:when test="${result}">
            <h1>Winner winner</h1>
        </c:when>
        <c:otherwise>
            <h1>Better luck next time</h1>
        </c:otherwise>
    </c:choose>
    a href="/guess">Play again?</a>
</body>
</html>
