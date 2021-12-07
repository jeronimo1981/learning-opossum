/*
 * ESTE PROGRAMA, CON TODOS SUS POSIBLES FALLOS NO DETECTADOS, ES OBRA ORIGINAL DEL 
 * ALUMNO JERÓNIMO FERNÁNDEZ SÁNCHEZ TRAS MUCHAS HORAS DE PELEAR CON EL CÓDIGO.
 * ESPERO HABER COMPRENDIDO LA ESENCIA DE LO EXPLICADO EN CLASE, Y HABER ENTENDIDO
 * BIEN LO QUE PEDÍA EL ENUNCIADO DE LA PAC DE DESARROLLO.
 * POR FAVOR JORGE, APIADATE DE MI. SIGO SIENDO UN NOVATO EN PROGRAMACIÓN, PERO DOY TODO LO QUE PUEDO DE MI.
 * UN SALUDO!!!!
 */
package server;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Server servidor = new Server();
		System.out.println("Iniciando servidor");
		
		servidor.iniciarServer();//Se inicia el servidor
		
		
		servidor.finalizarServer();

	}

}
