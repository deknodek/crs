package clasesAbstractas;

public class ClasesAbstractas {

	public static void main(String[] args) {
		//no se puede crear un objeto number pero si se puede hacer un array de tipo number
		// esto contiene dos huecos de referencia para guardar numeros.
		Number[] numeros= new Number[2];
		
		 Integer entero= new Integer(5);
		 Double doble = new Double(6.777);
		 
		 numeros[0]= entero;
		 numeros[1]=doble;
		 for(Number numero: numeros) {
			 System.out.println(numero.doubleValue());
		 }
	}

}
/**
 * una calse que contenga un metodo abstracto tiene que ser una clase abtracta
 * no se puede instaciar una clase abstracta(new Clase)
 * no se puede tener ningun objeto de esa clase
 * por ejemplo la clase number es abstracta pero es la supercalse de Integer double float...
 * en la clase hija se implementan los metodos abstractos
 * 
 * 
 */