package lecture172.personasCapaDatos.personasJDBC;

import lecture172.personasCapaDatos.personasDTO.personasDTO;
import java.sql.SQLException;
import java.util.List;

public interface personaDAO {
	
	public int insert(personasDTO persona) throws SQLException;
	public int update(personasDTO persona) throws SQLException;
	public int delete(personasDTO persona) throws SQLException;
	public List<personasDTO> select() throws SQLException;

}
