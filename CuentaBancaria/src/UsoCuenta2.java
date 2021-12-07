import javax.swing.JOptionPane;

public class UsoCuenta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente2 Cuenta1 = new CuentaCorriente2(JOptionPane.showInputDialog("Introduzca el titular"), Double.parseDouble(JOptionPane.showInputDialog("Introduzca el saldo")));
		CuentaCorriente2 Cuenta2 = new CuentaCorriente2("Antoñita La Pelá", 4677.8);
		Cuenta1.setTransferencia(678.2, Cuenta1, Cuenta2);
		System.out.println(Cuenta1.getSaldo());
		System.out.println(Cuenta1.getDatosCuenta());
	}

}
