package lecture62;

public class CodigoEstatico {

    public static void main(String[] args) {

	Persona persona1 = new Persona("Juan");
	System.out.println("Persona1: " + persona1);
	
	Persona persona2 = new Persona("Javier");
	System.out.println("Persona2: " + persona2);
	
	//imprimimos el contador de objetos Persona
	System.out.println("No. Personas " + Persona.getContadorPersonas());

    }

}

class Persona {
    
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;
    
    public Persona(String nombre) {
	
	//cada vez que creamos un objeto persona
	//incrementamos el contador para tener un nuevo idPersona
	contadorPersonas++;
	
	//asignamos el nuevo valor al idPersona
	idPersona = contadorPersonas;
	
	//asignamos el nombre recibido
	this.nombre = nombre;
    }
    
    public static int getContadorPersonas() {
	return contadorPersonas;
    }
    
    @Override
    public String toString() {
	return "Nombre: " + nombre + " idPersona: " + idPersona;
    }
    
}
