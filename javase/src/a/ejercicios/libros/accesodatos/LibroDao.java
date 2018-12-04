package a.ejercicios.libros.accesodatos;

import java.util.ArrayList;
import java.util.List;



import a.ejercicios.libros.pojos.Libro;



public class LibroDao implements CrudAble<Libro> {
	//private static final String YA_EXISTE_ESE_ID_DE_USUARIO = "Ya existe ese ID de usuario";
	//private static final String NO_EXISTE_ESE_ID = "No existe ese ID";
	
	
	private ArrayList<Libro> librosLista = new ArrayList<>();
	
	public LibroDao() {
	librosLista.add(new Libro(1L,"123abc","libro uno", "editorial uno", 10));
	}
	
	
	
	@Override
	public List<Libro> listado() {
		return librosLista;
	}

	@Override
	public void alta(Libro libro) {
		librosLista.add(libro);
	}

	@Override
	public void baja(Long id) {
		for(int i = 0; i < librosLista.size(); i++) {
			if(librosLista.get(i).getId() == id) {
				librosLista.remove(i);
				return;
			}
		}
	}

	@Override
	public void modificacion(Libro libro) {
		//TODO
		
	}

	
	
	
	@Override
	public Libro buscarPorId(Long id) {
		for(Libro libro: librosLista) {
			if(libro.getId() == id) {
				return libro;
			}
		}	
		return null;
	}

	@Override
	public Libro buscarPorIsbn(String isbn) {
		for(Libro libro: librosLista) {
			if(libro.getIsbn() == isbn) {
				return libro;
			}
		}	
		return null;
	}

	
}
