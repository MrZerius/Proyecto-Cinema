package Cinema;

import java.util.Scanner;



public class Usuario {
	
	
	private static Scanner teclado;
	private static int cont=1;
	private static int num,n,p,opcion;
	private static String [] cedula = new String[30];
	 private static String [] nombre = new String[30];

	 static Main m = new Main();
	 
	public Usuario() {
		nombre[0] = "";

		cedula[0] = "";

		n=1;
		Usuario.menu_principal();
		
	}
	
	//menu 
	public static void menu_principal(){
		
	teclado = new Scanner(System.in);
	System.out.println("Menu Usuario: ");
	System.out.println("1.Crear usuario ");
	System.out.println("2.Listar usuario ");
	System.out.println("3.Editar usuario ");
	System.out.println("4.Eliminar usuario ");
	System.out.println("5. Regresar ");
	
	System.out.println("Opcion: ");
	opcion = teclado.nextInt();
	
	
	//funciones
	switch(opcion) {
	case 1:
		
		crear_usuario();
		break;
	case 2:
		listar_usuarios();
		break;
	case 3:
		editar_usuario();
		break;
	case 4:
		eliminar_usuario();
		break;
		
	case 5: 	
		m.Main();
		break;

		default: System.out.println("La opcion seleccionada es incorrecta");
	}
	Usuario.menu_principal();

	}

	public static void crear_usuario() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantos usuarios desea registrar ");
		num = teclado.nextInt();
		System.out.println("\n");
		for(n=1;n<=num;n++){
			teclado.nextLine();
			System.out.println(n+" Digite Cedula: ");
			cedula[n] = teclado.nextLine();
			System.out.println(n+" Digite Nombre: ");
			nombre[n] = teclado.nextLine();
		
		}
		
	}
	public static void listar_usuarios() {
		for(n=cont;n<cont+num;n++){
			teclado.nextLine();
			System.out.println("cliente numero:  "+(n));
			System.out.println("Cedula: "+cedula[n]);
			System.out.println("Nombre: "+nombre[n]);
			System.out.println("\n");
		}
	}
	
	

	public static void editar_usuario() {
		for(n=1;n<=num;n++){
			teclado.nextLine();
			System.out.println("cliente numero:  "+(n));
			System.out.println("Cedula: "+cedula[n]);
			System.out.println("Nombre: "+nombre[n]);
		
		}	
		teclado.nextLine();
		System.out.println("Ingrese la cedula del usuario ");
		n = teclado.nextInt();
	
			teclado.nextLine();
			System.out.println("Usuario numero:  "+(n));
			
			System.out.println("Digite la neuva Cedula: ");
			cedula[n] = teclado.nextLine();
			System.out.println("Digite el nuevo Nombre: ");
			nombre[n] = teclado.nextLine();
			System.out.println("\n");
		menu_principal();
	}
public static void eliminar_usuario() {
		
		
	System.out.println("Ingrese la cedula del usuario :");
	String editar;
	editar = teclado.nextLine();
	for(int i = 1 ; i < cedula.length ; i++) {
		
		if(editar == cedula[i])
		{
			
			cedula[i] = null;
			nombre[i] = null;
			
		}
		
	}
	
	}
}