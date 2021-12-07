
public class Paquete {
	public Paquete(String ref, double peso, String dni, short prioridad) {
		referencia=ref;
		this.dni=dni;
		this.peso=peso;
		this.prioridad=prioridad;
	}

	public void setPeso(double peso) {
		this.peso=peso;
	}
	public void setPrioridad(short prioridad) {
		this.prioridad=prioridad;
	}
	public double getPeso(){
		return peso;
	}
	public short getPrioridad() {
		return prioridad;
	}
	public void setReferencia(String referencia) {
		this.referencia=referencia;
	}
	public String getReferencia(){
		return referencia;
	}
	
	private String referencia;
	private double peso;
	private String dni;
	private short prioridad;
}
