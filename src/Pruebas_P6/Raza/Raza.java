package Pruebas_P6.Raza;

import java.util.Random;

public class Raza {

    private Raza[] razas = new Raza[3];
    private Random random = new Random();

    public Raza() {
        this.razas[0] = new Humano();
        this.razas[1] = new Elfo();
        this.razas[2] = new Orco();
        this.razas[3] = new Demonio();
    }

    public Raza[] getRazas() {
        return razas;
    }



    public void imprimirRaza () {
        System.out.println(getRazas().toString());

    }


}

