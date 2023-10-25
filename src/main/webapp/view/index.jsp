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
<h1>Product Form</h1>
<form:form action="saveproduct" modelAttribute="product"><br>
product id:<form:input path="productId"/><br/><br><br>
product Name:<form:input path="productName"/><br/><br>
product Price:<form:input path="productPrice"/><br/><br>

<input type="submit" value="save"/>
</form:form>

</body>
</html>