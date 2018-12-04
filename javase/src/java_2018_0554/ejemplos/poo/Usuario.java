package java_2018_0554.ejemplos.poo;

public class Usuario {
//CONSTANTES
//seleccionar el nombre del contenido boton derecho refactor extract constant
	protected  static final String PASSWORD_POR_DEFECTO="porDefecto";
	protected  static final String EMAIL_POR_DEFECTO="email@pordefecto";
	//poretected es privada para toda la herencia
	
//varibles de instacia  //principiosa de encapsulacion
//las variables de instacia son siempre privadas solo para uso de la misma clase dnd se ecuentran
	private String email, password;
	
//CONSTRUCTORES
//un es metodo pùblico que se llama igual que la misma clase 
//devuelve un objeto de la propia clase
	
//see hace solo Source Generate consturctor 
	
	public Usuario(String email, String password) {
//		this.email=email;
//		this.password=password;
		setEmail(email);
		setPassword(password);
		System.out.println("se ha creado un usuario");
	}
	
	public Usuario(String email) {
		this(email,PASSWORD_POR_DEFECTO);
	}
	
	public Usuario() {
			this(EMAIL_POR_DEFECTO, PASSWORD_POR_DEFECTO);
	}
	
//METODOS DE ACCESO GETTERs Y SETTERs
//SETTER Es un control de entrada de datos
	public void setEmail(String email) {
		if(email.indexOf('@') ==-1) {
			throw new RuntimeException("NO SE ADMITEN EMAIL SIN @");
		}
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//METODOS 	
	public void cambiarPassword(String password) {
		if(this.password.equals(password)) {
			throw new RuntimeException("no has cambiado");
		}
		setPassword(password);
	}
	
	public String datosCompletos() {
		return email+", "+password;
	}
	
	//METODO SOBRECARGADO
	public String datosCompletos(String formato) {
		switch(formato) {
		case "coma": return datosCompletos();
		case "corchetes": return "[email: "+email+", password: "+password+ "]";
		default: throw new RuntimeException("formato no reconocido");
		}
	}	
	
}
