package fernandez.jero.clasesAbstractas;

import java.util.Arrays;

public class UsoEmpleado {

	static Empleado empleaditos[]= new Empleado[4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EmpleadoAsalariado Antonio = new EmpleadoAsalariado("6546546Z","Antonio","López",2014,1125);
		EmpleadoComision Sandra =new EmpleadoComision("7879879S","Sandra","Nieto",2011,169,7.10);
		
		EmpleadoComision Manuel = new EmpleadoComision();
		Manuel.setDni("4654654D");
		Manuel.setNombre("Manuel");
		Manuel.setApellidos("Ruíz");
		Manuel.setFechaAlta(2010);
		Manuel.setComision(35, 6.90);
		
		
		
		EmpleadoAsalariado Maria = new EmpleadoAsalariado();
		Maria.setDni("77879878F");
		Maria.setNombre("María");
		Maria.setApellidos("Ramos");
		Maria.setFechaAlta(2011);
		Maria.setSueldo(1055);
		
		
		empleaditos[0]=Antonio;
		empleaditos[1]=Sandra;
		empleaditos[2]=Manuel;
		empleaditos[3]=Maria;
		
		mostrarTodos(empleaditos);
		sueldoMayor();

	    /*
    sueldoMayor(). Este método recibirá un array de tipo Empleado por parámetros y 
    devolverá el nombre apellido y salario del Empleado con el salario más alto
    mostrarTodos(). Este método recibirá por parámetros un array de tipo Empleado y 
    mostrará los datos de toso los Empleados del array
*/

	}
	public static void mostrarTodos(Empleado cualquierArrayDeTipoEmpleado[]) {
		
		System.out.println("Estos son todos los empleados: ");
			for(int i=0;i<empleaditos.length;i++) {
				empleaditos[i].imprimir();
				//for (Empleado e:empleaditos) {e.imprimir();} también funcionaría con el each-for
			}
			
			
		}
	public static void sueldoMayor() {
		double sueldos;
		double mayor=0;
		
		for(int i=0;i<empleaditos.length;i++) {
			sueldos=empleaditos[i].getSalario();
			if (sueldos>mayor) mayor=sueldos;
			
			
		}System.out.println("El salario mayor es de "+mayor+" euros.");
	}

}
