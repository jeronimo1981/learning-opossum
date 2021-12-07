/*
 * ESTE PROGRAMA, CON TODOS SUS POSIBLES FALLOS NO DETECTADOS, ES OBRA ORIGINAL DEL 
 * ALUMNO JERÓNIMO FERNÁNDEZ SÁNCHEZ TRAS MUCHAS HORAS DE PELEAR CON EL CÓDIGO.
 * ESPERO HABER COMPRENDIDO LA ESENCIA DE LO EXPLICADO EN CLASE, Y HABER ENTENDIDO
 * BIEN LO QUE PEDÍA EL ENUNCIADO DE LA PAC DE DESARROLLO.
 * POR FAVOR JORGE, APIADATE DE MI. SIGO SIENDO UN NOVATO EN PROGRAMACIÓN, PERO DOY TODO LO QUE PUEDO DE MI.
 * UN SALUDO!!!!
 */
package server;

public class Tarea {
	private String descripcion;
	private String estado;
	
	//constructor
	public Tarea(String descripcion, String estado) {
		this.descripcion=descripcion;
		this.estado=estado;
			
	}
	
	public String getDescripcion() {
		return "Descripcion recibida: "+descripcion;
	}
	public void setDescripcion(String nombre) {
		this.descripcion = nombre;
	}
	public String getEstado() {
		return "Estado recibido: "+estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Tarea: " + descripcion + ",con estado: " + estado+"\n";
	}
	
}
