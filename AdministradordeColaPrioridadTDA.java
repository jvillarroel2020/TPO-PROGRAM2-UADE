package apis;

import impl.ColaPrioridadLD;

public interface AdministradordeColaPrioridadTDA extends ColaPrioridadTDA{ //AdministradordeColaPrioridadTDA
			void inicializar( int cantidad); // siempre que el TDA esté inicializado
			
			int acolar( int demora); // siempre que el TDA esté inicializado
			
			void acolar(int idElemento, int demora); // siempre que el TDA esté inicializado Int desacolar(int puesto);
			// La cola no esta vacía
			
			int cantPuestos(); // siempre que el TDA esté inicializado
			
			int proximo();
			// La cola no esta vacía
			
		
			int posiciónElemento(int idElemento);
			// La cola no esta vacía
			DiccionarioSimpleTDA elementos();
			// siempre que el TDA esté inicializado y cola no esté vacía
			ConjuntoTDA atendidosXpuesto ( int idPuesto);
			// siempre que el TDA esté inicializado y cola no esté vacía
			ColaPrioridadLD programacion();
			// siempre que el TDA esté inicializado y cola no esté vacía
			int prioridad (); // Devuelve la prioridad
			// siempre que el TDA esté inicializado y cola no esté vacía

}
