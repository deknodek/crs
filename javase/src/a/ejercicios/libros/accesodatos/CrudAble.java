package a.ejercicios.libros.accesodatos;

import java.util.List;

public interface CrudAble<Pojo>  {
	
	public default List<Pojo> listado() {
		throw new RuntimeException("No implementado");
	}

	
	
	public default void alta(Pojo pojo) {
		throw new RuntimeException("No implementado");
	}
	public default void baja(Long id) {
		throw new RuntimeException("No implementado");
	}
	public default void modificacion(Pojo pojo) {
		throw new RuntimeException("No implementado");
	}
	
	
	
	public default Pojo buscarPorId(Long id) {
		throw new RuntimeException("No implementado");
	}
	
	public default Pojo buscarPorIsbn(String isbn) {
		throw new RuntimeException("No implementado");
	}
	
	
	
}
