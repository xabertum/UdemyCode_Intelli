package lecture112.modificadoresAccesoPaq2;
import lecture112.modificadoresAccesoPaq1.Clase1;

public class Clase3 extends Clase1 {

    public Clase3() {
        // Constructor protegido, al ser una subclase puede acceder
        // aunque esté en otro paquete
        super(1,2);

        // Acceso package, al estar fuera de paquete esta restringido
        //super(1,2,3);

        // Acceso privado, restringido
        //super(1,2,3,4);

    }

    public void pruebaDesdeClase3() {
        // Acceso a Clase1 desde Clase2
        // Clase 3 extiende de Clase1
        Clase1 clase1 = new Clase1();
        System.out.println();
        System.out.println("Atributo Publico: " + clase1.atrPublico + "o heredado: " + atrPublico);
        System.out.println("Atributo protegido (heredado): " + atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo");
        System.out.println("Atributo private: Acceso denegado");

        // Constructor publico
        new Clase1();
        // Los demás constructores no se pueden probar asi, sino desde el constructor de esta clase
        // ya es que esta es una subclase en otro paquete

        System.out.println();
        System.out.println("Metodo publico: " + clase1.metodoPublico());
        System.out.println("Metodo protegido (heredado): " + metodoProtegido());
        System.out.println("Metodo default: NO se puede acceder desde un paquete externo");
        System.out.println("Metodo private: acceso denegado");

    }


}
