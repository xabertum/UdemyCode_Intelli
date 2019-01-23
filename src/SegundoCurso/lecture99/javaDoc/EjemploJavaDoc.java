package lecture99.javaDoc;

/**
 * Clase para probar el concepto de JavaDoc
 * @author Javier Delgado
 * @version 1.0
 *
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args argumentos de la linea de comnandos
     */
    public static void main(String[] args) {
	int resultado = new Aritmetica(3,2).sumar();
	System.out.println("Resultado: " + resultado);
    }

}
