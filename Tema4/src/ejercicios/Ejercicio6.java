package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int n; // Esta es la variable que le pedimos al usuario.
		boolean primo; // Esta variable es la que nos dirá si el número introducido por el usuario es primo o no.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de n.
		System.out.println("Introduzca un número");
		// Asignamos a n el valor escrito por el usuario.
		n = sc.nextInt();
		// Asignamos a la variable primo el valor devuelto por la función esPrimo a la que le pasamos el valor de n.
		primo = esPrimo(n);
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("Número introducido es primo: " + primo);
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * Esta función se encarga de decir si el número que se le pasa por parámetro es primo o no.
	 * @param n
	 * @return
	 */
	public static boolean esPrimo(int n) {
		boolean primo = true; // Esta variable es la que nos dirá si el número introducido por el usuario es primo o no, y la inicializamos con valor true.
		/*
		 * Recorremos el bucle mientras que i sea menor a num más uno entre dos a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 2.
		 */
		for (int i = 2; i < n + 1 / 2; i++) {
			 // Si el resto de dividir num entre i es igual a cero asignamos a la variable primo el valor false.
			 if (n % i == 0) {
				 primo = false;
			 }			
		}
		// Devolvemos el valor de la variable primo.
		return primo;
	}
}
