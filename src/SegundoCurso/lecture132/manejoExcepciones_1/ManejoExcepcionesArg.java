package SegundoCurso.lecture132.manejoExcepciones_1;

public class ManejoExcepcionesArg {

    public static void main (String [] args)  throws OperationException {
        try {
            int operando1 = Integer.parseInt(args[0]);
            int operando2 = Integer.parseInt(args[1]);
            Division division = new Division(operando1, operando2);
            division.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Hubo un error al accder a un elemento del array...");
            aie.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Uno de los argumentos no es entero...");
            nfe.printStackTrace();
        } catch (OperationException oe) {
            System.out.println("Ocurrio una excepción: ");
            System.out.println("Se trató de realizar una operación invalida...");
            oe.printStackTrace();
        } finally {
            System.out.println("Se terminaron de revisar las excepciones...");
        }
    }
}
