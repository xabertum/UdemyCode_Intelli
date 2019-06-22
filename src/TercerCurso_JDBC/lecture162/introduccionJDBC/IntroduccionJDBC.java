package lecture162.introduccionJDBC;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class IntroduccionJDBC {

  public static void main (String args []) {
    String url ="jdbc:mysql://localhost:3306/jdbc_test?useSSL=false";

    // Cargamos el driver de MySQL

    try {
      Class.forName("com.mysql.jdbc.Driver");
      // Creamos el objeto conexión
      Connection connection = (Connection) DriverManager.getConnection(url, "roor", "zanfona");

      // Creamos el objeto Statement
      Statement statement = connection.createStatement();

      // Creamos el query

      String sql = "Select * "



    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}