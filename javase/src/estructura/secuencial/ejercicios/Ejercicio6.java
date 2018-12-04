//http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

package estructura.secuencial.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Leer de teclado Java 5
				Scanner sc = new Scanner(System.in);
				System.out.print("Introduce los km/h: ");
				Double num1 = sc.nextDouble();
				sc.close();
//Velocidad (m/s) = vel (Km/h) x 0,2778
			Double vMax=num1*0.2778	;
			System.out.println(vMax);
				
	}

}
