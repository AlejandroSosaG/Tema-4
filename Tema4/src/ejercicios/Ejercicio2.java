package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int a; // Esta es la primera variable que pediremos al usuario.
		int b; // Esta es la segunda variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de a.
		System.out.println("Introduzca el primer número");
		// Asignamos a la variable a el valor escrito por el usuario.
		a = sc.nextInt();
		// Pedimos al usuario el valor de b.
		System.out.println("Introduzca el segundo número");
		// Asignamos a la variable b el valor escrito por el usuario.
		b = sc.nextInt();
		// LLamamos a la función entre que muestra los números que hay entre los dos que se le pasan por parámetro.
		entre(a, b);
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * Este método se encarga de mostrar por pantalla una lista de números que existen entre las dos variables que se pasan por parámetro.
	 * @param a
	 * @param b
	 */
	public static void entre(int a, int b) {
		/*
		 * Recorremos el bucle mientras que i sea menor que b, a la vez que el valor de i se va incrementando.
		 * @i Inicializamos la variable con el valor que posee a más uno.
		 */
		for (int i = a + 1; i < b; i++) {
			// Se muestra por pantalla el valor actual de i.
			System.out.println(i);
		}
	}
}
