package java_2018_0554.ejemplos.poo;

import java.util.ArrayList;

public class Oficina {
	private String nombre;
	
	private ArrayList<Usuario> usuarios = new ArrayList<>();

	public Oficina(String nombre) {
		setNombre(nombre);
	}
	
	public void nuevoUsuario(Usuario usuario) {
		if(usuario==null) {
		throw new RuntimeException("No se admiten valor null");
		}
		usuarios.add(usuario);
	}
	public void eliminarUsuario(Usuario usuario) {
		if(usuario==null) {
			throw new RuntimeException("No se admiten valor null");
			}
			usuarios.remove(usuario);
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
