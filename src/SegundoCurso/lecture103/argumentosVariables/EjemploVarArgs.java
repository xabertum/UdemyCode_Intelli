package SegundoCurso.lecture103.argumentosVariables;

public class EjemploVarArgs {

    public static void main(String[] args) {
        // Imprimimos varios numeros
        imprimirNumeros(15, 20, 3, 61, 75, 18, 10);

        System.out.println();
        imprimirNumerosForEach(15, 20, 3, 61, 75, 18, 10);

        System.out.println();
        variosParametros("Juan", true, 15, 20, 14);

    }

    public static void imprimirNumeros(int... numeros) {
        // Recorremos cada elemento
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
    }


    public static void imprimirNumerosForEach(int... numeros) {
        // Usamos forEach en lugar de un for normal
        for (int numero : numeros) {
            System.out.println("El numero es: " + numero);
        }
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("Nombre " + nombre);
        System.out.println("Valido " + valido);

        // Usamos un forEach
        for (int numero : numeros) {
            System.out.println("El numero es: " + numero);
        }
    }

}
