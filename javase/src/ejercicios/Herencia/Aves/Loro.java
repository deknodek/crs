package ejercicios.Herencia.Aves;

public class Loro extends Ave{
	char region;
	
	public Loro(char sexo, int edad, char region) {
		super(sexo, edad);
		setRegion(region);
		System.out.println("Se ha creado un LORO desde [Loro.java constructor]");
	}
	

	
	
	
	
	public char getRegion() {
		return region;
	}
	public void setRegion(char region) {
		this.region = region;
	}
	
	
	private String deDondeEs(char deDonde) {
		return "por hacer";
	}
	
	
	
	
	
	
}
