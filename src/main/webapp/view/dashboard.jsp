<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome dashboard</h1>
<h2>${msg}</h2>
<form:form modelAttribute="msg">
<form:select path="productId">
<form:options items="${ob}" />
</form:select>
</form:form>
</body>
</html>