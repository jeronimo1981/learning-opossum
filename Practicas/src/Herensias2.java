
public class Herensias2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //ClaseB B = new ClaseB("a", "b","c") ;
 //B.setStringes("d");
 //System.out.println(B.getStringes());
 ClaseA X = new ClaseB("a", "b", "c") ;
 X.setStringes("d","d");  // No deja usar este método de ClaseB 
 System.out.println(X.getStringes());
 X.pruebaConsola();
 //B.pruebaConsola();
 
 
	}
}
class ClaseA{
	private String string1;
	private String string2;
	
	public ClaseA(String string1, String string2) {
		this.string1=string1;
		this.string2=string2;
	}
	public void pruebaConsola() {
		System.out.println(string1+string2);
	}
	public void setStringes(String stringi1, String stringi2) {
		string1=stringi1;
		string2=stringi2;
		}
	public String getStringes() {
		return " ,el string1 es "+string1 +" ,y el string2 es "+ string2;
	}
}



class ClaseB extends ClaseA{

	public ClaseB(String string1, String string2, String string3) {
		super (string1, string2);
		this.string3=string3;
	}
	public String getStringes() {
		return "el string3 es "+ string3 + super.getStringes();
	}
	public void setStringes(String stringi3) {
		string3=stringi3;
				}
	public void pruebaConsola() {
		System.out.println(string3);
	}
	private String string3;
	
	
	}
	



