//Programa que calcula el área de un triángulo a partir de la longitud de sus lados.

package estructura.secuencial.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Leer de teclado Java 5
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce num1: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce num2: ");
		int num2 = sc.nextInt();
		System.out.print("Introduce num3f: ");
		int num3 = sc.nextInt();
		sc.close();
		
		double semiperimetro= (num1+num2+num3)/2;
		double area= Math.sqrt( semiperimetro * (semiperimetro-num1) * (semiperimetro-num2) * (semiperimetro-num3));
		System.out.println(area);
	}

}
//a=b*h/2