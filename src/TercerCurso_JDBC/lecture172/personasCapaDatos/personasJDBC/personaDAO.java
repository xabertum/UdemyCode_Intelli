package lecture172.personasCapaDatos.personasJDBC;

import lecture172.personasCapaDatos.personasDTO.personasDTO;
import java.sql.SQLException;
import java.util.List;

/**
 * Esta interfaz contiene los metodos abstractos con las
 * operaciones CRUD basicas sobre la tabla Persona.
 * @author xabertum
 *
 */

public interface personaDAO {
	
	public int insert(personasDTO persona) throws SQLException;
	public int update(personasDTO persona) throws SQLException;
	public int delete(personasDTO persona) throws SQLException;
	public List<personasDTO> select() throws SQLException;

}
