
public class GuerrerosHerenciaPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vikingo Erik= new Vikingo(2,2,3);
//Erik.setEspada(2);
System.out.println(Erik.getInfoVikingo());
	}

}
class Guerrero {
	public Guerrero(int escudo, int espada){
		 this.escudo=escudo ;
		 this.espada=espada;
	}
	public int getEspada() {
		return espada;
	}
	public int getEscudo() {
		return escudo;
	}
	public void setEspada(int espada) {
		this.espada=espada;
	}
	private int escudo;
	private int espada;
}

class Vikingo extends Guerrero{
	public Vikingo (int escudo, int espada, int casco) {
		super (escudo, espada);
		this.casco = casco;
		
	}
	public String getInfoVikingo() {
		return "Este vikingo tiene "+casco+" casco,"+getEscudo()+" escudo y "+getEspada()+" espada.";
	}
	private int casco;
	
	
}