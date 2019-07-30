package lecture172.personasCapaDatos.personasJDBC;

import java.sql.*;

public class Conexion {

	private static String JDBC_CONNECTOR = "com.mysql.cj.jdbc.Driver";
	private static String JDBC_URL = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false&serverTimezone=UTC";
	private static String JDBC_USER = "root";
	private static String JDBC_PASS = "zanfona";
	private static Driver driver = null;

	/**
	 * getConnection method, carga la clase JDBC_CONECTOR
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static synchronized Connection getConnection() throws SQLException {

		if (driver == null) {
			try {
				Class<?> jdbcDriverClass = Class.forName(JDBC_CONNECTOR);
				driver = (Driver) jdbcDriverClass.getDeclaredConstructor().newInstance();
				DriverManager.registerDriver(driver);

			} catch (Exception e) {
				System.out.println("Fallo al cargar el driver de MYSQL");
				e.printStackTrace();
			}
		}
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);

	}

	public static void close(ResultSet resultSet) {
		try {
			if (resultSet != null)
				resultSet.close();
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
	}
	
	public static void close (PreparedStatement preparedStatement) {
		try {
			if (preparedStatement != null) preparedStatement.close();
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
	}
	

}
