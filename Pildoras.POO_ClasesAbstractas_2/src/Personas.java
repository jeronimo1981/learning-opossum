

import java.util.Date;

public abstract class Personas {

	private String nombre;
	
	public Personas (String nom) {
		nombre=nom;
	}
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
}

class Empleados extends Personas{
	private double sueldo;
	private Date fechaAlta;

	public Empleados(String nom, Date fechaAlta, double sueldo) {
		super(nom);
		// TODO Auto-generated constructor stub
		this.fechaAlta=fechaAlta;
		this.sueldo=sueldo;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		
		return "el empleado "+this.getNombre()+" tiene un sueldo de "+sueldo+" €, y entró a trabajar el "+fechaAlta;
	}
	
}

class Jefes extends Empleados implements ParaJefes{

	private String cargo;
	private double incentivo;
	public Jefes(String nom, Date fechaAlta, double sueldo) {
		super(nom, fechaAlta, sueldo);
		// TODO Auto-generated constructor stub
	}
	 public void setIncentivo(double incentivo) {
		 this.incentivo=incentivo;
	 }
	
	public void setCargo(String cargo) {
		this.cargo=cargo;
	}
			
	public String getCargo() {
		return "\n y tiene el cargo de: "+cargo;
	}
			
		
	
}
class Alumnos extends Personas{

	private String a_optativas;
	private String aula;
	public Alumnos(String nom,String optativas,String aula) {
		super(nom);
		this.aula=aula;
		a_optativas=optativas;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "el alumno "+this.getNombre()+" está en el aula "+aula+ " y "+
				" ha escogido las asignaturas "+a_optativas;
	}
	
}

