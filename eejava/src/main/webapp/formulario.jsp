<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORMULARIO</title>
</head>
<body>
<form>
	<fieldset>
		<legend>Dime quien eres</legend>
		<p>
			<label for="nombre">Nombre</label>
			<input name="nombre" id="nombre">
		</p>
		<p>
		<button>Saluda</button>
		</p>
	</fieldset>
	<h1>Hola <%=request.getParameter("nombre")!=null ?request.getParameter("nombre"):"Mundo" %></h1>
</form>
</body>
</html>