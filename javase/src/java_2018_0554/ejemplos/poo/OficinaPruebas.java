package java_2018_0554.ejemplos.poo;

public class OficinaPruebas {

	public static void main(String[] args) {
		Oficina oficina1 = new Oficina("oficina uno");	
		
		oficina1.nuevoUsuario(new Usuario("pepe@","123"));
		oficina1.nuevoUsuario(new Usuario("pepe2@","1223"));
		
		Usuario usuario1 = new Usuario("imanol@", "123");
		oficina1.nuevoUsuario(usuario1);
		
		
		
		
		for(Usuario u: oficina1.getUsuarios()) {
			System.out.println(u.datosCompletos("corchetes"));
			System.out.println(u.getEmail());
			
		}
	}

}
