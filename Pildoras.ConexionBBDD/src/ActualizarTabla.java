

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizarTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1� Crear conexi�n (Clase DriverManager, import java.sql, m�todo getConnection(String url)
			//el m�todo getConnection devuelve un objeto de tipo Connection, por lo q creamos uno
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
			
			//2� Crear statement
			Statement miStatement=miConexion.createStatement();
			
			//3� Crear instrucci�n SQL de insercci�n (INSERT,UPDATE o DELETE)
			
			String insert="INSERT INTO PRODUCTOS (CODIGOARTICULO, NOMBREARTICULO, PRECIO) VALUES('AR45','CAMISA FLORES',50)";
			//String insert="UPDATE productos SET PRECIO=70 WHERE CODIGOARTICULO='AR 45'";
			//String insert="DELETE FROM productos WHERE CODIGOARTICULO='AR45'";
			
			//Ejecutar la instrucci�n SQL de insercci�n
			miStatement.executeUpdate(insert);
			System.out.println("Registro insertado correctamenta");//si llega a esta l�nea, es que se ha ejecutado la anterior correctamenta
			
			miConexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
