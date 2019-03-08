package lecture150.calculadoraScanner;
import java.util.*;
import static lecture150.calculadoraScanner.Operaciones.sumar;

public class CalculadoraEntradaDatos {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el primer valor: ");
        int a = scanner.nextInt();
        System.out.println("Introduce el siguiente valor: ");
        int b = scanner.nextInt();

        int resultado = sumar(a, b);
        System.out.println("El resultado de la suma es: " + resultado);

    }

}
