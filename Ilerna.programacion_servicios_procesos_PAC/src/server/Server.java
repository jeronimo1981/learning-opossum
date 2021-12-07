/*
 * ESTE PROGRAMA, CON TODOS SUS POSIBLES FALLOS NO DETECTADOS, ES OBRA ORIGINAL DEL 
 * ALUMNO JERÓNIMO FERNÁNDEZ SÁNCHEZ TRAS MUCHAS HORAS DE PELEAR CON EL CÓDIGO.
 * ESPERO HABER COMPRENDIDO LA ESENCIA DE LO EXPLICADO EN CLASE, Y HABER ENTENDIDO
 * BIEN LO QUE PEDÍA EL ENUNCIADO DE LA PAC DE DESARROLLO.
 * POR FAVOR JORGE, APIADATE DE MI. SIGO SIENDO UN NOVATO EN PROGRAMACIÓN, PERO DOY TODO LO QUE PUEDO DE MI.
 * UN SALUDO!!!!
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

	private final int PUERTO =9876;
	private ServerSocket serverSocket;
	private Socket socket;
	
	
	public Server() throws IOException{
		serverSocket = new ServerSocket(PUERTO);
		socket=new Socket();
	}
	
	public void iniciarServer() throws IOException{
		while (true) {
			System.out.println("Esperando cliente");
			socket = serverSocket.accept();
			
			
			DataOutputStream salidaHaciaClient = new DataOutputStream(socket.getOutputStream());
			salidaHaciaClient.writeUTF("Recibiendo mensaje del servidor");//envia mensaje al cliente
			salidaHaciaClient.writeUTF("Bienvenido, ¿Cómo te llamas?");//envia mensaje al cliente
			
			DataInputStream entradaDesdeClient = new DataInputStream(socket.getInputStream());
			String msjCl;//String que almacena lo que haya en el dataInput
			String nombre;//String que voy a usar para almacenar el nombre recibido desde el cliente
			nombre = entradaDesdeClient.readUTF();//lectura y almacenamiento del nombre introducido por consola en cliente2
			System.out.println("Encantado de verte, "+ nombre);
			
			salidaHaciaClient.writeUTF("¿Cuantas tareas has de realizar?");//pregunta al cliente nro tareas 
			int tareas = Integer.parseInt(entradaDesdeClient.readUTF());//recibe del cliente el número de tareas, casteando a tipo int
			System.out.println("Se han recibido "+tareas+" tareas.");
			
			Tarea arrayTareas[] = new Tarea[tareas];//creo un array para ir guardando las tareas que introduzca el cliente
			//_______________________BUCLE_______________________________________________
			for (int i=0;i<tareas;i++) {
				salidaHaciaClient.writeUTF("Introducción de la tarea: "+ (i+1));//Servidor envía a cliente nº de la tarea
				salidaHaciaClient.writeUTF("Introduce la descripción: ");//Servidor solicita a cliente descripción de tarea
					String descripcion = entradaDesdeClient.readUTF();//recibe la descripción de Tarea
				salidaHaciaClient.writeUTF("Introduce el estado: ");//Servidor solicita a cliente el estado de la Tarea
					String estado = entradaDesdeClient.readUTF();// recibe el estado de la Tarea
					
					arrayTareas[i]= new Tarea(descripcion, estado);//almacenamos descripción de estado de los objetos Tarea en un array de objetos Tarea
					System.out.println(arrayTareas[i].getDescripcion());
					System.out.println(arrayTareas[i].getEstado());
			}
			//______________________________FIN BUCLE_____________________________________
			System.out.println("Listado de tareas");//Se informa que se prepara el envio de la lista de tareas
			
			salidaHaciaClient.writeUTF(Arrays.toString(arrayTareas));//Envio de todas las tareas
			
			
			
			try {
				while (!(msjCl = entradaDesdeClient.readUTF()).isEmpty()) System.out.println(msjCl);
				
			}catch (EOFException e1){}
			
			socket.close();
			salidaHaciaClient.close();
			entradaDesdeClient.close();
		}
	}
	
	public void finalizarServer() throws IOException{
		serverSocket.close();
	}
}
