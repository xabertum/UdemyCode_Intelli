package lecture162.introduccionJDBC;

import java.sql.*;

public class IntroduccionJDBC {

  public static void main(String [] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_test?useSSL=false&serverTimezone=UTC";

    // Cargamos el driver de MySQL

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      // Creamos el objeto conexión
      Connection connection = DriverManager.getConnection(url, "root", "zanfona");

      // Creamos el objeto Statement
      Statement statement = connection.createStatement();

      // Creamos el query

      String sql = "SELECT id_persona, nombre, apellido FROM persona";
      ResultSet resultSet = statement.executeQuery(sql);

      while (resultSet.next()) {
        System.out.println("Id: " + resultSet.getInt(1));
        System.out.println(" Nombre: " + resultSet.getString(2));
        System.out.println(" Apellido: " + resultSet.getString(3));
      }

      resultSet.close();
      statement.close();
      connection.close();

    } catch (ClassNotFoundException | SQLException ex) {
      ex.printStackTrace();

    }

  }

}