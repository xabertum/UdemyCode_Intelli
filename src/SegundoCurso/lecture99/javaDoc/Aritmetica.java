package SegundoCurso.lecture99.javaDoc;


/**
 * Esta clase permite realizar operaciones de arimetica basica.
 * 
 * @author Javier Delgado
 * @version 1.0
 *
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    int operandoA;
        
    /**
     * Segundo operando
     */
    int operandoB;
    
    /**
     * Constructor vacio de la clase
     * @param j 
     * @param i 
     */
    public Aritmetica(int i, int j) {
	this.operandoA = i;
	this.operandoB = j;
    }
    
    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resultado de la suma
     */
    public int sumar() {
	return operandoA + operandoB;
    }
}
