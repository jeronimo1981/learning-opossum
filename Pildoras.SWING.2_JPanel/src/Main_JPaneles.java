import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Main_JPaneles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiJFrame marcoFrame = new MiJFrame();
		marcoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

//Creaci�n de una clase que hereda de JFrame y su constructor para usar Frames
class MiJFrame extends JFrame{
	public MiJFrame() {
		setBounds(400,200,300,300);
		setTitle("escritura en un JFrame");
		setVisible(true);
		//Instanciamos un objeto de tipo MiJPanel para tener un JPanel sobre el que se pueda escribir
		MiJPanel mijpanel1 = new MiJPanel();
		//agregamos el JPanel al marco/JFrame
		add(mijpanel1);
		
	}
}

/*Creaci�n de la L�mina o JPanel con su constructor.
 * Podemos tener varios JPanel superpuestos sobre el Frame. Y uno puede tapar a otro, o puede verse a trav�s
 * de ellos con propiedad de transparencia o la movida que necesitemos
 * */
 
 class MiJPanel extends JPanel{
	 MiJPanel(){
		 //Las dimensiones por defecto del JPanel, y la ubicaci�n donde comience, es la misma que la del marco que lo alberga. Podemos dejarlo as�
		 //o redimensionarlo seg�n nos convenga
		 
		
		 
	 }
	 //Sobreescibimos el m�todo paintComponent que viene en la clase JPanel
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);//con super hacemos que pinte componentes como hace esta funci�n en la clase padre. 
		 //Aqui hay que redefinir esta funci�n, ya que hemos sobreescrito el metodo.
		 g.drawString("Mi panel",20,20);//con este metodo dibujarString, escribimos un string en la posici�n x20 y20
		 
	 }
 }