package practicasColegio;

public class UsoColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Colegio Teresianas=new Colegio("Teresianas", 1000);
		
		Teresianas.setNuevoAlumno("Juan Antonio", 6.5);
		Teresianas.setNuevoAlumno("Jose Luis", 6.0);
		Teresianas.setNuevoAlumno("Antonio", 7.0);
		Teresianas.getTodosAlumnos();
		Teresianas.expulsaAlumno("Juan Antonio");
		Teresianas.getTodosAlumnos();
		
		
		
	}

}

