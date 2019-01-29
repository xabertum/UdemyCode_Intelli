package lecture149.entradaScanner;

import java.util.Scanner;

public class EntradaScanner {

    public static void main (String [] args){
        String captura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dato:");
        captura = scanner.nextLine();

        while (captura != null) {
            System.out.println("Datos introducidos: " + captura);
            captura = scanner.nextLine();
        }
    }
}

