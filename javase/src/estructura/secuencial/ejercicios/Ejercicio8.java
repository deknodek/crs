//Programa que calcula el volumen de una esfera.

package estructura.secuencial.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Leer de teclado Java 5
		Scanner sc = new Scanner(System.in);
		System.out.print("INTRODUCE radio de la esfera: ");
		int radio = sc.nextInt();
		sc.close();
		double volumen= ((4 * Math.PI)/3)  * Math.pow(radio, 3);
		System.out.println(volumen);
		

	}

}


//v=4/3*pi*r3