package Bloque2;

import java.util.Scanner;

public class Bloque2 {

	public static void main(String[] args) {

		System.out.println("Empezando el bloque 2:");
	}
}

/***
 * 
 * 
 * @author Alegarrup
 *
 *Hay que calcular el factorial de un número
 *Se elige un numero para calcular
 */

class Ejercicio1_Bloque2 {
	
	public static int calcularFactorial(int eleccion_numero) {
		/** creamos variable factorial que almacene el resultado
		 * 
		 */
		int factorial = 1;

		 /**Se hace un while que cada vez que itere el numero sea -1 y resuelva el
		 factorial
		 */
		while (eleccion_numero != 0) {
			factorial = factorial * eleccion_numero;
			eleccion_numero--;
		}
		return factorial;

	}

}

/**Segundo ejercicio*/
class Ejercicio2_Bloque2 {
	 /**Calcular si un numero es primo o no
     *
	Creamos el método y Se elige el numero a calcular
	*/
	public static boolean CalcularPrimo(int eleccion_numero) {

		for (int i = 2; i < eleccion_numero / 2; i++) {
			 /**
			  * Si es divisible por cualquiera de estos números, no
			  *es primo
			  */
			if (eleccion_numero % i == 0)
				return false;

		}

		/** Si no es divisible, devuelve true
		 * el metodo
		 */
		return true;

	}

}
