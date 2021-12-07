package fernandez.jero.clasesAbstractas;

import java.util.Calendar;


public class EmpleadoAsalariado extends Empleado{

	private double sueldoFijo;
	private double sueldoAdicional;
	private double sueldoTotal;
	
	
	public EmpleadoAsalariado(String dni, String nombre, String apellidos, int anyo, double sueldoFijo) {
		super(dni, nombre,apellidos, anyo);
		this.sueldoFijo=sueldoFijo;
	}
	public EmpleadoAsalariado() {
		super();
		sueldoFijo=0.0;
	}
	public void setSueldo(double sueldoFijo) {
		this.sueldoFijo=sueldoFijo;
		
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		
		
	  	Calendar fechaActual = Calendar.getInstance();
	  	int anyoActual=fechaActual.get(Calendar.YEAR);
	  	int anyos=anyoActual - getFechaAlta();
		/*long antiguedadEnDias = (fechaActual.getTimeInMillis() - fechaAlta.getTimeInMillis())
                / 1000 / 60 / 60 / 24;
		int anyos = Double.valueOf(antiguedadEnDias / 365.25).intValue();*/
		//System.out.println(anyos);
		if (anyos<2) {
			sueldoTotal=sueldoFijo;
	
		}
		else if ((anyos >=2) &&(anyos <=3)) {
			sueldoAdicional=(7*sueldoFijo)/100;
			sueldoTotal=sueldoFijo+sueldoAdicional;
		}
		else if ((anyos >=4) &&(anyos <=8)) {
			sueldoAdicional=(11*sueldoFijo)/100;
			sueldoTotal=sueldoFijo+sueldoAdicional;
		}
		else if ((anyos >=9) &&(anyos <=15)) {
			sueldoAdicional=(17*sueldoFijo)/100;
			sueldoTotal=sueldoFijo+sueldoAdicional;
		}
		else {
			sueldoAdicional=(22*sueldoFijo)/100;
			sueldoTotal=sueldoFijo+sueldoAdicional;
		}
		
		return sueldoTotal;
	}
}
