

import java.sql.*;


/* Guardar el driver de conexion .jar en nuestro PC y clic derecho con
 * el rat�n en el proyecto, properties,javaBuildPath, libraries, ClassPath, add external jars, 
 * y seleccionamos el driver.jar descargado en nuestro PC  */

public class UsoBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			//1� Crear conexi�n (Clase DriverManager, import java.sql, m�todo getConnection(String url)
			//el m�todo getConnection devuelve un objeto de tipo Connection, por lo q creamos uno
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
			
			//2� Crear statement
			Statement miStatement=miConexion.createStatement();
			
			//3� Ejecutar instrucci�n SQL
			ResultSet miResultset=miStatement.executeQuery("SELECT * FROM PRODUCTOS");
			
			//4� Leer el resulset
			while(miResultset.next())System.out.println(miResultset.getString(2));
			
			miResultset.close();
			miConexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
