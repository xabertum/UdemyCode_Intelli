package SegundoCurso.lecture129.interfaces.datos;

public class ImplementacionMysql implements lecture129.interfaces.datos.AccesoDatos {
    @Override
    public void insertar () {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar () {
        System.out.println("Listar desde Mysql");
    }

}
