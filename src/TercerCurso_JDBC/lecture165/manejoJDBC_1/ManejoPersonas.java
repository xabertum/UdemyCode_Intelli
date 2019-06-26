package lecture165.manejoJDBC_1;

import java.util.List;

public class ManejoPersonas {

  public static void main (String [] args) {

    personasJDBC personasJDBC = new personasJDBC();

    // Prueba del metodo INSERT
    //personasJDBC.insert("Alberto", "Juarez");

    // Prueba del metodo UPDATE
    personasJDBC.update(2, "Carlos", "Gonzalez");

    // Prueba del metodo DELETE
    personasJDBC.delete(13);

    // Prueba del metodo SELECT
    List<Persona> personas = personasJDBC.select();
    personas.forEach(persona -> {
      System.out.println(persona);
      System.out.println("");
    });


  }

}
