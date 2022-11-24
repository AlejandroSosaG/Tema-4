package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num1; // Esta es la primera variable que le pedimos al usuario.
		int num2; // Esta es la segunda variable que le pedimos al usuario.
		int max; // Esta variable es el máximo de los dos números que pediremos a la fución.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el primer número.
		System.out.println("Introduzca el primer número entero");
		// Asignamos a num1 el valor escrito por el usuario.
		num1 = sc.nextInt();
		// Pedimos al usuario el segundo número.
		System.out.println("Introduzca el segundo número entero");
		// Asignamos a num1 el valor escrito por el usuario.
		num2 = sc.nextInt();
		// Asignamos a max el valor que devuelve la función maximo a la que le pasamos los valores de num1 y num2.
		max = maximo(num1, num2);
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El máximo de los dos número es " + max);
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * Esta función se encarga de hallar el número mayor de los dos que se le pasan por parámetro.
	 * @param a
	 * @param b
	 * @return
	 */
	public static int maximo(int a, int b) {
		int sol; // Esta variable es el máximo de los dos número que devolveremos.
		// Si el valor de a es mayor al de b se le asigna a sol su valor, sino se le asigna el valor de b.
		if(a>b) sol = a;
		else sol = b;
		// Devolvemos el valor de sol.
		return sol;
	}

}
