package ejercicios.Herencia.Aves;

public class Piolin extends Ave{
	int numPelis=0;
	
	public Piolin(char sexo, int edad, int numPelis) {
		super(sexo, edad);
		setNumPelis(numPelis);
		System.out.println("Se ha creado un LORO desde [Loro.java constructor]");
	}
	
	public int getNumPelis() {
		return numPelis;
	}


	public void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}






	public static void main(String[] args) {
		//Ave ave = new Ave('m',5);
		
		Ave loro= new Loro('m',5,'S');
		Ave piolin= new Piolin('m',20,3);
		
		Loro loro1= new Loro('m',5,'S');
		Piolin piolin1= new Piolin('m',20,3);
	}
}
