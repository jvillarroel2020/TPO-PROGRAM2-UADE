package test;

public class Paciente {
	
	private int dni;
	private String apellido;
	private String nombre;
	private int prioridad;
	
	public Paciente(int dni, String apellido, String nombre, int prioridad) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.prioridad = prioridad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	/**
	 * Muestra por consola todos los datos del Paciente
	 */
	public void mostrar() {
		System.out.println("\n\t---------------");
		System.out.println("DNI Paciente: " + dni);
		System.out.println("Apellido: " + apellido);
		System.out.println("Nombre: " + nombre);
		System.out.println("Prioridad: " + prioridad);
		System.out.println("\t---------------");
	}
}


	
