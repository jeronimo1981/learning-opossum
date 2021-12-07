/*
 * ESTE PROGRAMA, CON TODOS SUS POSIBLES FALLOS NO DETECTADOS, ES OBRA ORIGINAL DEL 
 * ALUMNO JERÓNIMO FERNÁNDEZ SÁNCHEZ TRAS MUCHAS HORAS DE PELEAR CON EL CÓDIGO.
 * ESPERO HABER COMPRENDIDO LA ESENCIA DE LO EXPLICADO EN CLASE, Y HABER ENTENDIDO
 * BIEN LO QUE PEDÍA EL ENUNCIADO DE LA PAC DE DESARROLLO.
 * POR FAVOR JORGE, APIADATE DE MI. SIGO SIENDO UN NOVATO EN PROGRAMACIÓN, PERO DOY TODO LO QUE PUEDO DE MI.
 * UN SALUDO!!!!
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import server.Tarea;

public class Client {

	private final String HOST ="localhost";
	private final int PUERTO = 9876;
	private Socket socket;
	
	public Client() throws IOException{
		socket = new Socket(HOST, PUERTO);
	
		
	}
	
	public void iniciarClient() throws IOException{
		DataInputStream entradaDesdeServer = new DataInputStream(socket.getInputStream());//Inicio de entrada de datos
		DataOutputStream salidaHaciaServer = new DataOutputStream(socket.getOutputStream());
		Scanner sc = new Scanner(System.in);
		System.out.println(entradaDesdeServer.readUTF());//muestra "Recibiendo mensaje del servidor"
		System.out.println(entradaDesdeServer.readUTF());//mostramos mensaje "Bienvenido¿Cómo te llamas?"
		String nombre = sc.nextLine();
		System.out.println("Enviando mensaje al servidor {"+nombre+"}");
		salidaHaciaServer.writeUTF(nombre);//cliente envia el nombre introducido por consola
		System.out.println("Recibiendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//Recibe "¿Cuantas tareas has de realizar?"
		String tareas = sc.nextLine();//solicita número de tareas por consola
		System.out.println("Enviando mensaje al servidor {"+tareas+"}");
		salidaHaciaServer.writeUTF(tareas);//Cliente envía nro de tareas a realizar
		
		int nroTareas=Integer.parseInt(tareas);//casteamos el nro de tareas a int 
		//________________________BUCLE__________________________________
		for(int i=0;i<nroTareas;i++) {
			System.out.println("Leyendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//recepción nº de tarea
			System.out.println("Leyendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//recepción solicitud de descripción de Tarea
				String descripcion = sc.nextLine();//introducción por consola de descripción de tarea
				System.out.println("Enviando mensaje al servidor {"+descripcion+"}");
				salidaHaciaServer.writeUTF(descripcion);//envio a Server de la descripción de Tarea
			System.out.println("Leyendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//recepción solicitud del estado de Tarea
				String estado = sc.nextLine();//introducción por consola de estado de Tarea
				System.out.println("Enviando mensaje al servidor {"+estado+"}");
				salidaHaciaServer.writeUTF(estado);//envio a Server del estado de la Tarea
				
		}
		//_____________________FIN BUCLE_________________________________
		System.out.println("Leyendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//lectura de la lista de tareas
		
		System.out.println("Cerrando cliente");
		sc.close();
		salidaHaciaServer.close();
		entradaDesdeServer.close();
		socket.close();
	}
}
