import javax.swing.JOptionPane;

public class UsoContrasenyas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contrasenyas PasswordsdePepe = new Contrasenyas(Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de caracteres de tu(s) password(s)")), Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas contraseñas quieres crear?")));
		PasswordsdePepe.creaPass();
		System.out.println(PasswordsdePepe.getLongitud());
		System.out.println(PasswordsdePepe.getPass());
			
		System.out.println(PasswordsdePepe.evaluaPass());
		
}
}
