package main;

import java.util.Scanner;
import model.LinkList;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static LinkList list = new LinkList();
	
	//Main para que el usuario elija la funcion que el programa llevara a cabo
	public static void main(String[] args) {
		
		System.out.println("Selecciona una opcion:\n");
		System.out.println("1. Dar turno\n");
		System.out.println("2. Pasar turno\n");
		System.out.println("3. Mostrar turno\n");
		System.out.println("4. Eliminar el turno actual\n");
		int op = -1;
		
		while(op!=0) {
			
			op= menuSelection();
			selection(op);
			
		}
		
	}

	private static void selection(int num) {
		
		switch(num) {
		
			case 1:
				darTurno();
				break;
				
			case 2:
				pasarTurno();
				break;
				
			case 3:
				mostrarTurno();
				break;
				
			case 4:
				eliminarTurno();
				break;
		}
		
	}
	
	//Metodo para dar el turno y asignarlo correctamente
	
	private static void darTurno() {
		
		list.agregar();
		System.out.println("El turno se ha asignado correctamente\n");
	}
	
	//Metodo pa pasar el turno a la cola
	
	private static void pasarTurno() {
		
		System.out.println("El turno se ha pasado a la cola\n");
		list.pasar();
	}
	
	//Metodo para mostrar el turno
	
	private static void mostrarTurno() {
		
		System.out.println("El turno siguiente es: \n");
		list.imprimir();
		
	}

	//Metodo para eliminar el turno
	
	private static void eliminarTurno() {
		
		boolean del = list.eliminar();
		
		if(del) {
			System.out.println("Se borro correctamente\n");
			
		}else {
			
			System.out.println("No se pudo borrar\n");
		}
		
	}
	

	private static int menuSelection() {
		
		int out = sc.nextInt();
		sc.nextLine();
		
		while(out>4||out<1) {
			
			System.out.println("Opcion no valida, intentelo nuevamente");
			out=sc.nextInt();
			sc.nextLine();
			
		}
		return out;
	}

}
