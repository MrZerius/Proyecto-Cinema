package Cinema;

import java.util.Scanner;

public class Salas {
	
	private static Scanner teclado;
	private static int cont=1;
	private static int num,n,p,opcion;
	private static int [] sala = new int[30];
	 private static String [] nombre = new String[30];
	 
	 static Main m = new Main();
	 
	 public Salas() {
			nombre[0] = "";
			
			int sala[] = new int[3];
			
			n=1;
			Salas.menu_principal();
	 }
			
			public static void menu_principal(){
				
				teclado = new Scanner(System.in);
				System.out.println(" Menu Salas: ");
				System.out.println("1.Crear Salas ");
				System.out.println("2.Listar Salas ");
				System.out.println("3.Editar Salas ");
				System.out.println("4.Eliminar Salas ");
				System.out.println("5.Regresar ");
				
				
				System.out.println("Opcion: ");
				opcion = teclado.nextInt();
				
				
				//funciones
				switch(opcion) {
				case 1:
					
					crear_sala();
					break;
				case 2:
					listar_salas();
					break;
				case 3:
					editar_salas();
					break;
				case 4:
					eliminar_sala();
					break;
				case 5: 
					m.Main();
					break;
				default: System.out.println("La opcion seleccionada es incorrecta");
				}
				Usuario.menu_principal();

				}
					
					
				


			private static void crear_sala() {
				// TODO Auto-generated method stub
				
				Scanner teclado = new Scanner(System.in);
				int opcion;
				System.out.println("\n");
				for(int n=1;n<=sala.length;n++){
					System.out.println(n+" Digite el codigo de la sala ");
					sala[n] = teclado.nextInt();
					teclado.nextLine();
					System.out.println(n+" Digite Nombre de la sala ");
					nombre[n] = teclado.nextLine();
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

			private static void listar_salas() {
				// TODO Auto-generated method stub
				
				for(n=cont;n<cont+num;n++){
					teclado.nextLine();
					System.out.println("Sala numero  "+(n));
					System.out.println("Codigo "+sala[n]);
					System.out.println("Nombre: "+nombre[n]);
					System.out.println("\n");
				}
					
			}

			
			private static void editar_salas() {
				// TODO Auto-generated method stub
				for(n=1;n<=num;n++){
					teclado.nextLine();
					System.out.println("cliente numero:  "+(n));
					System.out.println("Codigo "+sala[n]);
					System.out.println("Nombre: "+nombre[n]);
				
				}	
				teclado.nextLine();
				System.out.println("Digite el codigo de la sala a editar ");
				n = teclado.nextInt();
			
					teclado.nextLine();
					System.out.println("Sala numero  "+(n));
					
					System.out.println("Digite el codigo de la sala ");
					sala[n] = teclado.nextInt();
					System.out.println("Digite el nombre de la sala");
					nombre[n] = teclado.nextLine();
					System.out.println("\n");
				//menu_principal();
			}
			

			private static void eliminar_sala() {
				// TODO Auto-generated method stub
				
				System.out.println("Ingrese el codigo de la sala :");
				int editar;
				editar = teclado.nextInt();
				for(int i = 1 ; i < sala.length ; i++) {
					
					if(editar == sala[i])
					{
						
						sala[i] = 0;
						nombre[i] = null;
						
					}
					
				}
				
				
			}
}