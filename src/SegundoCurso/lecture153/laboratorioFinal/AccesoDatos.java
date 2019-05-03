package lecture153.laboratorioFinal;

import java.util.List;

public interface AccesoDatos {

    boolean existe (String nombreArchivo) throws AccesoDatosExc;
    List<Pelicula> listar (String nombreArchivo) throws LecturaDatosExc;
    void escribir (Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosExc;
    String buscar (String nombreArchivo, String buscar) throws LecturaDatosExc;
    void crear (String nombreArchivo) throws AccesoDatosExc;
    void borrar (String nombreArchivo) throws AccesoDatosExc;

}
