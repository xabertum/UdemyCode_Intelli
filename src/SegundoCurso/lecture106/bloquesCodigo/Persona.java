package SegundoCurso.lecture106.bloquesCodigo;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicialización estático
    static {
        // Iniciamos el idPersona desde el valor 10
        contadorPersonas = 10;
        // Aquí no se pueden usar variables no estaticas
        // idPersona = 1; (ERROR)
        System.out.println("Ejecuta bloque estático");
    }

    // Bloque de codigo para inicializar atributos de la clase
    // El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque incializador");
        idPersona = ++contadorPersonas;
    }

    Persona() {
        System.out.println("Ejecuta constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

}
