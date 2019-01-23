package lecture112.modificadoresAccesoPaq1;

public class Clase1 {

    // Definición de atributos
    public int atrPublico = 5;
    protected int atrProtegido = 6;
    int atrPâquete = 7;
    private int atrPrivado;

    // Constructores
    public Clase1 () {}

    public Clase1(int i) {
        System.out.println("Constructor Publico 1");
    }

    protected Clase1 (int i, int j) {
        System.out.println("Constructor protected 2");
    }

    Clase1 (int i, int j, int k) {
        System.out.println("Constructor package 3");
    }

    private Clase1 (int i, int j, int k, int l) {
        System.out.println("Constructor privado 4");
    }

    // Definición de metodos
    public int metodoPublico () {
        return 9;
    }

    protected int metodoProtegido() {
        return 10;
    }

    int metodoPaquete() {
        return 11;
    }
     private int metodoPrivado() {
        return 12;
     }
}
