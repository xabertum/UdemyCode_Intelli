package SegundoCurso.lecture131.javabeans;

public class ManejoJavaBeans {

    public static void main (String[] args) {
        lecture131.javabeans.PersonaBean bean = new lecture131.javabeans.PersonaBean();
        bean.setNombre("Juan");
        bean.setEdad(25);

        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());
    }
}
