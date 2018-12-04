//Programa lea la longitud de los catetos de un triángulo rectángulo  
//y calcule la longitud de la hipotenusa según el teorema de Pitágoras. 

package estructura.secuencial.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Leer de teclado Java 5
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce cat1: ");
		int cat1 = sc.nextInt();
		System.out.print("Introduce cat2: ");
		int cat2 = sc.nextInt();
		sc.close();
	     System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(cat1,2)+ Math.pow(cat2, 2)));
	}

}
