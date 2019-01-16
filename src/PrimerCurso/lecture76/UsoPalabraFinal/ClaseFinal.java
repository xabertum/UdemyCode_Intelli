package lecture76.UsoPalabraFinal;

public final class ClaseFinal {

    
    // Variables marcadas como finales
    public static final int varPrimitivo = 10;
    public static final Persona PERSONA = new Persona();
    
    // Metodo final, estudiaremos el tema de sobreescritura en otra leccion
    public final void metodoFinal () {	
    }
    
}

// Marca error: no se puede heredar de una clase final
// class ClaseHija extends ClaseFinal {}

