package lecture93.laboratorioFinal;

public class Computadora {

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    
    // Constructor
    private Computadora () {
	this.idComputadora = ++contadorComputadoras;
    }
    
    
    // Sobrecarga de constructor con argumentos
    public Computadora (String nombre, Monitor monitor, Teclado teclado, Raton raton) {
	this();
	this.nombre = nombre;
	this.monitor = monitor;
	this.teclado = teclado;
	this.raton = raton;
    }
    
    public String toString () {
	return "Computadora { " + "idComputador = " + idComputadora + "Nombre = " + nombre
		+ " Monitor = " + monitor + " Teclado = " + teclado + " Raton = " + raton;
    }


    // Getters & Setters
    
    public int getIdComputadora() {
        return idComputadora;
    }


    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Monitor getMonitor() {
        return monitor;
    }


    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }


    public Teclado getTeclado() {
        return teclado;
    }


    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }


    public Raton getRaton() {
        return raton;
    }


    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    
    
    
    
}
