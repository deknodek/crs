package a.ejercicios.libros.presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import a.ejercicios.libros.accesodatos.CrudAble;
import a.ejercicios.libros.accesodatos.LibroDao;
import a.ejercicios.libros.pojos.Libro;

public class PresentacionLibros {
	
static CrudAble<Libro> libros = new LibroDao();
		
	
	
	public static void main(String[] args) {
		
		menu();
		
		
	}

	
	
	public static void menu(){
	       Scanner teclado= new Scanner(System.in);
	       int opcion;
	        do{
	            System.out.println("1.Listado");
	            System.out.println("2.Alta");
	            System.out.println("3.Modificacion");
	            System.out.println("4.Baja");
	            System.out.println("5.Buscar por ID");
	            System.out.println("6.Buscar por ISBN");
	            System.out.println("0.Salir");
	            System.out.print("Introduce la opción: ");
	            opcion=teclado.nextInt();
	          switch(opcion){
	          case 0:System.out.println("fin");;break;
	              case 1:listar();break;
	              default:System.out.println("Opcion incorrecta");// si no se introduce 1 2 3 
	          }
	        }while(opcion !=0);
	        }
	
	
public static void listar() {
	for (Libro l : libros.listado()) {
			System.out.println("\n"+l+"\n");
		}
}		
	
	
}
