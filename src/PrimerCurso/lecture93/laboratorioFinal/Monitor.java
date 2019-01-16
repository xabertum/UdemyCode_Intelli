package lecture93.laboratorioFinal;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    // Constructor principal
    private Monitor () {
	this.idMonitor = ++contadorMonitores;
    }
    
    
    // Sobrecarga de constructor con dos parametros
    public Monitor (String marca, double tamano) {
	this();
	this.marca = marca;
	this.tamano = tamano;
    }
    
    @Override
    public String toString() {
	return "Monitor { " + "Marca = " + marca + "Tamaño = " + tamano;
    }

    
    // Getters & Setters
    
    public int getIdMonitor() {
        return idMonitor;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadormonitores() {
        return contadorMonitores;
    }    
    
}
