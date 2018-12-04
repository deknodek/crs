//http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
//Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.

package estructura.secuencial.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println(nombre);
		sc.close();

	}

}
