package practicasColegio;

public class Alumno {
	public Alumno( String nombreAlumno, double notaMedia, Colegio nombreColegio ) {
		this.nombreAlumno=nombreAlumno;
		this.notaMedia=notaMedia;
		nAlumno=nroAlumno;
		nroAlumno++;
		this.nombreColegio=nombreColegio;
		
	}
public void setNotamedia(double notamedia) {
	this.notaMedia=notaMedia;
}
	
public String toString() {
	return "Nombre: "+ nombreAlumno+"\nNota Media: "+notaMedia+"\nNúmero de alumno: "+nAlumno+"\nColegio: "+this.getColegioAlumno();
}
public String getColegioAlumno() {
return this.nombreColegio.getNombreColegio();}

public String getNombreAlumno() {
	return nombreAlumno;
}


	private String nombreAlumno;
	private double notaMedia;
	private static int nroAlumno=1;
	private int nAlumno;
	private Colegio nombreColegio;
}
