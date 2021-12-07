

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;

public class LaminaPaColores extends JPanel implements ActionListener{

	JButton botonzorro1 = new JButton("Color Rojo");
	JButton botonzorro2 = new JButton("Color Verde");
	JButton botonzorro3 = new JButton("Color Azul");
	
	public LaminaPaColores() {
		add(botonzorro1);
		botonzorro1.addActionListener(this);
		add(botonzorro2);
		botonzorro2.addActionListener(this);
		add(botonzorro3);
		botonzorro3.addActionListener(this);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/* Para saber qué botón es el que desencadena el objeto evento (e), se puede usar el método getSource
		 * que viene en la API si buscamos ActionEvent. Este método detecta quién ha desencadenado el evento,
		 *  devolviendo un objeto (public Object getSource())
		 * */
		 
		Object botonPulsado=e.getSource();//instanciamos un objeto de la clase Object (el megaobjeto supremo de java) y lo iniciamos con e.getSource
		//getSource almacenará qué objeto desencadenó el evento en el objeto-variable botonPulsado
		if (botonPulsado==botonzorro1) {
		setBackground(Color.RED);//Importar java.awt.Color o va a dar morcilla infinita
		}
		else if (botonPulsado==botonzorro2) {
			setBackground(Color.GREEN);//Importar java.awt.Color o va a dar morcilla infinita
			}
		else setBackground(Color.BLUE);
	}
	
}
