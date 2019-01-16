package lecture93.laboratorioFinal;

public class Orden {

    private final int idOrden;
    private final Computadora computadoras [];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int MAXCOMPUTADORAS = 10;
    
    public Orden() {
	this.idOrden = ++contadorOrdenes;
	computadoras = new Computadora[MAXCOMPUTADORAS];
    }
    
    public void agregarComputadora (Computadora computadora) {
	if (contadorComputadoras < MAXCOMPUTADORAS) {
	    computadoras[contadorComputadoras++] = computadora;
	} else {
	    System.out.println("Se ha superado el máximo de computadoras " + MAXCOMPUTADORAS);
	    
	}
    }
    
    public void mostrarOrden () {
	System.out.println("Orden #: " + idOrden);
	System.out.println("Computadores de la orden # " + idOrden + ":");
	
	for (int i = 0; i < contadorComputadoras; i++) {
	    System.out.println(computadoras[i]);
	}
    }
    
    
}
