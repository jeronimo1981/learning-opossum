/*
 * ESTE PROGRAMA, CON TODOS SUS POSIBLES FALLOS NO DETECTADOS, ES OBRA ORIGINAL DEL 
 * ALUMNO JER�NIMO FERN�NDEZ S�NCHEZ TRAS MUCHAS HORAS DE PELEAR CON EL C�DIGO.
 * ESPERO HABER COMPRENDIDO LA ESENCIA DE LO EXPLICADO EN CLASE, Y HABER ENTENDIDO
 * BIEN LO QUE PED�A EL ENUNCIADO DE LA PAC DE DESARROLLO.
 * POR FAVOR JORGE, APIADATE DE MI. SIGO SIENDO UN NOVATO EN PROGRAMACI�N, PERO DOY TODO LO QUE PUEDO DE MI.
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
