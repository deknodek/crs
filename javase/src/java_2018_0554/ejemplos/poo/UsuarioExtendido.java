package java_2018_0554.ejemplos.poo;

public class UsuarioExtendido extends Usuario{
// es una____________que ademas tiene otras caracteristicas__________
	
	//si no se pone ningun constructor se genere automaticanmtne el siguiete
	//public UsuarioExtendido() {super();}
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public UsuarioExtendido(String nombre, String email, String password) {
		super(email, password);
		setNombre(nombre);
	}
	
	public UsuarioExtendido(String nombre) {
		this(nombre, EMAIL_POR_DEFECTO, PASSWORD_POR_DEFECTO);
	}

	@Override
	public String datosCompletos() {
		
		return nombre + ", "+super.datosCompletos();
		//return datosCompletos("coma");
	}

	@Override
	public String datosCompletos(String formato) {
		String extra;
		switch(formato) {
		case "corchetes": extra = "[ nombre: "+ nombre +"]"; break;
		case "coma":  extra = nombre + ", ";break;
		default: throw new RuntimeException("formato no reconocido"+formato);
		}
		return super.datosCompletos(formato);
	}
	
	
	
}
