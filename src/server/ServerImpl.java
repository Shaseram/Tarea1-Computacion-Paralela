package server;

import java.util.ArrayList;
import common.InterfazDeServer;
import common.Persona;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ServerImpl implements InterfazDeServer {
	
	private ArrayList<Persona> BD_personas = new ArrayList<>();
	
	public ServerImpl() throws RemoteException {
		UnicastRemoteObject.exportObject(this,0);
		crearBD();
	}

	
	private void crearBD() {
		Persona persona1 = new Persona("Vicente", 21);
		Persona persona2 = new Persona("Daniel", 20);
		BD_personas.add(persona1);
		BD_personas.add(persona2);
	}
	
	
	public ArrayList<Persona> getPersona() {
		return BD_personas;
	}
	
	
	public Persona CrearPersona(String nombre, int edad) {
		Persona persona = new Persona(nombre, edad);
		BD_personas.add(persona);
		return persona;
	}
}
