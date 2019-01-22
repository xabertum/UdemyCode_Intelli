package lecture91.disenoClases;

public class Orden {

    private final int idOrden;
    private final Producto productos [];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAXPRODUCTOS = 10;
    
    public Orden() {
	this.idOrden = ++contadorOrdenes;
	productos = new Producto[MAXPRODUCTOS];
    }
    
    public void agregarProducto (Producto producto) {
	// si los productos agregados no superan el maximo
	// de productos, agregamos el nuevo item
	
	if (contadorProductos < MAXPRODUCTOS) {
	    // Agregamos el nuevo producto al arreglo
	    // e incrementamos el contador de productos
	    productos[contadorProductos++] = producto;
	} else  {
	    System.out.println("Se ha superado el maximo de productos: " + MAXPRODUCTOS);
	}
    }
    
    public double calcularTotal () {
	double total = 0;
	for (int i = 0; i < contadorProductos; i++) {
	    total += productos[i].getPrecio();	    
	}
	return total;
    }
    
    public void mostrarOrden () {
	System.out.println("Orden #: " + idOrden);
	System.out.println("Total de la orden # " + idOrden + ": $" + calcularTotal());
	System.out.println("PRoductos de la orden # " + idOrden + ":");
	
	for (int i = 0; i < contadorProductos; i++) {
	    System.out.println(productos[i]);
	}
    }
    
}
