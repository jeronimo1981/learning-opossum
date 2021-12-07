package practicasColegio;

public class Colegio {
	// constructor
	public Colegio (String nombreColegio, int numAlumnos) {
		this.nombreColegio=nombreColegio;
		 arrayAlumnos= new Alumno[numAlumnos];
	}
	
public String getNombreColegio() {
	return nombreColegio;
}
private Alumno getAlumno(int numAlumno) {
	return arrayAlumnos[numAlumno];
}
public void setNuevoAlumno(String nombre, double notaMedia) {
	Alumno nuevoAlumno = new Alumno(nombre, notaMedia, this);
	arrayAlumnos[nroAlumno]= nuevoAlumno;
	nroAlumno++;
}
public void getTodosAlumnos() {
	for (int i=0;i<arrayAlumnos.length;i++){
		if(this.getAlumno(i)!=null) {
			System.out.println(this.getAlumno(i));
			System.out.println();
		}
	}
}

public void expulsaAlumno(String nombreAlumno) {
	for (int i=0;i<arrayAlumnos.length;i++) {
	
		if (this.getAlumno(i)!=null) {
			if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
				arrayAlumnos[i]=null;
			}
		}
	}
}

private Alumno arrayAlumnos[];
private String nombreColegio;
private static String alumno;
private double notaMedia;
private int nroAlumno=0;
}
