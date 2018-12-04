package java_2018_0554.ejemplos.poo;

public class Pruebas {

	public static void main(String[] args) {
		
		// declaramos una varialbe de la clase usuario inicializada a null
			//Usuario usuario=null;
		
		//creamos un objeto de la clase usuario y se le asigna la variable
			//usuario = new Usuario();
		
		
//		Usuario usuario1 =new Usuario();
//			usuario.setEmail("imanol@");
//			System.out.println(usuario.getEmail());
//			usuario.setPassword("123");
//			System.out.println(usuario.getPassword());
			
		Usuario usuario2 =new Usuario("imanol@","contra");
		System.out.println(usuario2.getEmail()+" "+usuario2.getPassword());
		
		usuario2.cambiarPassword("cosntra");
		System.out.println(usuario2.datosCompletos());
	}

}
