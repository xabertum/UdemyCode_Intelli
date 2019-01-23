package lecture143.manejoGenerics;

public class ManejoGenericos {

    public static void main (String [] args) {
        // Creamos una instancia de ClaseGenerica para Integer
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.obtenerTipo();

        // Creamos una instacia de ClaseGenerica para String
        // Se puede utilizar la inferencia del tipo del lado derecho
        ClaseGenerica<String> objetoStr= new ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();

        // Los genericos no pueden ser aplicados a tipos primitivos
        // por lo que esto marcaria un error de compilacion
        // ClaseGenerica<int> ...
    }

}
