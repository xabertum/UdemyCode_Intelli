package SegundoCurso.lecture117.polimorfismo;

public class Empleado {

    // Atributos de la clase
    protected String nombre;
    protected double sueldo;

    // Constructor de la clase
    protected Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Nombre: " + nombre +
                ", Sueldo: " + sueldo;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
