import javax.swing.JOptionPane;

public class Uso_Sucursal_y_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sucursal;
		String direccion;
		String ciudad;
		int nroPaquetes;
		
		Sucursal suc1= new Sucursal(Integer.parseInt(JOptionPane.showInputDialog("Introduzca n∫ sucursal: ")), 
				JOptionPane.showInputDialog("Introduzca direccion de envio: "), 
				JOptionPane.showInputDialog("Introduzca ciudad: "));
		nroPaquetes=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de paquetes: "));
		Paquete paq1= new Paquete(JOptionPane.showInputDialog("Introduzca referencia del paquete: "),
				Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso total de los paquetes: ")),
				JOptionPane.showInputDialog("Introduzca el DNI del remitente: "),
				Short.parseShort(JOptionPane.showInputDialog("Introduzca la prioridad del paquete: (0-Normal, 1-Alta, 2-Urgente)"))
				);
		suc1.setPrecio(paq1);//Establecimiento del precio con los datos introducidos por parametro de paq1 y el setter de la clase Sucursal para el precio
		
		//impresion por consola de los datos:
		System.out.println("Sucursal: "+suc1.getSucursal()+" Direcci√≥n: "+suc1.getDireccion()+" Ciudad: "+suc1.getCiudad()+"\n"+
		"Ref. paquete: "+paq1.getReferencia()+" Peso: "+paq1.getPeso()+" Prioridad: "+paq1.getPrioridad());
		System.out.println(" Precio: "+suc1.getPrecio());
					
	}

}
