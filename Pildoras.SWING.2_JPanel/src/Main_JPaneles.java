import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
	}
}

/*Creaci�n de la L�mina o JPanel con su constructor.
 * Podemos tener varios JPanel superpuestos sobre el Frame. Y uno puede tapar a otro, o puede verse a trav�s
 * de ellos con propiedad de transparencia o la movida que necesitemos
 * */
 
 class MiJPanel extends JPanel{
	 MiJPanel(){
		 //Las dimensiones por defecto del JPanel es la misma que la del marco que lo alberga. Podemos dejarlo as�
		 //o edimensionarlo seg�n nos convenga
	 }
 }