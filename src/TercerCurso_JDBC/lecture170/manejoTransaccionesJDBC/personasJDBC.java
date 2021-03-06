package lecture170.manejoTransaccionesJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class personasJDBC {

  /*
    Nos apoyamos de la clave primaria autoincrementable de Mysql
    por lo que se omite el campo de id_persona
    Se utiliza un prepareStatement por que lo podemos utilizar parametros (signos ?)
    que serán sustituidos por el contenido respectivo.
  */

  private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido) VALUES(?,?)";
  private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
  private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
  private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona ORDER BY id_persona";
  private java.sql.Connection userConn;

  public personasJDBC (){}

  public personasJDBC (Connection connection) {
    this.userConn = connection;
  }

  /**
   *
   * Ejecuta el INSERT en la tabla persona.
   *
   * @param nombre
   * @param apellido
   * @return
   */
  public int insert (String nombre, String apellido) throws SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    int rows = 0;

    try {

      int index = 1;
      connection = (this.userConn != null) ? this.userConn : Conexion.getConnection();
      preparedStatement = connection.prepareStatement(SQL_INSERT);
      preparedStatement.setString(index++, nombre);
      preparedStatement.setString(index++, apellido);
      System.out.println("Ejecutando Query: " + SQL_INSERT);
      rows = preparedStatement.executeUpdate();
      System.out.println("Registros afectados: " + rows);

    } finally {
      Conexion.close(preparedStatement);

      if (this.userConn == null) {
        Conexion.close(connection);
      }
    }

    return rows;

  }

  /**
   *
   * Ejecuta el UPDATE en la tabla persona.
   *
   * @param id_persona
   * @param nombre
   * @param apellido
   * @return
   */

  public int update (int id_persona, String nombre, String apellido) throws SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    int rows = 0;

    try {

      int index = 1;
      connection = (this.userConn != null) ? this.userConn : Conexion.getConnection();
      System.out.println("Ejecutando query: " + SQL_UPDATE);
      preparedStatement = connection.prepareStatement(SQL_UPDATE);
      preparedStatement.setString(index++, nombre);
      preparedStatement.setString(index++, apellido);
      preparedStatement.setInt(index, id_persona);
      rows = preparedStatement.executeUpdate();
      System.out.println("Registros actualizados: " + rows);

    } finally {
      Conexion.close(preparedStatement);

      if (this.userConn == null) {
        Conexion.close(connection);
      }
    }

    return rows;
  }


  /**
   *
   * Ejecuta el DELETE en la tabla persona.
   *
   * @param id_persona
   * @return
   */
  public int delete (int id_persona) throws SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    int rows = 0;

    try {
      int index = 1;
      connection = (this.userConn != null) ? this.userConn : Conexion.getConnection();
      System.out.println("Ejecutando Query: " + SQL_DELETE);
      preparedStatement = connection.prepareStatement(SQL_DELETE);
      preparedStatement.setInt(index, id_persona);
      rows = preparedStatement.executeUpdate();
      System.out.println("Registros eliminados: " + rows);

    } finally {
      Conexion.close(preparedStatement);

      if (this.userConn == null) {
        Conexion.close(connection);
      }
    }
    return rows;
  }


  /**
   *
   * Ejecuta el SELECT en la tabla persona.
   *
   * @return
   */
  public List<Persona> select () throws SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Persona persona;
    List<Persona> personas = new ArrayList<Persona>();

    try {
      connection = (this.userConn != null) ? this.userConn : Conexion.getConnection();
      preparedStatement = connection.prepareStatement(SQL_SELECT);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        persona = new Persona();
        int id_persona = resultSet.getInt(1);
        String nombre = resultSet.getString(2);
        String apellido = resultSet.getString(3);

        persona.setId_persona(id_persona);
        persona.setNombre(nombre);
        persona.setApellido(apellido);

        personas.add(persona);

      }
    } finally {
      Conexion.close(preparedStatement);
      Conexion.close(resultSet);

      if (this.userConn == null) {
        Conexion.close(connection);
      }
    }

    return personas;

  }

}
