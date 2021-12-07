

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1º Crear conexión (Clase DriverManager, import java.sql, método getConnection(String url)
			//el método getConnection devuelve un objeto de tipo Connection, por lo q creamos uno
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
			
			//2º Crear PrepareStatement
			String sentencia ="SELECT CODIGOARTICULO, NOMBREARTICULO FROM productos WHERE SECCION=? AND PAISORIGEN=?";
			PreparedStatement miPrepareStatement=miConexion.prepareStatement(sentencia);
			
			miPrepareStatement.setString(1, "DEPORTES");// 1 es SECCION, "DEPORTES" el valor de SECCION
			miPrepareStatement.setString(2, "USA");//2 es PAISORIGEN, "USA" el valor de PAISORIGEN
			
			//3º Ejecutar instrucción SQL
			ResultSet miResultset=miPrepareStatement.executeQuery();
			
			//4º Leer el resulset
			while(miResultset.next())System.out.println(miResultset.getString(1)+" "+miResultset.getString(2));
			
			miResultset.close();
			
			//Reutilización de consulta preparada
			System.out.println("---------------------------------------");
			
			miPrepareStatement.setString(1, "CONFECCIÓN");
			miPrepareStatement.setString(2, "ITALIA");
			ResultSet miResultset2=miPrepareStatement.executeQuery();
			while(miResultset2.next())System.out.println(miResultset2.getString(1)+" "+miResultset2.getString(2));
			
			miConexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
