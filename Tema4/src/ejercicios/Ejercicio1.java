package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n; // Esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de n.
		System.out.println("Introduzca un número entero");
		// Asignamos a n el valor escrito por el usuario.
		n = sc.nextInt();
		// LLamamos a la función eco a la que le pasamos por parámetro el valor de n.
		eco(n);
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * La siguiente función se ocupa de mostrar pon pantalla un mensaje el número de veces que se le pase por parámetro.
	 * @param n
	 */
	public static void eco(int n) {
		/*
		 * Recorremos el bucle hasta que el valor de i sea igual o superior al de n mientras que va aumentando.
		 * @i Inicializamos la variable i con valor 0.
		 */
		for (int i = 0; i < n; i++) {
			// Mostramos por pantalla un mensaje.
			System.out.println("Eco");
		}
	}

}
