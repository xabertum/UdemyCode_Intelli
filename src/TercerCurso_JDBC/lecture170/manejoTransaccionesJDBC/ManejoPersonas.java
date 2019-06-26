package lecture170.manejoTransaccionesJDBC;

import java.sql.Connection;
import java.sql.SQLException;


@SuppressWarnings("SpellCheckingInspection")
public class ManejoPersonas {

  public static void main(String[] args) {

    Connection connection = null;

    try {
      connection = Conexion.getConnection();

      // Revisamos si la conexion esta en modo autocommit
      if (connection.getAutoCommit()) connection.setAutoCommit(false);

      // Creamos el objeto PersonasJDBC y proporcionamos la conexión creada;

      personasJDBC personasJDBC_conn = new personasJDBC(connection);

      // Prueba del metodo UPDATE
      personasJDBC_conn.update(2, "Carlos", "Gonzalez");

      // Prueba del metodo INSERT
      personasJDBC_conn.insert("Alberto", "Juarez");

      // Prueba del metodo DELETE
      personasJDBC_conn.delete(13);

      // Guardamos los cambios
      connection.commit();

    } catch (SQLException sqlEx) {

      // Hacemos rollback en caso de error

      try {
        System.out.println("Entramos al roolback");
        sqlEx.printStackTrace();

        connection.rollback();

      } catch (SQLException ex) {
        ex.printStackTrace();
      }

    }

  }

}
