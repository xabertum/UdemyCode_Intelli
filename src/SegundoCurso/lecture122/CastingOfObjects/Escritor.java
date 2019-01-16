package SegundoCurso.lecture122.CastingOfObjects;

public class Escritor extends Empleado{

    final TipoEscritura tipoEscritura;

    public Escritor (String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public String obtenerDetalles () {
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }
}
