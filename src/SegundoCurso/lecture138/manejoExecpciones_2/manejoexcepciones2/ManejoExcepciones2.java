package lecture138.manejoExecpciones_2.manejoexcepciones2;

import lecture138.manejoExecpciones_2.datos.AccesoDatos;
import lecture138.manejoExecpciones_2.datos.ImplementacionMysql;
import lecture138.manejoExecpciones_2.excepciones.AccesoDatosEx;
import lecture138.manejoExecpciones_2.excepciones.LecturaDatosEx;

public class ManejoExcepciones2 {

    public static void main (String [] args) {
        AccesoDatos datos = new ImplementacionMysql();
        // Cambiamos el estado a simularError = true
        datos.simularError(true);
        ejecutar(datos, "listar");

        // Cambiamos el estado a simularError = false
        datos.simularError(false);
        System.out.println();
        ejecutar(datos, "insertar");

    }

    private static void ejecutar(AccesoDatos datos, String accion) {

        if ("listar".equals(accion)) {
            try {
                datos.listar();
             // Si se van a procesar varias excepciones de la misma jerarquia
             // siempre se debe procesar primero la excepcion de menor jerarquia
             // y posteriormente la de mayor jerarquia
            } catch (LecturaDatosEx ex) {
                System.out.println("Error de lectura: procesa la excepción mas especifica de lectura de datos");
                ex.printStackTrace();
            } catch (AccesoDatosEx ex) {
                System.out.println("Error Acceso a Datos: procesa la excepcion mas generica de acceso a datos");
                ex.printStackTrace();
            } catch (Exception ex) {
                System.out.println("Error general");
                ex.printStackTrace();
            } finally {
                System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");

            }


        }



    }
}
