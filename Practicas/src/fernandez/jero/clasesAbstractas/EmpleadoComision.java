package fernandez.jero.clasesAbstractas;

public class EmpleadoComision extends Empleado{
	private int nroClientes;
	private double comision;
	private double salario;
	
	
	
	public EmpleadoComision(String dni, String nombre, String apellidos, int anyo,int clientes,double comision) {
		super(dni, nombre,apellidos, anyo);
		nroClientes=clientes;
		this.comision=comision;
	}

	public EmpleadoComision() {
		
	}
	
	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		salario=comision*nroClientes;
		if (salario<950) salario=950;
		return salario;
	
	}
	
	public void setComision(int clientes, double comision) {
		nroClientes=clientes;
		this.comision=comision;
	}

}
