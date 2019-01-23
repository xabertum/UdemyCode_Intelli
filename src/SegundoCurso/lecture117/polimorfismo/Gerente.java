package lecture117.polimorfismo;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente (String nombre, double sueldo, String departamento) {
        super(nombre,sueldo);
        this.departamento = departamento;
    }

    // Sobreescribimos el metodo padre heredado
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Departamento: " + departamento;
    }

    // Getters & setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
