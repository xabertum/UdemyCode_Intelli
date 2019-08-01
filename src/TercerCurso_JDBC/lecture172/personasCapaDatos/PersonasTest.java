package lecture172.personasCapaDatos;

import java.util.List;

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
			// personaDAO.insert(personasDTO);
			// personaDAO.delete(new personasDTO(3));

			// Probando el update
			personasDTO personaTemPersonasDTO = new personasDTO();
			personaTemPersonasDTO.setId_persona(2);
			personaTemPersonasDTO.setNombre("Belen");
			personaTemPersonasDTO.setApellido("Cuenca");

			personaDAO.update(personaTemPersonasDTO);

			// Probando el SELECT

			List<personasDTO> personasDTOs = personaDAO.select();
			for (personasDTO personasDTO2 : personasDTOs) {
				System.out.println(personasDTO2);
				System.out.println("");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
