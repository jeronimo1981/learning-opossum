

import java.sql.*;


/* Guardar el driver de conexion .jar en nuestro PC y clic derecho con
 * el ratón en el proyecto, properties,javaBuildPath, libraries, ClassPath, add external jars, 
 * y seleccionamos el driver.jar descargado en nuestro PC  */

public class UsoBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			//1º Crear conexión (Clase DriverManager, import java.sql, método getConnection(String url)
			//el método getConnection devuelve un objeto de tipo Connection, por lo q creamos uno
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
			
			//2º Crear statement
			Statement miStatement=miConexion.createStatement();
			
			//3º Ejecutar instrucción SQL
			ResultSet miResultset=miStatement.executeQuery("SELECT * FROM PRODUCTOS");
			
			//4º Leer el resulset
			while(miResultset.next())System.out.println(miResultset.getString(2));
			
			miResultset.close();
			miConexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
