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
	<table>
  <tr>
    <th>Nombre</th>
    <th>Apellido</th>
    <th>NIT</th>
    <th>Fecha</th>
    <th>Importancia</th>
    
  </tr>
  <c:forEach items="${contribuyente}" var="contribuyente">
  	<tr>
  		<td>${contribuyente.s_nombre}</td>
  		<td>${contribuyente.s_apellido}</td>
  		<td>${contribuyente.s_nit}</td>
  		<td>${contribuyente.delegateFecha}</td>
  		<td>${contribuyente.importancia.s_importancia}</td>
  	</tr>
  </c:forEach>
</table>

</body>
</html>