package ejercicios.Herencia.Aves;

public class Ave {
	char sexo;
	int edad;
	int avesCreadas=0;
	
	public Ave(char sexo, int edad) {		
		setSexo(sexo);
		setEdad(edad);
		getAvesCreadas();
		System.out.println("Se ha creado un Ave desde [Ave.java constructor]");
	System.out.println(getAvesCreadas());
	}
	
	
	

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
	public int getAvesCreadas() {
		return avesCreadas++;
	}
	
	
	
	public String quienSoy() {
		return "Ave [sexo=" + sexo + ", edad=" + edad + "]";
	}




	
	
	

	
}
