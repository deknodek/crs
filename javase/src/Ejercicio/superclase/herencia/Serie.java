package Ejercicio.superclase.herencia;

//Crearemos una clase llamada Serie con las siguientes características:
//•Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
//•Por defecto, el número de temporadas es de 3 temporadas y entregado false.
//El resto de atributos serán valores por defecto según el tipo del atributo.
//•Los constructores que se implementaran serán:
//•Un constructor por defecto.
//•Un constructor con el titulo y creador. El resto por defecto.
//•Un constructor con todos los atributos, excepto de entregado.
//•Los métodos que se instancian serán:
//•Métodos get de todos los atributos, excepto de entregado, que se hereda.
//•Métodos set de todos los atributos, excepto de entregado, que se hereda.
//•Sobrescribe los métodos toString.

public class Serie {
	protected  static final  String TITULO_POR_DEFECTO="Sin Titutlo";
	protected  static final  String GENERO__POR_DEFECTO="Sin Genero";
	protected  static final String CREADOR__POR_DEFECTO="Sin Creador";
	protected  static final int TEMPORADAS_POR_DEFECTO=3;
	protected  static final boolean ENTREGADO_POR_DEFECTO=false;
	
	
	String titulo, genero, creador;
	int numeroTemporadas;
	Boolean entregado;
	
	public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
		setTitulo(titulo);
		setGenero(genero);
		setCreador(creador);
		setNumeroTemporadas(numeroTemporadas);
		System.out.println("se ha creado un serie nueva desde Serie.java-->Constructor con parametros");
	}
	public Serie() {
		this(TITULO_POR_DEFECTO, GENERO__POR_DEFECTO, CREADOR__POR_DEFECTO, TEMPORADAS_POR_DEFECTO);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	public Boolean getEntregado() {
		return entregado;
	}
	public void setEntregado(Boolean entregado) {
		this.entregado = entregado;
	}
	
	

	 public String toString(){
	        return "Informacion de la Serie: \n" +
	                "\tTitulo: "+titulo+"\n" +
	                "\tNumero de temporadas: "+numeroTemporadas+"\n" +
	                "\tGenero: "+genero+"\n" +
	                "\tCreador: "+creador;
	    }
	
}
