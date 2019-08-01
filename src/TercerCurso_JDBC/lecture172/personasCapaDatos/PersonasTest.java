package lecture172.personasCapaDatos;

import lecture172.personasCapaDatos.personasDTO.personasDTO;
import lecture172.personasCapaDatos.personasJDBC.personaDAO;
import lecture172.personasCapaDatos.personasJDBC.personaDAOJdbc;

public class PersonasTest {

	public static void main(String[] args) {
		// Utilizamos el tipo interface como referencia 
		// a una clase concreta.
		
		personaDAO personaDAO = new personaDAOJdbc();
		personasDTO personasDTO = new personasDTO();
		
		personasDTO.setNombre("Javier");
		personasDTO.setApellido("Delgado");
		
		try {
			//personaDAO.insert(personasDTO);
			personaDAO.delete(new personasDTO(3));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
