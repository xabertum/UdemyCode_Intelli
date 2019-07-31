package lecture172.personasCapaDatos.personasJDBC;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import lecture172.personasCapaDatos.personasDTO.personasDTO;

public class personaDAOJdbc implements personaDAO {

	private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido) VALUES(?,?)";
	private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
	private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
	private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona ORDER BY id_persona";
	private Connection connection;

	public personaDAOJdbc() {
	}

	public personaDAOJdbc(Connection connection) {
		this.connection = connection;
	}

	@Override
	public int insert(personasDTO persona) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;

		try {
			connection = (this.connection != null) ? this.connection : Conexion.getConnection();
			preparedStatement = connection.prepareStatement(SQL_INSERT);
			int index = 1;
			preparedStatement.setString(index++, persona.getNombre());
			preparedStatement.setString(index++, persona.getApellido());
			System.out.println("Ejecutando Query: " + SQL_INSERT);
			rows = preparedStatement.executeUpdate();
			System.out.println("Registros afectados: " + rows);
		} finally {
			Conexion.close(preparedStatement);
			if (this.connection == null)
				Conexion.close(connection);
		}

		return rows;
	}

	@Override
	public int update(personasDTO persona) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;

		try {
			connection = (this.connection != null) ? this.connection : Conexion.getConnection();
			preparedStatement = connection.prepareStatement(SQL_UPDATE);
			int index = 1;
			preparedStatement.setString(index++, persona.getNombre());
			preparedStatement.setString(index++, persona.getApellido());
			preparedStatement.setInt(index, persona.getId_persona());
			System.out.println("Ejecutando Query: " + SQL_UPDATE);
			rows = preparedStatement.executeUpdate();
			System.out.println("Registros actualizados: " + rows);

		} finally {
			Conexion.close(preparedStatement);
			if (this.connection == null)
				Conexion.close(connection);
		}

		return rows;
	}

	@Override
	public int delete(personasDTO persona) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int rows = 0;

		try {
			connection = (this.connection != null) ? this.connection : Conexion.getConnection();
			System.out.println("Ejecutando Query: " + SQL_DELETE);
			preparedStatement = connection.prepareStatement(SQL_DELETE);
			int index = 1;
			preparedStatement.setInt(index, persona.getId_persona());
			rows = preparedStatement.executeUpdate();
			System.out.println("Registros borrados: " + rows);

		} finally {
			Conexion.close(preparedStatement);
			if (this.connection == null)
				Conexion.close(connection);
		}

		return rows;
	}

	@Override
	public List<personasDTO> select() throws SQLException {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		personasDTO personaDTO = null;
		List<personasDTO> personasDTOs = new ArrayList<personasDTO>();

		try {

			connection = (this.connection != null) ? this.connection : Conexion.getConnection();
			preparedStatement = connection.prepareStatement(SQL_SELECT);
			System.out.println("Ejecutando Query: " + SQL_SELECT);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idPersonaTemp = resultSet.getInt(1);
				String nombrePersonaTempString = resultSet.getString(2);
				String apellidoPersonaTempString = resultSet.getString(3);

				personaDTO = new personasDTO();
				personaDTO.setId_persona(idPersonaTemp);
				personaDTO.setNombre(nombrePersonaTempString);
				personaDTO.setApellido(apellidoPersonaTempString);

				personasDTOs.add(personaDTO);

			}

		} finally {
			Conexion.close(resultSet);
			Conexion.close(preparedStatement);
			if (this.connection == null)
				Conexion.close(connection);
		}

		return personasDTOs;
	}

}
