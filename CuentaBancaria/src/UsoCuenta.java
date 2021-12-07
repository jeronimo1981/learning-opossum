
public class UsoCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente Cuenta1 = new CuentaCorriente("Pepito Grillo", 13050);
		CuentaCorriente Cuenta2 = new CuentaCorriente("Antoñita La Pelá", 4677.8);
		Cuenta1.setTransferencia(678.2, Cuenta1, Cuenta2);
		System.out.println(Cuenta1.getSaldo());
		System.out.println(Cuenta2.getDatosCuenta());
	}

}
