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
			//setSize(600,250); //indica cu�nto mide el marco MiJFrame
			//setLocation(600,300); // con esto se indica d�nde se va a iniciar la ventana
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setBounds(600,300,200,200);//esto mata 2 p�jaros de un tiro. es un setLocation que situa el marco en la posici�n 600x300
			//y a su vez es un setSize que da un tama�o cuadrado al marco de 200x200
			
			setExtendedState(Frame.MAXIMIZED_BOTH);//esto hace que el JFrame se inicie maximizado en ambos ejes, pas�ndose por el forro
			// el setBounds. 
			
			setTitle("++++++++++++++++Ventana de pruebas+++++++++++++++++");//establece el t�tulo que se ver� en el marco o ventana
			
			
			//Cambiar el icono de java predeterminado de la barra de ventana por uno personalizado
			Toolkit mitulkit =Toolkit.getDefaultToolkit();//la clase toolkit da un poco de morcilla y no deja importar nada para
			//que eclipse deje de dar la brasa. En el import, traemos todo el java.awt.* y puntopelota
			Image miIcono= mitulkit.getImage("icono.jpg");// <-------------- Con esto traeriamos el icono situado en la carpeta src del proyecto
			//Hay que especificarle la ruta absoluta, relativa o una url donde est� guardado el icono
			setIconImage(miIcono);
			/*La clase Toolkit es un caj�n desastre con un mogoll�n de m�todos/herramientas 
			 * para trabajar con gr�ficos AWT en java 
			 * */
			
			setVisible(true);// para hacer visible el JFrame
		}	
			
		public MiJFrame(String titulo, int posX, int posY, int ancho, int alto) {//Constructor con paso de par�metros
				
				setTitle(titulo);
				setBounds(posX,posY,ancho,alto);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
	}

