package lecture143.manejoGenerics;

// Definimos una clase generica con el operador diamente
public class ClaseGenerica <T> {
    // Definimos una variable de tipo generico
    T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("El tipo T es: " +  objeto.getClass().getName());
    }

}
