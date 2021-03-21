<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Test Page</title>
</head>
<body>
    <c:out value="<xmp>" escapeXml="true"></c:out>
    <h2>Hello! ${test}</h2>
    <div>JSP Version</div>
</body>
</html>