package Cinema;

import java.util.Scanner;

public class Reservas {
	
	private static Scanner teclado;
	private static int cont=1;
	private static int num,n,p,opcion;
	private static int [] codigo = new int[20];
	 private static String [] nombre_usuario = new String[30];
	 private static String [] nombre_pelicula = new String[30];
	 private static String [] nombre_sala = new String[30];
	 private static int [] cedula = new int[15];
	 private static int [] estado = new int[15];
	 
	 public Reservas() {
			nombre_usuario[0] = "";
			nombre_pelicula[0] = "";
			
			nombre_sala[0] = "";
			int codigo[] = new int[3];
			int cedula[] = new int[3];
			n=1;
			Reservas.menu_principal();
	 }
			
			public static void menu_principal(){
				
				teclado = new Scanner(System.in);
				System.out.println(" Menu Reservas: ");
				System.out.println("1.Crear Reserva ");
				System.out.println("2.Listar Reserva ");
				System.out.println("3.Editar Reserva ");
				System.out.println("4.Eliminar Reserva ");
				
				
				System.out.println("Opcion: ");
				opcion = teclado.nextInt();
				
				
				//funciones
				switch(opcion) {
				case 1:
					
					crear_reserva();
					break;
				case 2:
					listar_reserva();
					break;
				case 3:
					editar_reserva();
					break;
				case 4:
					eliminar_reserva();
					break;
				default: System.out.println("La opcion seleccionada es incorrecta");
				}
				Usuario.menu_principal();

				}
					
					
				


			private static void crear_reserva() {
				// TODO Auto-generated method stub
				
				Scanner teclado = new Scanner(System.in);
				int opcion;
				System.out.println("\n");
				for(int n=1;n<=codigo.length;n++){
					System.out.println(n+" Digite el codigo de la reserva ");
					codigo[n] = teclado.nextInt();
					teclado.nextLine();
					System.out.println(n+" Digite el nombre de la sala ");
					nombre_sala[n] = teclado.nextLine();
					System.out.println(" ");
					System.out.println(n+" Digite el nombre del usuario ");
					nombre_usuario[n] = teclado.nextLine();
					System.out.println(" ");
					System.out.println(n+" Digite el nombre de la pelicula ");
					nombre_pelicula[n] = teclado.nextLine();
					System.out.println(" ");
					System.out.println(n+" Digite la cedula ");
					cedula[n] = teclado.nextInt();
					do {
						
						teclado.nextLine();System.out.println(n+" Desea canselar el boleto (1: si - 2: no) ");
						opcion = teclado.nextInt();
						teclado.nextLine();
					}while( opcion < 1 || opcion > 2 );
						if(estado[n] == 1 ) {
							
							
						}else {
							
							System.out.println("Precione una tecla para continuar");
							new java.util.Scanner(System.in).nextLine();
							menu_principal();
							
					}
					
							
						
					
					
					do {
						System.out.println("Desea continuar (1: si - 2: no)");
						opcion=teclado.nextInt();
					}while(opcion < 1 || opcion>2);
					if(opcion == 1)
					{
						
					}else {
						System.out.println("Precione una tecla para continuar");
						new java.util.Scanner(System.in).nextLine();
						menu_principal();
					}
				
				}
				
			}

			private static void listar_reserva() {
				// TODO Auto-generated method stub
				
				for(n=cont;n<cont+num;n++){
					teclado.nextLine();
					System.out.println("reserva numero  "+(n));
					System.out.println("Codigo "+codigo[n]);
					System.out.println("cedula "+cedula[n]);
					System.out.println("Nombre usuario : "+nombre_usuario[n]);
					System.out.println("Nombre pelicula: "+nombre_pelicula[n]);
					System.out.println("Nombre sala : "+nombre_sala[n]);
					System.out.println("\n");
				}
					
			}

			
			private static void editar_reserva() {
				// TODO Auto-generated method stub
				for(n=1;n<=num;n++){
					teclado.nextLine();
					System.out.println("reserva numero:  "+(n));
					System.out.println("Codigo "+codigo[n]);
					System.out.println("Cedula usuario "+cedula[n]);
					System.out.println("Nombre usuario : "+nombre_usuario[n]);
					System.out.println("Nombre pelicula: "+nombre_pelicula[n]);
					System.out.println("Nombre sala : "+nombre_sala[n]);
					System.out.println("\n");
				}	
				teclado.nextLine();
				System.out.println("Digite el codigo de la reserva que desea editar ");
				n = teclado.nextInt();
			
					teclado.nextLine();
					System.out.println("reserva numero  "+(n));
					
					System.out.println("Digite el codigo de la reserva ");
					codigo[n] = teclado.nextInt();
					System.out.println("Digite el nombre de la sala");
					nombre_sala[n] = teclado.nextLine();
					System.out.println("\n");
					System.out.println("Digite el nombre de la pelicula");
					nombre_pelicula[n] = teclado.nextLine();
					System.out.println("\n");
					System.out.println("Digite el nombre del usuario");
					nombre_usuario[n] = teclado.nextLine();
					System.out.println("Digite el codigo de la reserva ");
					cedula[n] = teclado.nextInt();
					System.out.println("\n");
				//menu_principal();
			}
			

			private static void eliminar_reserva() {
				// TODO Auto-generated method stub
				
				System.out.println("Ingrese el codigo de la reserva :");
				int editar;
				editar = teclado.nextInt();
				for(int i = 1 ; i < codigo.length ; i++) {
					
					if(editar == codigo[i])
					{
						
						codigo[i] = 0;
						cedula[i] = 0;
						nombre_usuario[i] = null;
						nombre_pelicula[i] = null;
						nombre_sala[i] = null;
						
					}
					
				}
				
				
			}
}