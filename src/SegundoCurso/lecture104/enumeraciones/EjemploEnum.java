package SegundoCurso.lecture104.enumeraciones;

public class EjemploEnum {

    public static void main (String [] args) {
        // Valores de la enumeracion
        System.out.println("Valor 1: " + Dias.LUNES);

        // Hacemos un test del dia utilizado
        indicarDia(Dias.VIERNES);

        // Utilizamos la enumeracion de paises
        System.out.println();
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());

        // Hacemos el test del numero de paises por continente
        System.out.println();
        indicarPaises(Continentes.AFRICA);

        // Imprimimos los continentes
        System.out.println();
        imprimirContinentes();


    }

    public static void indicarDia (Dias dias) {
        switch (dias) {
            // Podemos usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }

    public static void indicarPaises(Continentes continentes) {
        switch (continentes) {
            // Podemos usar algun valor constante
            // de la enum directamente
            case AFRICA:
                System.out.println("No. Paises en: " + continentes + ": " +
                        continentes.getPaises());
                break;
            case EUROPA:
                System.out.println("No. Paises en: " + continentes + ": " +
                        continentes.getPaises());
                break;
            case ASIA:
                System.out.println("No. Paises en: " + continentes + ": " +
                        continentes.getPaises());
                break;
            case AMERICA:
                System.out.println("No. Paises en: " + continentes + ": " +
                        continentes.getPaises());
                break;
            case OCEANIA:
                System.out.println("No. Paises en: " + continentes + ": " +
                        continentes.getPaises());
                break;
        }
    }

    public static void imprimirContinentes() {
        // Utilizamos un forEach
        for (Continentes continentes : Continentes.values()) {
            System.out.println("Continente " + continentes + " contiene " +
                    continentes.getPaises() + " paises.");
        }
    }

}
