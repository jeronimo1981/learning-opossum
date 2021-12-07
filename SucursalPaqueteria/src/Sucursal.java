
public class Sucursal {
	
	public Sucursal (int sucursal, String direccion, String ciudad) {
		numeroSucursal=sucursal;
		this.direccion=direccion;
		this.ciudad=ciudad;
	}
	
	/*public void setSucursal(int sucursal) {
		numeroSucursal=sucursal;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	public void setCiudad(String ciudad) {
		this.ciudad=ciudad;
	}*/
	public int getSucursal() {
		return numeroSucursal;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getCiudad() {
		return this.ciudad;
	}
	public void setPrecio() {
		
	}
	public void setPrecio(Paquete paq) {// establecera el precio (para prioridad 0)en 10euros‚¬ para 5kg o menos, 20euros‚¬ para mas de 5kg hasta 10kg, y 50euros para mas de 10kg
		if ((paq.getPrioridad())==0)
		{
			if((paq.getPeso())<=5) precio=10;
			else if ((paq.getPeso())>5 && (paq.getPeso())<=10) precio=20;
			else precio=50;
		}
		// incremento adicional para prioridades 1 o 2:
		else if ((paq.getPrioridad())==1)
		{
			if((paq.getPeso())<=5) precio=10;
			else if ((paq.getPeso())>5 && (paq.getPeso())<=10) precio=20;
			else precio=50;
			precio=precio+10;
		}
		else if ((paq.getPrioridad())==2)
		{
			if((paq.getPeso())<=5) precio=10;
			else if ((paq.getPeso())>5 && (paq.getPeso())<=10) precio=20;
			else precio=50;
			precio=(precio+20);
		}
		else System.out.println("La prioridad solo puede ser 0-Normal, 1-prioritaria, 2-urgente");
		
	}
	public double getPrecio() {
		return precio;
	}
	private double precio;
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
}
