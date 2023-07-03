package impl;


import apis.AdministradordeColaPrioridadTDA;
import apis.ConjuntoTDA;
import apis.DiccionarioSimpleTDA;

//import apis.ColaPrioridadTDA;

public class AdministradordeColaPrioridad extends ColaPrioridadLD implements AdministradordeColaPrioridadTDA{ //hereda de la clase ColaPrioridadLD	
	public void inicializar(int cantidadDePuestos) {
	}

	public int acolar(int demora) {
		//Recibe demora (prioridad negativa) de atención en minutos y devuelve el id del elemento encolado.
		if() {
			
		}
		else {
			System.out.println("Error"); // Cola no inicializada
		}
		return 0;
	}

	public void acolar(int idElemento, int demora) {
		if() {
			acolarPrioridad(idElemento, demora);
		} 
		else {
			System.out.println("Error"); // Cola no inicializada
			}
		
		
	}
	//Recibe id del elemento (debe validar que ya no exista) y la demora. No retorna valor alguno.

	public int desacolar() {
		//Recibe puesto de atención, desacola el próximo elemento a ser atendido por el puesto que recibe como parámetro y retorna su identificador.
		//a) Valida que el puesto de atención corresponda a la cantidad de puestos inicializados : por ejemplo, si cantidad de puestos es 5, los puestos válidos son del 1 al 5.
		//b) Registra la relación puesto, id elemento de la cola prioridad.
		//c) La cola no debe estar vacía.
		return 0;
	}
	
	public int cantPuestos() {
		//Devuelve la cantidad de puestos con que se inicializó el administrador de colas prioridad.
	}
	

	public int proximo() {
		//Devuelve el id del próximo elemento a ser llamado. Se supone que el TDA
		no está vacío.
		return 0;
	}

	public int posiciónElemento(int idElemento) {
		//Recibe un identificador y devuelve la posición en la cola del elemento.
		return 0;
	}

	public DiccionarioSimpleTDA elementos() {
		//Devuelve un diccionario simple con los elementos encolados y la posición en la cola. Nota: Este diccionario se arma dinámicamente al momento de ejecutar el método.
		return null;
	}

	public ConjuntoTDA atendidosXpuesto(int idPuesto) {
		//Recibe un id de un puesto (debe validarla) y retorna un conjunto con los identificadores atendidos por el puesto. En el caso que el puesto sea incorrecto retorna un conjunto vacío.
		return null;
	}

	public ColaPrioridadLD programacion() {
		//Retorna una copia de la cola con prioridad.
		
		return null;
	}

	public int prioridad() {
		//Devuelve la prioridad del siguiente elemento.
		return 0;
	}

	

}
