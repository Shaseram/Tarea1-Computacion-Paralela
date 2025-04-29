package client;

import java.rmi.NotBoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.rmi.RemoteException;

public class RunClient {

	public static void main(String[] args) throws RemoteException, NotBoundException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Client client = new Client();
		client.startClient();
		
		System.out.println("Cliente Arriba!");
		
		
		while(true) {
			System.out.println("=========================================");
			System.out.println("Menú cliente | Indique opción a operar");
			System.out.println("=========================================");
			System.out.println("1. Mostrar registro de todas las personas.");
			System.out.println("2. Crear registro de una nueva persona.");
			System.out.println("3. Terminar conexión y cerrar programa.");
			System.out.println("Ingrese su opción");
			String entrada = br.readLine();
			int opcion = Integer.parseInt(entrada);
			
			while(Integer.parseInt(entrada) > 3 || Integer.parseInt(entrada) < 1) {
				System.out.println("Entrada inválida, ingrese una opción válida");
				entrada = br.readLine();
				opcion = Integer.parseInt(entrada);
			}
			
			switch(opcion) {
				case 1:
					client.mostrarPersonas();
					
					break;
				case 2:
					
					System.out.println("Ingrese el nombre de la persona a registrar:");
					String nombre = br.readLine();
					
					
					System.out.println("Ingrese la edad de la persona a registrar:");
					String edad = br.readLine();
					
					client.crearRegistro(nombre, Integer.parseInt(edad));
					
					
					break;
				case 3:
					System.out.println("Saliendo del programa...");
					System.exit(0);
					break;
				
			}
			
		}
		
		
		
		
		
		
	}
	
}
