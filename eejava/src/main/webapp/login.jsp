<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<fieldset>
			<legend>LOGIN</legend>
			<p>
				<label for="email">Email</label> <input type="email" name="email"
					id="email" />
			</p>


			<p>
				<label for="pass">Contraseña</label> <input type="text"
					name="password" id="password" />
			</p>
			<p>
				<button>Saluda</button>
			</p>
		</fieldset>
	</form>
</body>
</html>