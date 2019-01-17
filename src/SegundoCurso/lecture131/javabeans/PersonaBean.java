package lecture131.javabeans;



//1. implementa la interface Serializable del paquete java.io
public class PersonaBean implements java.io.Serializable {

    //2. Cada propiedad es de tipo private
    private String nombre;
    private int edad;

    //3. Siempre tiene un constructor sin argumentos
    public PersonaBean () {}

    // Constructor del JavaBean (No requerido)
    public PersonaBean (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //4. Por cada propiedad agrga un get y set o solo alguno de ellos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
