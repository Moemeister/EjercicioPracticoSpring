<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/guardar" method="post" modelAttribute = "contribuyente">
		<select name="c_importancia">
			<c:forEach items="${importancia}" var="importancia">
				<option value="${importancia.c_importancia }">${importancia.s_importancia }</option>
			</c:forEach>
		</select><br>
		
		<label>Nombre: </label>
		<form:input type="text" path="s_nombre" name ="nombre" /><br>
		<label>Apellido: </label>
		<form:input type="text" path="s_apellido" name="apellido" /><br>
		<label>NIT: </label>
		<form:input type="text" path="s_nit" name="nit" /><br>
		<input type="submit" value="Guardar">
		
	</form:form>
		<form action="${pageContext.request.contextPath}/ver" method="get">
			<input type="submit" value="Ver Contribuyentes">
		</form>
</body>
</html>