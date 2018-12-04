/*
 * http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 */

package estructura.secuencial.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Leer de teclado Java 5
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce num1: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce num2: ");
		int num2 = sc.nextInt();
		System.out.println("Los numeros introducidos son: "+num1+" y "+num2);
		sc.close();
	}

}
