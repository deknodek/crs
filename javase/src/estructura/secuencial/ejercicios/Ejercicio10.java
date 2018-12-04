// Programa que lee un número de 3 cifras y muestra sus cifras por separado.

package estructura.secuencial.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce numero de tres cifras: ");
		int num1 = sc.nextInt();
		sc.close();	
			
		String numConvertido=String.valueOf(num1);
		
		//System.out.println(numConvertido);
		
		if(numConvertido.length()==3) {

			String [] numeritos=numConvertido.split("");
			 for(String numerito: numeritos){
				 System.out.println(numerito);
			 }
		} 
		

	}

}
