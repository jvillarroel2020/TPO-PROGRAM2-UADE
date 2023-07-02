package impl;


import apis.AdministradordeColaPrioridadTDA;
import apis.ConjuntoTDA;
import apis.DiccionarioSimpleTDA;

//import apis.ColaPrioridadTDA;

public class AdministradordeColaPrioridad extends ColaPrioridadLD implements AdministradordeColaPrioridadTDA{ //hereda de la clase ColaPrioridadLD	
	public void inicializar(int cantidadDePuestos) {
	}

	public int acolar(int demora) {
		return 0;
	}

	public void acolar(int idElemento, int demora) {
		acolarPrioridad(idElemento, demora);
	}

	public int cantPuestos() {
		return 0;
	}

	public int proximo() {
		return 0;
	}

	public int posiciónElemento(int idElemento) {
		return 0;
	}

	public DiccionarioSimpleTDA elementos() {
		return null;
	}

	public ConjuntoTDA atendidosXpuesto(int idPuesto) {
		return null;
	}

	public ColaPrioridadLD programacion() {
		return null;
	}

	public int prioridad() {
		return 0;
	}

	

}
