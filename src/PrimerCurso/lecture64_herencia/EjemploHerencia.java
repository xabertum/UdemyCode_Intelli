package lecture64_herencia;

/**
 * @author xabertum
 *
 */
public class EjemploHerencia {

    /**
     * @param args
     */
    public static void main(String[] args) {
	lecture64_herencia.Empleado empleado1 = new lecture64_herencia.Empleado("Juan", 18000);
	System.out.println("imprimimos el objeto Empleado1");
	System.out.println(empleado1);
	
	lecture64_herencia.Empleado empleado2 = new lecture64_herencia.Empleado("Pedro", 25000);
	empleado2.setEdad(28);
	empleado2.setGenero('M');
	empleado2.setDireccion("Bogota, Colombia");
	System.out.println("imprimimos el objeto Empleado2");
	System.out.println(empleado2);
	
	//Al crear un nuevo objeto de java.util.Date nos regresa la fecha actual
	lecture64_herencia.Cliente cliente1 = new lecture64_herencia.Cliente(new java.util.Date(), true);
	System.out.println("imprimimos el objeto Cliente1");
	System.out.println(cliente1);
	
	//Completamos el objeto persona asociado a este objeto cliente
	cliente1.setNombre("Karla");
	cliente1.setEdad(22);
	cliente1.setGenero('F');
	cliente1.setDireccion("Mexico, DF");
	System.out.println("volvemos a imprimir el objeto cliente1");
	System.out.println(cliente1);
	

    }

}
