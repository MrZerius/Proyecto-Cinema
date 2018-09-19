package Cinema;

import java.util.Scanner;

public class Boletos {
	
	private static Scanner teclado;
	private static int cont=1;
	private static int num,n,p,opcion;
	private static int [] codigo = new int[30];
	 private static String [] nombre_usuario = new String[30];
	 private static String [] nombre_pelicula = new String[30];
	 private static String [] nombre_sala = new String[30];
	 
	 static Main m = new Main();
	 
	 public Boletos() {
			nombre_usuario[0] = "";
			nombre_pelicula[0] = "";
			
			nombre_sala[0] = "";
			int codigo[] = new int[3];
			
			n=1;
			Boletos.menu_principal();
			
	 }
			
			public static void menu_principal(){
				
				teclado = new Scanner(System.in);
				System.out.println(" Menu Boletos: ");
				System.out.println("1.Crear Boleto ");
				System.out.println("2.Listar Boletos ");
				System.out.println("3.Editar Boleto ");
				System.out.println("4.Eliminar Boleto ");
				System.out.println("5. Regresar ");
				
				System.out.println("Opcion: ");
				opcion = teclado.nextInt();
				
				
				//funciones
				switch(opcion) {
				case 1:
					
					crear_boleto();
					break;
				case 2:
					listar_boleto();
					break;
				case 3:
					editar_boleto();
					break;
				case 4:
					eliminar_boleto();
					break;
					
				case 5: 
					m.Main();
					break;
					
				default: System.out.println("La opcion seleccionada es incorrecta");
				}
				Usuario.menu_principal();

				}
					
					
				


			private static void crear_boleto() {
				// TODO Auto-generated method stub
				
				Scanner teclado = new Scanner(System.in);
				int opcion;
				System.out.println("\n");
				for(int n=1;n<=codigo.length;n++){
					System.out.println(n+" Digite el codigo del boleto ");
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
					do {
						System.out.println("Desea continuar (1: si - 2: no)");
						opcion=teclado.nextInt();
					}while(opcion < 1 || opcion>2);
					if(opcion == 1)
					{
						
					}else {
						System.out.println("Preciona una tecla para continuar");
						new java.util.Scanner(System.in).nextLine();
						menu_principal();
					}
				
				}
				
			}

			private static void listar_boleto() {
				// TODO Auto-generated method stub
				
				for(n=cont;n<cont+num;n++){
					teclado.nextLine();
					System.out.println("boleto numero  "+(n));
					System.out.println("Codigo "+codigo[n]);
					System.out.println("Nombre usuario : "+nombre_usuario[n]);
					System.out.println("Nombre pelicula: "+nombre_pelicula[n]);
					System.out.println("Nombre sala : "+nombre_sala[n]);
					System.out.println("\n");
				}
					
			}

			
			private static void editar_boleto() {
				// TODO Auto-generated method stub
				for(n=1;n<=num;n++){
					teclado.nextLine();
					System.out.println("boleto numero:  "+(n));
					System.out.println("Codigo "+codigo[n]);
					System.out.println("Nombre usuario : "+nombre_usuario[n]);
					System.out.println("Nombre pelicula: "+nombre_pelicula[n]);
					System.out.println("Nombre sala : "+nombre_sala[n]);
					System.out.println("\n");
				}	
				teclado.nextLine();
				System.out.println("Digite el codigo del boleto que desea editar ");
				n = teclado.nextInt();
			
					teclado.nextLine();
					System.out.println("Boleto numero  "+(n));
					
					System.out.println("Digite el codigo del boleto ");
					codigo[n] = teclado.nextInt();
					System.out.println("Digite el nombre de la sala");
					nombre_sala[n] = teclado.nextLine();
					System.out.println("\n");
					System.out.println("Digite el nombre de la pelicula");
					nombre_pelicula[n] = teclado.nextLine();
					System.out.println("\n");
					System.out.println("Digite el nombre del usuario");
					nombre_usuario[n] = teclado.nextLine();
					System.out.println("\n");
				//menu_principal();
			}
			

			private static void eliminar_boleto() {
				// TODO Auto-generated method stub
				
				System.out.println("Ingrese el codigo del boleto :");
				int editar;
				editar = teclado.nextInt();
				for(int i = 1 ; i < codigo.length ; i++) {
					
					if(editar == codigo[i])
					{
						
						codigo[i] = 0;
						nombre_usuario[i] = null;
						nombre_pelicula[i] = null;
						nombre_sala[i] = null;
						
					}
					
				}
				
				
			}
}