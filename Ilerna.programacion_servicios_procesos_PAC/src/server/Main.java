/*
 * ESTE PROGRAMA, CON TODOS SUS POSIBLES FALLOS NO DETECTADOS, ES OBRA ORIGINAL DEL 
 * ALUMNO JER�NIMO FERN�NDEZ S�NCHEZ TRAS MUCHAS HORAS DE PELEAR CON EL C�DIGO.
 * ESPERO HABER COMPRENDIDO LA ESENCIA DE LO EXPLICADO EN CLASE, Y HABER ENTENDIDO
 * BIEN LO QUE PED�A EL ENUNCIADO DE LA PAC DE DESARROLLO.
 * POR FAVOR JORGE, APIADATE DE MI. SIGO SIENDO UN NOVATO EN PROGRAMACI�N, PERO DOY TODO LO QUE PUEDO DE MI.
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
