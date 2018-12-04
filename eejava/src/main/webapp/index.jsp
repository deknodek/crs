<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="generator" content="Notepad++">
	<title>EJEMPLO UNO</title>
</head>
<body>
<h2>Hola a todos</h2>
<%-- Scriptlets  --%>

<%-- con igual lo muestra como el echo  --%>
<%= new java.util.Date() %>

<%
for(int i=1;i<7;i++){%>

	<h<%=i %>>Titulo<%=i %></h<%=i %>>
<%}%>
</body>
</html>
