

import java.util.Date;

public class UsoPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Personas Pepe = new Personas("Pepe"); No se puede instanciar una clase abstracta
		/*Empleados Pepe = new Empleados("Pepe",new Date(74687347),2500);
		System.out.println(Pepe.getNombre());
		System.out.println(Pepe.getDescripcion());
		
		Jefes Fulanito = new Jefes("Fulanito",new Date(5454545),20000);
		
		System.out.println(Fulanito.getNombre());
		System.out.println(Fulanito.getDescripcion());
		
		Alumnos Menganito = new Alumnos("Menganito","Religión","Aula B");
		
		System.out.println(Menganito.getNombre());
		System.out.println(Menganito.getDescripcion());
		
		Jefes Perry = new Jefes("Perry Manson", new Date(34567),4800);
		Perry.setCargo("Líder Supremo");
		System.out.println(Perry.getNombre());
		System.out.println(Perry.getDescripcion());
		System.out.println(Perry.getCargo());*/
		
		Empleados empleaditos[]=new Empleados[5];
		empleaditos[0]= new Empleados ("Antonio", new Date (6456546),2500);
		empleaditos[1]= new Empleados ("Maruja", new Date (6456546),2700);
		empleaditos[2]= new Empleados ("Juan Antonio", new Date (6456546),3788);
		empleaditos[3]= new Empleados ("Perry", new Date (6456546),2500);
		empleaditos[4]= new Empleados ("Rogelia", new Date (6456546),3000);
		
		for(Empleados e:empleaditos) {
			System.out.println(e.getDescripcion());
		}
		
	}

}
