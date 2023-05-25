package Bloque2;

import java.util.Scanner;

public class Bloque2 {

	public static void main(String[] args) {

		System.out.println("Empezando el bloque 2:");
	}
}

class Ejercicio1_Bloque2 {
	// Hay que calcular el factoril de un número
	 static Scanner t = new Scanner(System.in);
	 static int eleccion_numero;
	 static int factorial = 1;

	public static  int calcularFactorial() {
		// Se elige un numero para calcular
		System.out.println("Elige un número para calcular el factorial");
		eleccion_numero = Integer.parseInt(t.nextLine());

		// Se hace un while que cada vez que itere
		while (eleccion_numero != 0) {
			factorial = factorial * eleccion_numero;
			eleccion_numero--;
		}
		return factorial;

	}

}

class Ejercicio2_Bloque2 {
	// Calcular si un numero es primo o no
	private static Scanner t = new Scanner(System.in);
	 private static int eleccion_numero;
	boolean esPrimo;

	public static boolean CalcularPrimo(){
		// Se elige el numero a calcular
		System.out.println("Elige un número para calcular el primo");
		eleccion_numero = Integer.parseInt(t.nextLine());

		
		for (int i = 2; i < eleccion_numero / 2; i++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (eleccion_numero % i == 0)
				return false;

		}
		
		//Si no es divisible, devuelve true
			return true;
		

	}

}

