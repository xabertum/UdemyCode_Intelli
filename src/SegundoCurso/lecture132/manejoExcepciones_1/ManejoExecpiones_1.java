package lecture132.manejoExcepciones_1;

import lecture132.manejoExcepciones_1.Division;

public class ManejoExecpiones_1 {

    public static void main (String[] args) {

        try {
            Division division = new Division(10,1);
            division.visualizarOperacion();
        } catch (OperationException oe) {
            System.out.println("Ocurrio un error!!!");
            oe.printStackTrace();
        }
    }
}
