package lecture93.laboratorioFinal;

public class MundoPc {

    public static void main(String[] args) {
	// Creacion de computadora Toshiba
	Monitor monitorToshi = new Monitor("Toshiba", 13);
	Teclado tecladoToshi = new Teclado("Bluetooh", "Toshiba");
	Raton ratonToshi = new Raton("USB", "Toshiba");
	Computadora computadoraToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);
	
	// Agregamos la computadora a la orden
	Orden orden1 = new Orden();
	orden1.agregarComputadora(computadoraToshiba);
	
	// Imprimimos la orden 
	orden1.mostrarOrden();

    }

}
