<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.ipartek.formacion.ejemplocapas.pojos.Usuario"%>
    <%
    Object objeto = session.getAttribute("usuario");
    Usuario usuario=(Usuario)objeto;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hola <%= ((Usuario)session.getAttribute("usuario")).getEmail() %></h1>
</body>
</html>