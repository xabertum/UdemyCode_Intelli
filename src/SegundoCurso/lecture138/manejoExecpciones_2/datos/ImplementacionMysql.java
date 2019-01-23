package lecture138.manejoExecpciones_2.datos;


import lecture138.manejoExecpciones_2.excepciones.AccesoDatosEx;
import lecture138.manejoExecpciones_2.excepciones.EscrituraDatosEx;
import lecture138.manejoExecpciones_2.excepciones.LecturaDatosEx;

public class ImplementacionMysql implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if (simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        } else  {
            System.out.println("Insertar desde MySql");
        }
    }


    @Override
    public void listar() throws AccesoDatosEx {
        if (simularError) {
            throw new LecturaDatosEx("Error de lectura de datos");
        } else  {
            System.out.println("lectura desde MySql");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

    public boolean isSimularError(boolean simularError) {
        return simularError;
    }
}

