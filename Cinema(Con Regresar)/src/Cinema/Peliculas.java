package Cinema;

import java.util.Scanner;

public class Peliculas {

	private static Scanner teclado;
	private static int cont=1;
	private static int num,n,p,opcion;
	private static int [] codigo = new int[30];
	 private static String [] nombre = new String[30];

	 static Main m = new Main();
	 
	 public Peliculas() {
			nombre[0] = "";
			
			int codigo[] = new int[3];
			
			n=1;
			Peliculas.menu_principal();
	 }
			
			public static void menu_principal(){
				
				teclado = new Scanner(System.in);
				System.out.println(" Menu peliculas: ");
				System.out.println("1.Crear peliculas ");
				System.out.println("2.Listar peliculas ");
				System.out.println("3.Editar peliculas ");
				System.out.println("4.Eliminar peliculas ");
				System.out.println("5.Regresar ");
				
				System.out.println("Opcion: ");
				opcion = teclado.nextInt();
				
				
				//funciones
				switch(opcion) {
				case 1:
					
					crear_pelicula();
					break;
				case 2:
					listar_pelicula();
					break;
				case 3:
					editar_pelicula();
					break;
				case 4:
					eliminar_pelicula();
					break;
					
					case 5: 
					
					m.Main();
					
					break;
				default: System.out.println("La opcion seleccionada es incorrecta");
				}
				Peliculas.menu_principal();

				}
					
					
				


			private static void crear_pelicula() {
				// TODO Auto-generated method stub
				
				Scanner teclado = new Scanner(System.in);
				int opcion;
				System.out.println("\n");
				for(int n=1;n<=codigo.length;n++){
					System.out.println(n+" Digite el codigo de la pelicula ");
					codigo[n] = teclado.nextInt();
					teclado.nextLine();
					System.out.println(n+" Digite Nombre de la pelicula ");
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

			private static void listar_pelicula() {
				// TODO Auto-generated method stub
				
				for(n=cont;n<cont+num;n++){
					teclado.nextLine();
					System.out.println("pelicula numero  "+(n));
					System.out.println("Codigo pelicula"+codigo[n]);
					System.out.println("Nombre: "+nombre[n]);
					System.out.println("\n");
				}
					
			}

			
			private static void editar_pelicula() {
				// TODO Auto-generated method stub
				for(n=1;n<=num;n++){
					teclado.nextLine();
					System.out.println("pelicula:  "+(n));
					System.out.println("Codigo pelicula "+codigo[n]);
					System.out.println("Nombre: "+nombre[n]);
				
				}	
				teclado.nextLine();
				System.out.println("Digite el codigo de la pelicula a editar ");
				n = teclado.nextInt();
			
					teclado.nextLine();
					System.out.println("pelicula  "+(n));
					
					System.out.println("Digite el codigo de la pelicula ");
					codigo[n] = teclado.nextInt();
					System.out.println("Digite el nombre de la pelicula");
					nombre[n] = teclado.nextLine();
					System.out.println("\n");
				//menu_principal();
			}
			

			private static void eliminar_pelicula() {
				// TODO Auto-generated method stub
				
				System.out.println("Ingrese el codigo de la pelicula :");
				int editar;
				editar = teclado.nextInt();
				for(int i = 1 ; i < codigo.length ; i++) {
					
					if(editar == codigo[i])
					{
						
						codigo[i] = 0;
						nombre[i] = null;
						
					}
					
				}
	}



}