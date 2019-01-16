package SegundoCurso.lecture108.foreach;

public class EjemploForEach {

    public static void main(String[] args) {

        // Creamos un arreglo de Personas
        Persona[] personas = {new Persona("Juan"), new Persona("Karla")};

        // Iteramos cada elemento del arreglo de personas
        for (Persona persona : personas) {
            // Accedemos a las propiedades y/o metodos del objeto
            System.out.println("Nombre persona: " + persona.getNombre());
        }

        System.out.println();
        // Creamos un arreglo de enteros
        int [] edades = {15,20,41,50};
        // Iteramos el arreglo
        for(int edad : edades) {
            System.out.println("Edad: " + edad);
        }
    }

}
