import java.util.Random;

public class CuentaCorriente {
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombreTitular, double saldo){
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
		Random rnd= new Random();
		numeroCuenta=Math.abs(rnd.nextLong()); //El método Math.abs nos da el valor absoluto de (rnd.nextlong): valor absoluto= valor positivo
		
		
		
	}
	public void setTransferencia(double transferencia, CuentaCorriente cuentaOrigen, CuentaCorriente cuentaDestino) {
		cuentaOrigen.saldo-=transferencia;
		cuentaDestino.saldo += transferencia;
		
	}

	public void setIngreso(double ingreso) {
		saldo=ingreso + saldo;
	}
	public void setReintegro(double reintegro) {
		saldo=saldo - reintegro;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getDatosCuenta() {
		return "saldo: "+saldo+ "\n "+ " Titular: " + nombreTitular +  "\n "+" Cuenta: "+numeroCuenta;
	}
}
	