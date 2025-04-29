package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfazDeServer extends Remote{
	public ArrayList<Persona> getPersona() throws RemoteException;
	public Persona CrearPersona(String nombre, int edad) throws RemoteException;
}