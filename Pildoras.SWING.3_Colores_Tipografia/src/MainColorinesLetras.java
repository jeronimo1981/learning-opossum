import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class MainColorinesLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiJFrame frame1 = new MiJFrame();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

	
	class MiJFrame extends JFrame{
		public MiJFrame(){
			setBounds(200,200,600,600);
			setTitle("Pruebas de color y fuentes en texto");
			setVisible(true);
			MiJPanel mijpanel1 = new MiJPanel();
			add(mijpanel1);
		}
	}
	
	class MiJPanel extends JPanel{
		//Sobreescibimos el método paintComponent de JPanel
		public void paintComponent(Graphics g) {//importamos la clase graphics de java.awt
			super.paintComponent(g);
			Color miColor = new Color (255,120,130);//Importamos la clase Color de java.awt, el parámetro que le pasamos
			//al objeto Color son un entero que define los colores RGB
			g.setColor(miColor);// el objeto Graphics, osea g, tiene que ser configurado primero el color y luego se le dice 
			//que String se va a dibujar(el texto que se escribira en pantalla). Si invertimos esto en el flujo de ejecución,
			//escribira el texto y le pondra color al coño la Bernarda
			g.drawString("Esto es el texto de pruebas",100, 100);
			
			Color miColor2 = new Color(10,200,10);
			g.setColor(miColor2);
			
			Font miFuente2 = new Font("Verdana", Font.BOLD, 16);//(nombreFuente,Negrita o lo q sea, tamaño)
			//BOLD = negrita = 1, ITALIC = cursiva=2,3= negrita+cursiva  ----- se puede poner Font.BOLD o 1
			//el nombre de la fuente debe ser el de una fuente que este en el S.O. donde se ejecute la aplicacion
			g.setFont(miFuente2);
			
			g.drawString("Otro texto con otro color distinto",100,120);
		}
	}

