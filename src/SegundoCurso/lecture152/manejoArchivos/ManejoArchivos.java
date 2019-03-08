package lecture152.manejoArchivos;
import static lecture152.manejoArchivos.Archivos.*;

public class ManejoArchivos {

    // NOTA: ya debe estar creado la carpeta sdobre la que se va a trabajar
    // y en caso necesario se deben asignar permisos de escritura a la carpeta

    private static final String NOMBRE_ARCHIVO = ".//prueba.txt";

    public static void main (String[] args) {

        //Crear un archivo
        crearArchivo(NOMBRE_ARCHIVO);

        //Escribir a un archvivo
        escribirArchivo(NOMBRE_ARCHIVO);
    }

}
