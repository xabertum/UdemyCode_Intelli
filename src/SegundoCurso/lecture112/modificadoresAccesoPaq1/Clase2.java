package SegundoCurso.lecture112.modificadoresAccesoPaq1;

public class Clase2 {

    public Clase2() {
        // Prueba de constructores
        System.out.println();
        //Constructor publico
        new Clase1(1);
        //Contructor Protected
        new Clase1(1,2);
        // Constructor default o package
        new Clase1(1,2,3);
        // Constructor Private
        //new Clase1(1,2,3,4);
        System.out.println("Constructor private: Acceso denegado");

    }


    public void pruebasDesdeClase2 () {
        // Acceso a clase 1 desde clase 2
        Clase1 clase1 = new Clase1();
        System.out.println();
        System.out.println("Atributo publico: " + clase1.atrPublico);
        System.out.println("Atributo protegido: " + clase1.atrProtegido);
        System.out.println("Atributo default: " + clase1.atrPâquete);
        System.out.println("Atributo private: Acceso denegado");

        System.out.println();
        System.out.println("Metodo publico: " + clase1.metodoPublico());
        System.out.println("Metodo protegido: " + clase1.metodoProtegido());
        System.out.println("Metodo default: " + clase1.metodoPaquete());
        System.out.println("Metodo private: Acceso denegado");

    }

}
