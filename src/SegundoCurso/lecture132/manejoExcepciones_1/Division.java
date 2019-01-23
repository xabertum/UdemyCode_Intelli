package SegundoCurso.lecture132.manejoExcepciones_1;

public class Division {
    private int numerador;
    private int denominador;

    public Division (int numerador, int denominador) throws OperationException {

        if (denominador == 0) {
            //throw new IllegalArgumentException("Denominador igual a cero");
            throw new OperationException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;

    }

    public void visualizarOperacion () {
        System.out.println("El resultado de la operación es: " + numerador/denominador);
    }
}
