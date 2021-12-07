import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Contrasenyas 
{
	
private int maxChar;// variable para almacenar el número máximo de caracteres que el usuario elige para las contraseñas.
private int maxPass;// variable para almacenar el número máximo de contraseñas a generar.
private String[] arrayContrasenyas ;
private String[] arraySegura ;
Random rnd = new Random();
	
public Contrasenyas(int maxChar, int maxPass) //Constructor
		{
		this.maxChar=maxChar;
		this.maxPass=maxPass;
		arrayContrasenyas = new String [maxPass];
		}
	
public void creaPass() // Método para generar contraseñas.
	{
		
		for(int x=0;x<maxPass;x++) {
		 
			String pass="";
		
			 for (int i=0;i<maxChar;i++)
		 		{
				int aleatorio =rnd.nextInt (3+1);
						if (aleatorio==1){ // números del 1 al 9
						int num =rnd.nextInt(58-48)+48;
						char numeros =(char)num;
						pass+= numeros;
						
						}
					else if (aleatorio==2) { // mayúsculas
						int mayus =rnd.nextInt(91-65)+65;
						char mayusculas =(char)mayus;
						pass +=mayusculas;
						
						}
					else {// minúsculas
						int minus=(rnd.nextInt(123-97)+97);
						char minusculas=(char)minus;
						pass += minusculas;
						
						}
						
						
		 		}
			 arrayContrasenyas[x]= pass + "\n"; }/*Cuando pase todas las contraseñas del array a un String, si imprimo el String mostrará una única cadena con todas las 
			 								contraseñas juntas como si fuesen una sola. Con el salto de línea podrá distinguirse cuál es cada una */
	}
		
	
	
public String getPass() {
		StringBuffer pass= new StringBuffer();
		for (int i=0;i<arrayContrasenyas.length;i++) {
			
			pass=pass.append(arrayContrasenyas[i]);//Añade (appends) todos los Strings almacenados en el array en la variable pass, que es de tipo StringBuffer. 
			}
		String passString= pass.toString();
			
		return "Las contraseñas son:  \n"+passString;
		
	}
	
	
public String getLongitud() {
		return "La longitud de las contraseñas es de "+maxChar+" caracteres.";
	}
	
public String evaluaPass() {
		String evaluaPass;
		String seguraString="";
		String resultado="2222222";
		int mayus=0;
		int minus=0;
		int num=0;
	
		StringBuffer almacenSegura=new StringBuffer();
		String asd[]=new String[maxPass];
		for(int i=0; i<arrayContrasenyas.length;i++) 
			
		{
			evaluaPass=arrayContrasenyas[i];
			mayus=0;minus=0;num=0;//Si no "reseteo", en cada vuelta de bucle se suman los valores de cada String del array y se lía parda
			
				for (int x=0;x<evaluaPass.length();x++) 
				{
					if(Character.isLowerCase(evaluaPass.charAt(x))) minus++;
					else if(Character.isUpperCase(evaluaPass.charAt(x))) mayus++;
					else num++;
						
						if (mayus>=2 && minus>=1 && num>=5) seguraString=("La contraseña "+evaluaPass+" es segura\n");
						else seguraString=("La contraseña "+evaluaPass+" NO es segura\n");	
						
							
				}//System.out.println(seguraString);
				
				asd[i]=seguraString;
				almacenSegura=almacenSegura.append(asd[i]);
				resultado=almacenSegura.toString();
		}
		
		
		return resultado;
				
		
			
				
					
				
		
		
	}
		
	}
	 	
