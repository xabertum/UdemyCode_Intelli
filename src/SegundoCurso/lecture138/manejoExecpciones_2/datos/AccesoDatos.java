package lecture138.manejoExecpciones_2.datos;

import lecture138.manejoExecpciones_2.excepciones.AccesoDatosEx;

public interface AccesoDatos {

    public abstract void insertar () throws AccesoDatosEx;
    void listar () throws AccesoDatosEx;
    void simularError (boolean simularError);

}

