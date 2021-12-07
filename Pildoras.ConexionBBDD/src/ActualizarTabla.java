

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizarTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1º Crear conexión (Clase DriverManager, import java.sql, método getConnection(String url)
			//el método getConnection devuelve un objeto de tipo Connection, por lo q creamos uno
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
			
			//2º Crear statement
			Statement miStatement=miConexion.createStatement();
			
			//3º Crear instrucción SQL de insercción (INSERT,UPDATE o DELETE)
			
			String insert="INSERT INTO PRODUCTOS (CODIGOARTICULO, NOMBREARTICULO, PRECIO) VALUES('AR45','CAMISA FLORES',50)";
			//String insert="UPDATE productos SET PRECIO=70 WHERE CODIGOARTICULO='AR 45'";
			//String insert="DELETE FROM productos WHERE CODIGOARTICULO='AR45'";
			
			//Ejecutar la instrucción SQL de insercción
			miStatement.executeUpdate(insert);
			System.out.println("Registro insertado correctamenta");//si llega a esta línea, es que se ha ejecutado la anterior correctamenta
			
			miConexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
