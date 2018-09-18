package Cinema;

import java.util.Scanner;

import Cinema.Boletos;
import Cinema.Reservas;
import Cinema.Usuario;
import Cinema.Salas;
import Cinema.Peliculas;

public class Main {
	
	public static void main(String[] args) {
		
		int opcion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione una Opcion");
		System.out.println("1: Usuarios ");
		System.out.println("2: Salas ");
		System.out.println("3: Peliculas ");
		System.out.println("4: Boletos ");
		System.out.println("5: Reservas ");
		opcion = teclado.nextInt();
		switch(opcion)
		{
		case 1:
			Usuario u = new Usuario();
			break;
		case 2:
			Salas s = new Salas();
			break;
			
		case 3: Peliculas p = new Peliculas();
			break;
			
		case 4: 
			Boletos b = new Boletos();
			break;
			
		case 5: 
			Reservas r = new Reservas();
		break;
		}
	}
	

}
