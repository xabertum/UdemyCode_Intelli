package lecture91.disenoClases;

public class Ventas {

    public static void main(String[] args) {
	
	// Creamos varios objetos Producto
	Producto producto1 = new Producto("camisa", 50.00);
	Producto producto2 = new Producto("Pantalon", 100.00);
	Producto producto3 = new Producto("Corbata", 30.00);
	
	// Creamos un objeto Orden
	Orden orden1 = new Orden();
	
	// Agregamos los productos a la orden
	orden1.agregarProducto(producto1);
	orden1.agregarProducto(producto2);
	orden1.agregarProducto(producto3);
	
	// imprimimos la orden
	orden1.mostrarOrden();
	
	// Creamos una segunda orden
	Orden orden2 = new Orden();
	
	// Creamos nuevos productos
	Producto producto4 = new Producto("zapatos", 200);
	Producto producto5 = new Producto("Blusa", 90);
	
	// Agregamos productos a la orden 2
	orden2.agregarProducto(producto4);
	orden2.agregarProducto(producto5);
	
	// Imprimimos la orden 2
	System.out.println("");
	orden2.mostrarOrden();

    }

}
