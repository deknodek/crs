package javase;

public class recursividad {

	public static void main(String[] args) {
		System.out.println(factorial(29));

	}
	
	
//RECURSIVIDAD la misma funcion se aplica a si misma repetidamente
//----------------------------------------------------------------------------------------------------------------	
	private static int factorial(int num) {
		if(num==1){
			return 1;
		}
		return num * factorial (num-1);
	}

	
	
	
}
