package fernandez.jero.clasesAbstractas;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Empleado {

	private String dni;
	private String nombre;
	private String apellidos;
	private int fechaAlta;
	//Calendar fechaAlta=Calendar.getInstance();; 
	//GregorianCalendar fechaAlta;
	
	
	
	public Empleado(String dni, String nombre,String apellidos, int anyo){
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		fechaAlta=anyo;
		 
		//fechaAlta.set(Calendar.YEAR, anyo);
	}
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract double getSalario();{}
	
	
	public void setDni( String dni) {
		this.dni=dni;
	}
	public String getDni() {
		return dni;
	}
	public void setNombre( String nom) {
		nombre=nom;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellidos( String apellidos) {
		this.apellidos=apellidos;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setFechaAlta(int anyo) {
		//fechaAlta.set(Calendar.YEAR, anyo);
		fechaAlta=anyo;
	}
	public int getFechaAlta() {
		return fechaAlta;
	}
	
	public void imprimir() {
		System.out.println("El empleado "+getNombre()+" "+getApellidos()+"\ntiene el DNI "+getDni()+
				" y fue dado de alta en "+getFechaAlta()
		);
		
	}
	public void setDatos(String dni, String nombre,String apellidos, int anyo){
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		fechaAlta= anyo;
	}
	
}
