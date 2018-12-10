package javase;

//import java.util.ArrayList;

//import java.util.Scanner;

//hay un import implicito
//import java.lang.*

//Comentario de linea

/*
 * Comentario2
 * multilinea
 */

//control shift 7 o control 7 -- comentario a todas las lineas seleccionadas

/**
 * 
 * 
 * @author Curso 
 * comentario de documentacion
 *
 */


public class HolaMundo {
// el nombre de clase tiene que ser igual que el archivo

	public static void main(String[] args) {
		//  mostrar el texto hola mundo
		//javase.HolaMundo.main()
		//public static  esta es la llamada al metodo main desde fuera de clase.
		//void es un metodo sin return
		//main es obligatorio.
		//(String[] args) se les puede pasar argumentos
		System.out.println("hola");
		System.out.println("hello syso");
		
		//Las clases van la primera en mayusculas
		//los metodos llevan siempre()
		//out es una variable del sistema.
	}

}

//--------------------TIPOS PRIMITIVOS ---------------------------------------
//----------------------------------------------------------------------------------------
//		
//			TIPOS DE DATOS TODOS CON SIGNO	
//			ENTEROS
//			byte b;  8 bits -128 a 127
//			short s; 16 bits -32768 a 32767
//			int i; 32 bits ~-2127M a ~21270M
//			long l; 64 bits ~trillones
			

//			COMA FLOTANTE
//				float f; //32bits
//				double d; //64bits
//			NUNCA COMPARAR IGUALDAD ENTRE NUMEROS DE COMA FLOTANTE

//			BOOLEAN
//			SOLO PUEDE VALER TRUE O FALSE
//			boolean bool; // true o false

//			CARACTER
//			char c='l';

//----------------------------------------------------------------------------------------
//-----------------FIN---TIPOS PRIMITIVOS (8) ---------------------------------------

// Byte, Short, Integer, Long, Float, Double, Boolean, Character
//Clases equivalentes  a los tipos primitivos



//OPERADORES
//-------------------------------------------------------
//Matematicos--> + - * / %

//Comparaciones:
//	==   
//	!= 
//  <
//	> 
//	<=
//	>=
//resultado de una comparacion es boolean true o false

//Operadores logicos
//	&&
//	||
//	!

//	(!(1<=x && x<=10))

//algebra de bol (1>x || x>10)

//Operadores nivel de bits
//	&
//	|
//	~
//	^
//x=5^2; //XOR




//Operadores de asignacion
//	=
//	+=
//	-=
//	*=
//	/=
//	...
//Funcionan de derecha a izquierda

//Operadores incremento decremento
//	postincremento
//	primero saca el valor e incrementa
//	y--
//	y++
//	preincrementro
//	incrementa y luego saca el valor
//	++y
//	--y

//OPERADOR CONDICIONAL ?:
//int num1=5, num2=10;
//int max= num1>num2 ? num1: num2;
//primer parte booleano(num1>num2) primer dato verdadero segundo dato falso
//if(num1>num2) {
//	max=num1;
//}else {
//	max=num2;
//}


//SENTENCIAS CONTROL
//	if
//	switch
//	while
//	do while
//	for



//break o continue�

	
//break cuando lo encuetnra sale del bucle
//continue salta solo esa excepcion y continua el bucle

//	se pueden crear etikietas
//	bucleprincipal: for(...) {continue bucleprincipal; }


//TIPOS DE DATOS BASICOS(clases de java)
//	String nombre="imanol";
//	

//ARRAYS
//-----------------------------------------------
//	conjunto de elementos del mismo tipo con una longitud determinada
//	String[] arr= new String[2]; // array vacio de dos elementos
//	arr[0]="texto1";
//	arr[1]="texto2";
//
//	for(int i=0; i<arr.length; i++) {
//	
//}
//	recoge todo
//	for(String texto:arr) { JAVA�5
// 	}
//	
// 	String [] meses= {"Enero","Febrero"};
// 	char[][] tablero = new char[8][8];
//	tablero[0][0]='T';




//LEER DEL TECLADO

//Scanner sc= new Scanner(System.in);
//System.out.println("Introduce tu email:");
//String nombre=sc.nextLine();
//sc.close();


//CONVERSIONES

//String sEntero="5";
//int entero = Integer.parseInt(sEntero);

//long largo= 5L;
//String sLargo=""+largo //CHApuza
//String sLargo= String.valueOf(largo);


//float fVariable=5.3F;
//String sVariable=String.valueOf(fVariable);

//String sDoblePresicions="5.3";
//double doblePrecision =Double.parseDouble(sDoblePresicions);
//
//entero=(int)fVariable;





//COLECCIONES ArrayList Java5
//utiliza varios arrays sueltos para "guardar los pedazos"
//ArrayList<String> textos= new ArrayList<String>();//declaracion en java 5
//ArrayList<String> textos= new ArrayList<>() //Java 8�
//textos.add("uno");
//textos.add("dos");
// .remove(indice)

// for(String texto: textos){
//	System.out.println(texto);
//}
//cntol shift O  source ORganize imports





//MODIFICADORES

//public

//protected clase + herencia + ([paquete])

//[paquete] -- si no lo pones la ausencia de modificador tiene modificador de paquete solo es 
//visible en las clases del mismo paquete

//private

