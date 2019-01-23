package lecture70_sobrecarga_constructor;

public class EjemploSobrecarga {

    public static void main(String[] args) {
	
	//El constructor vacio es privado, por lo que no obliga
	//a utilizar el unico constructor publico y por lo tanto
	//proporcionar valores en los campos nombre y edad
	
	Persona persona1 = new Persona("Lilia", 22);
	System.out.println("Imprimimos el objeto Persona1");
	System.out.println(persona1);
	
	//Creamos un nuevo objeto de tipo persona
	Persona persona2 = new Persona("Javier", 35);
	System.out.println("\nImprimimos el objeto Persona2");
	System.out.println(persona2);
	
	//Creamos un objeto empleado
	Empleado empleado1 = new Empleado("Aroa", 25, 19000);
	System.out.println("\nImprimimos el objeto Empleado1");
	System.out.println(empleado1);

    }

}
