package lecture129.interfaces.manejointerfaces;

import lecture129.interfaces.datos.AccesoDatos;
import lecture129.interfaces.datos.ImplementacionMysql;
import lecture129.interfaces.datos.ImplementacionOracle;

public class ManejoInterfaces {

    public static void main (String [] args) {
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");

        datos = new ImplementacionMysql();
        ejecutar (datos, "insertar");
    }

    private static void ejecutar (AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            datos.listar();
        }
        else if ("insertar".equals(accion)) {
            datos.insertar();

        }
    }

}
