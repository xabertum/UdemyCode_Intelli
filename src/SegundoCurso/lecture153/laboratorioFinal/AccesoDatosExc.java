package lecture153.laboratorioFinal;

public class AccesoDatosExc extends Exception {

    private String mensaje;

    public AccesoDatosExc (String mensaje) {
        this.mensaje = mensaje;
    }
}
