package test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import apis.AdministradordeColaPrioridadTDA;
import apis.DiccionarioMultipleTDA;
import impl.AdministradordeColaPrioridad;
import impl.ColaPrioridadLD;
import impl.DicMultipleA;



public class TestTPO {

	public static ArrayList<Paciente> nuevoPaciente(AdministradordeColaPrioridadTDA admColas) { //AdministradordeColaPrioridadTDA admColas
		Scanner lector = new Scanner(System.in);
		//AdministradordeColaPrioridadTDA admColas = new AdministradordeColaPrioridad(); 
		//int puestosAt = 0;
		int dni = 0;
		String apellido = "0";
		String nombre = "0";
		int prioridad  = 0;
		int sinPrioridad  = 0;
		boolean continua;
		ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
		lector = new Scanner(System.in);
				
		do {
			try {
				continua = false;
				//System.out.println("Ingrese la cantidad de puestos de atención: ");
				//puestosAt = lector.nextInt();
				//admColas.inicializar(puestosAt);
						
				System.out.println("Ingrese DNI: ");
				dni = lector.nextInt();
						
				System.out.println("Ingrese Apellido: ");
				apellido = lector.next();
						
				System.out.println("Ingrese Nombre: ");
				nombre = lector.next();
				} 
			catch (InputMismatchException ex) {
				System.out.println("Debe ingresar los datos correctamente.");
				lector.next();
				continua = true;
				}
			} while (continua); 
		
		// CargarColaPrioridad: Llena la cola prioridad con los elementos para preparar la simulación.
		//admColas.acolar(4455, -22);
		System.out.println("Ingrese Prioridad, en el caso de que tenga: ");
		prioridad = lector.nextInt();
		if (prioridad == 25 || prioridad == 15 || prioridad == 10){ // Mujer embarazada, Alguna discapacidad, Paciente de guardia
			admColas.acolar(dni, prioridad);
			} else {
				prioridad = -(sinPrioridad+1);
				admColas.acolar(dni, prioridad);
				}
		
		Paciente nuevoPaciente= new Paciente(dni, apellido, nombre, prioridad);
		listaPacientes.add(nuevoPaciente);
		return listaPacientes;
		
	}
	
	//public static AdministradordeColaPrioridadTDA agregarPaciente() {
	//	AdministradordeColaPrioridadTDA cola = new AdministradordeColaPrioridad();	
	//	return cola;
	//}
	
	/**
	 * Lista por pantalla los datos de los pacientes.
	 */
	
	public void mostrarPaciente(int dni, AdministradordeColaPrioridadTDA cola) {
		ArrayList<Paciente> pacientes = nuevoPaciente(cola);
		for (Paciente p: pacientes) {
			if (dni == p.getDni()) {
				p.mostrar();
			}
		}
			
	}
	
	public static void main(String[] args) { //test con 7 puestos de atención y 60 clientes de distintas prioridades
		System.out.println("            UADE LABORATORY CENTER       ");
		System.out.println();
		
		//ColaPrioridadTDA aux = new ColaPrioridadLD();
		//AdministradordeColaPrioridadTDA admColas = new AdministradordeColaPrioridad(); 
		DiccionarioMultipleTDA pacientes = new DicMultipleA(); 
		pacientes.inicializarDiccionario();
		


		Scanner lector = new Scanner(System.in);
		AdministradordeColaPrioridadTDA admColas = new AdministradordeColaPrioridad(); 
		
		int puestosAt = 0;
		try {
			System.out.println("Ingrese la cantidad de puestos de atención: ");
			puestosAt = lector.nextInt();
			admColas.inicializar(puestosAt);
			
		}
		catch(InputMismatchException ex) {
			System.out.println("Debe ingresar los datos correctamente.");
			lector.next();
		}
		ArrayList<Paciente> lista = nuevoPaciente(admColas);
		//agregarPaciente(admColas, lista);
		
		
		// Simular: desacolar los elementos hasta que la cola quede vacía, 
		//imprimiendo en pantalla el próximo elemento, y el puesto al que debe dirigirse.
		
		
	}

}
