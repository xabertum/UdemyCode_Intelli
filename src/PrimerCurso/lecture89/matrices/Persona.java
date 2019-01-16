package lecture89.matrices;

public class Persona {

    private String nombre;
    
    
    /**
     * Constructor con parametros
     * @param nombre
     */
    public Persona (String nombre) {
	this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString () {
	return "Persona{" + "nombre=" + getNombre() + "}";
    }
    
    
}
