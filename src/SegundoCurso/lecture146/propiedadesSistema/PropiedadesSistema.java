package lecture146.propiedadesSistema;

import java.util.*;

public class PropiedadesSistema {

    public static void main (String[] args) {

        Properties properties = System.getProperties();
        Enumeration nombrePropiedades = properties.propertyNames();

        while (nombrePropiedades.hasMoreElements()) {
            String nombrePropiedad = (String) nombrePropiedades.nextElement();
            String valorPropiedad = properties.getProperty(nombrePropiedad);
            System.out.println("Llave: " + nombrePropiedad + "=" + valorPropiedad);
        }
    }

}
