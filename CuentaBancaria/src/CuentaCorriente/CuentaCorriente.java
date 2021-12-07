package CuentaCorriente;

import java.util.Random;

import javax.swing.JOptionPane;

public class CuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		CuentaCorriente cuenta1 = new CuentaCorriente(JOptionPane.showInputDialog("Introduce el nombre del titular"), Integer.parseInt(JOptionPane.showInputDialog("Introduce el saldo")));
		CuentaCorriente cuenta2 = new CuentaCorriente("Asunción", 1000);
		cuenta1.setTransferencia(cuenta1, cuenta2, 300);
		System.out.println(cuenta1.getDatos());
		System.out.println(cuenta2.getDatos());
	}

	public CuentaCorriente(String titular, int saldo) {
		Random rnd= new Random();
		this.numCuenta=Math.abs(rnd.nextLong());
		this.titular=titular;
		this.saldo=saldo;
	}
	
	public void setIngreso(int ingreso) {
		saldo=saldo+ingreso;
		
	}
	public void setReintegro(int reintegro) {
		saldo=saldo-reintegro;
		
	}
	public void setTransferencia(CuentaCorriente cuentaOrigen, CuentaCorriente cuentaDestino, int transferencia) {
		cuentaOrigen.saldo-=transferencia;
		cuentaDestino.saldo+=transferencia;
	}
	public String getDatos() {
		return "el titular "+titular+ " con nº de cuenta "+numCuenta+" tiene un saldo de "+saldo+" €";
	}
	public String getSaldo() {
		return "El saldo es de "+saldo+" €";
	}
	
	
	
	
	
	private String titular;
	private int saldo;
	private long numCuenta;
}
