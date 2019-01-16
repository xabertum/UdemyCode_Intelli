package SegundoCurso.lecture117.polimorfismo;

public class EjemploPolimorfismo {

    public static void main (String [] args) {

        Empleado empleado = new Empleado("Juan", 1000);
        imprimirDetalles(empleado);

        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        imprimirDetalles(gerente);
    }

    // Observamos que el tipo que recibe el metodo es del tipo padre (Empleado)
    // Sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (Gerente)
    // eso es el polimorfismo, multiples formas pero en tiempo de ejecución
    private static void imprimirDetalles(Empleado empleado) {
        System.out.println(empleado.obtenerDetalles());
    }
}
