package ejercicios.Herencia.Aves;

public class Canario extends Ave {
	int tamanio;
	
	
	public Canario(char sexo, int edad, int tamanio) {
		super(sexo, edad);
		setTamanio(tamanio);
		System.out.println("Se ha creado un Canario desde [Canario.java constructor]");
	}
	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}


	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	
	private String saberAltura() {
		if(tamanio>30) {
			return "Grande";
		}else if(tamanio<30 && tamanio>15) {
			return "Medio";
		}else if(tamanio<15){
			return "Pequeño";
		}else{
			return null;
		}
		
	}
	
	
	
	
	
}
