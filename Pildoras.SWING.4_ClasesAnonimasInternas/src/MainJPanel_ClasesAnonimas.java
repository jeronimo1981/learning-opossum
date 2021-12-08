import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class MainJPanel_ClasesAnonimas {

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
			/*MiJPanel mijpanel1 = new MiJPanel();
			add(mijpanel1);*/
			add(new JPanel() {
				public void paintComponent(Graphics g) {
				super.paintComponent(g);
				/*Color miColor = new Color (255,120,130);
				g.setColor(miColor);*/
				g.setColor(new Color(255,120,130));
				g.drawString("Esto es el texto de pruebas",100, 100);
				
				/*Color miColor2 = new Color(10,200,10);
				g.setColor(miColor2);*/
				g.setColor(new Color(10,200,100));
				
				/*Font miFuente2 = new Font("Verdana", Font.BOLD, 16);
				g.setFont(miFuente2);*/
				g.setFont(new Font	("Verdana", Font.BOLD, 16));
				
				g.drawString("Otro texto de pruebas con otro color y fuente",100, 150);
				}
			});
		}
	}
	
	/*class MiJPanel extends JPanel{
		//Sobreescibimos el método paintComponent de JPanel
		public void paintComponent(Graphics g) {//importamos la clase graphics de java.awt
			super.paintComponent(g);
			Color miColor = new Color (255,120,130);
			g.setColor(miColor);
			g.setColor(new Color(255,120,130));
			g.drawString("Esto es el texto de pruebas",100, 100);
			
			Color miColor2 = new Color(10,200,10);
			g.setColor(miColor2);
			g.setColor(new Color(10,200,100));
			
			Font miFuente2 = new Font("Verdana", Font.BOLD, 16);
			g.setFont(miFuente2);
			g.setFont(new Font	("Verdana", Font.BOLD, 16)
			);
			
			g.drawString("Otro texto con otro color distinto",100,120);
		}*/
	