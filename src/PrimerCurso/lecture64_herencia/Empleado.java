package lecture64_herencia;

/**
 * @author xabertum
 *
 */
public class Empleado extends lecture64_herencia.Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    public Empleado (String nombre, double sueldo) {
	super(nombre);
	this.idEmpleado = ++contadorEmpleados;
	this.sueldo = sueldo;
    }

    // GETTERs & SETTERs
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    
    @Override
    public String toString () {
	return super.toString() + " Empleado { " + "idEmpleado= " + idEmpleado +
		"sueldo= " + sueldo + " }";
		
    }
    
    
}
