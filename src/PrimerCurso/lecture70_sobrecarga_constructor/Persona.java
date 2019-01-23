package lecture70_sobrecarga_constructor;

public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona() {
	this.idPersona = ++contadorPersonas;
    }
    
    public Persona (String nombre, int edad) {
	this();
	this.nombre = nombre;
	this.edad = edad;
	
    }
    
    @Override
    public String toString() {
	return "Persona { " + "idPersona=" + idPersona + ", nombre=" + nombre +
		", edad" + edad + " }";
	
    }
    
    
}
