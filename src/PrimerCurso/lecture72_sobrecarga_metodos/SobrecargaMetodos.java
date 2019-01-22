package lecture72_sobrecarga_metodos;

public class SobrecargaMetodos {

    public static void main(String[] args) {
	System.out.println("REsultado 1: " + lecture72_sobrecarga_metodos.Operaciones.sumar(3, 4));
	System.out.println("REsultado 2: " + Operaciones.sumar(5, 4.1));
	System.out.println("REsultado 3: " + Operaciones.sumar(7.1, 3));
	System.out.println("REsultado 4: " + Operaciones.sumar(2.2, 6.8));
	
	//�Qu� metodo se manda llamar?
	System.out.println("Resultado 5: " + Operaciones.sumar(3, 1L));

	//�Qu� metodo se manda llamar?
	System.out.println("Resultado 6: " + Operaciones.sumar(3F, 'A'));

	
    }

}
