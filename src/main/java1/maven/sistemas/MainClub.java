package sistemas;

import java.util.Scanner;

public class MainClub {


	private static String ADMI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Ingrese usuario del sistema");
		Scanner teclado = new Scanner(System.in);
		String  usuario="ADMI";
		
		while (ADMI) {
			System.out.println("Ingrese un numero:  ");
		
		}
		
		System.out.println();
		Scanner teclado1 = new Scanner(System.in);
		String opcion = teclado.nextLine();
		
	
		System.out.println("Ingrese CLAVE  del sistema");
		Scanner teclado2 = new Scanner(System.in);
		String  clave="ABC345";
		while (ABC345) {
			System.out.println("Presentar menu  ");
		
		}
		
		System.out.println();
		Scanner teclado3 = new Scanner(System.in);
		String opcion1 = teclado.nextLine();
		
		
		do {	
			System.out.println("Escoja opcion    ");
			System.out.println("1.-Ingresar Socio ");
			System.out.println("2.- Busqueda General ");
			System.out.println("3.- Busqueda por tipo de socio ");
			System.out.println("4.- Salir ");
			opcion = teclado.nextLine();
			
			
			
			switch (opcion) {
			case "1":
				System.out.println(" escoja tipo de socio  ");
				System.out.println(" 1.- socio vip  ");
				System.out.println(" 2.- Socio general ");
				System.out.println(" 3.- Socio Esporadico ");
				break;
				
			case "2":
				System.out.println("ingrese codigo de membresia ");
				break;
				default: 
					
				case "3":
					System.out.println("INGRESE tipo de socio a buscar ");
					System.out.println(" Ingrese codigo vip ");
					System.out.println(" Ingrese codigo general ");
					System.out.println(" ingrese codigo esporadico ");
					break;	
					
				case "4":
					System.out.println(" salir  ");
					break;
					
				
			}
			
			if (opcion.equals("1")) {
				System.out.println(" Escoja tipo de socio ");
			}else if (opcion.equals("2")) {
				System.out.println(" Ingrese codigo de membresia ");
			}else if (opcion.equals("3")) {
				System.out.println(" Elija tipo de socio a buscar ");
			}else if (opcion.equals("4")) {
				System.out.println(" Sair ");
			}
			
			
			
				
				
				
				
			
				
		}while(opcion != null);
		System.out.println(" salir ");
		
			}
}
