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

	public personaDAOJdbc() {}
	
	public personaDAOJdbc (Connection connection) {
		this.connection = connection;
	}
	
	
	@Override
	public int insert(personasDTO persona) throws SQLException {
		
		Connection connection;
		PreparedStatement preparedStatement;
		int rows = 0;
		
		try {
			
			connection = (this.connection != null) ? this.connection : Conexion.getConnection();
			preparedStatement = connection.prepareStatement(SQL_INSERT);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		return 0;
	}

	@Override
	public int update(personasDTO persona) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(personasDTO persona) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<personasDTO> select() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
