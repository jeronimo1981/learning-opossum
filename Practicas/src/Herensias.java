
public class Herensias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase2 obj = new Clase2();
		obj.metodo1();
	}
}
class Clase1 {
	private String datos= "abc";
	public void metodo1() {
		System.out.println(datos);
		
		}
	}

class Clase2 extends Clase1{
	private String datos= "efg";
	public void metodo1() {
		//System.out.println(datos);
		}
	}

