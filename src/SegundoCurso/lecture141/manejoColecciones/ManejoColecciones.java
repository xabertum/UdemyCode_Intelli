package lecture141.manejoColecciones;

import java.util.*;

public class ManejoColecciones {

    public static void main (String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");

        // Elemento repetido
        miLista.add("4");
        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");

        // Elemento repetido
        miSet.add("300");
        imprimir(miSet);

        Map miMapa = new HashMap();

        //Llave, valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");

        // Se imprimen todas las llaves
        imprimir(miMapa.keySet());
        // Se imprimen todos los valores
        imprimir(miMapa.values());
    }

    private static void imprimir(Collection collection) {
        for (Object elemento : collection) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

}
