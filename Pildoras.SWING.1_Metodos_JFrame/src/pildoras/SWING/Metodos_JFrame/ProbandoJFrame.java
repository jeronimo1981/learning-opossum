package pildoras.SWING.Metodos_JFrame;

import java.awt.*;

import javax.swing.JFrame;

public class ProbandoJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiJFrame frameDePrueba = new MiJFrame();
		//frameDePrueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MiJFrame frame2 = new MiJFrame("titulorro",400,450, 150,150);
		

	}
}

	class MiJFrame extends JFrame {// vamos a crear una clase-marco que herede de JFrame para poder iniciar 
		//JFrames configurados como le indiquemos en el contructor
		
		public MiJFrame() {//constructor del marco
			//setSize(600,250); //indica cuánto mide el marco MiJFrame
			//setLocation(600,300); // con esto se indica dónde se va a iniciar la ventana
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setBounds(600,300,200,200);//esto mata 2 pájaros de un tiro. es un setLocation que situa el marco en la posición 600x300
			//y a su vez es un setSize que da un tamaño cuadrado al marco de 200x200
			
			setExtendedState(Frame.MAXIMIZED_BOTH);//esto hace que el JFrame se inicie maximizado en ambos ejes, pasándose por el forro
			// el setBounds. 
			
			setTitle("++++++++++++++++Ventana de pruebas+++++++++++++++++");//establece el título que se verá en el marco o ventana
			
			
			//Cambiar el icono de java predeterminado de la barra de ventana por uno personalizado
			Toolkit mitulkit =Toolkit.getDefaultToolkit();//la clase toolkit da un poco de morcilla y no deja importar nada para
			//que eclipse deje de dar la brasa. En el import, traemos todo el java.awt.* y puntopelota
			Image miIcono= mitulkit.getImage("icono.jpg");// <-------------- Con esto traeriamos el icono situado en la carpeta src del proyecto
			//Hay que especificarle la ruta absoluta, relativa o una url donde está guardado el icono
			setIconImage(miIcono);
			/*La clase Toolkit es un cajón desastre con un mogollón de métodos/herramientas 
			 * para trabajar con gráficos AWT en java 
			 * */
			
			setVisible(true);// para hacer visible el JFrame
		}	
			
		public MiJFrame(String titulo, int posX, int posY, int ancho, int alto) {//Constructor con paso de parámetros
				
				setTitle(titulo);
				setBounds(posX,posY,ancho,alto);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
	}

