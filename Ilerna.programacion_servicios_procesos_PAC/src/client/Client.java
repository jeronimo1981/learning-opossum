/*
 * ESTE PROGRAMA, CON TODOS SUS POSIBLES FALLOS NO DETECTADOS, ES OBRA ORIGINAL DEL 
 * ALUMNO JER�NIMO FERN�NDEZ S�NCHEZ TRAS MUCHAS HORAS DE PELEAR CON EL C�DIGO.
 * ESPERO HABER COMPRENDIDO LA ESENCIA DE LO EXPLICADO EN CLASE, Y HABER ENTENDIDO
 * BIEN LO QUE PED�A EL ENUNCIADO DE LA PAC DE DESARROLLO.
 * POR FAVOR JORGE, APIADATE DE MI. SIGO SIENDO UN NOVATO EN PROGRAMACI�N, PERO DOY TODO LO QUE PUEDO DE MI.
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
		System.out.println(entradaDesdeServer.readUTF());//mostramos mensaje "Bienvenido�C�mo te llamas?"
		String nombre = sc.nextLine();
		System.out.println("Enviando mensaje al servidor {"+nombre+"}");
		salidaHaciaServer.writeUTF(nombre);//cliente envia el nombre introducido por consola
		System.out.println("Recibiendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//Recibe "�Cuantas tareas has de realizar?"
		String tareas = sc.nextLine();//solicita n�mero de tareas por consola
		System.out.println("Enviando mensaje al servidor {"+tareas+"}");
		salidaHaciaServer.writeUTF(tareas);//Cliente env�a nro de tareas a realizar
		
		int nroTareas=Integer.parseInt(tareas);//casteamos el nro de tareas a int 
		//________________________BUCLE__________________________________
		for(int i=0;i<nroTareas;i++) {
			System.out.println("Leyendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//recepci�n n� de tarea
			System.out.println("Leyendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//recepci�n solicitud de descripci�n de Tarea
				String descripcion = sc.nextLine();//introducci�n por consola de descripci�n de tarea
				System.out.println("Enviando mensaje al servidor {"+descripcion+"}");
				salidaHaciaServer.writeUTF(descripcion);//envio a Server de la descripci�n de Tarea
			System.out.println("Leyendo mensaje del servidor\n"+entradaDesdeServer.readUTF());//recepci�n solicitud del estado de Tarea
				String estado = sc.nextLine();//introducci�n por consola de estado de Tarea
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
