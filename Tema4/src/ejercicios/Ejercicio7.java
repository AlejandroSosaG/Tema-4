package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int num; // Esta es la variable que le pedimos al usuario.
		int div; // Esta variable es la que nos dirá la cantidad de divisores primos que tiene el número introducido.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario un número entero.
		System.out.println("Introduzca un número entero");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		// Asignamos a div el valor que devuelve la función divPrimos a la que le pasamos el valor de num.
		div = divPrimos(num);
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El número de divisores primos que tiene el número es " + div);
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * Esta variable se encarga de calcular cuantos divisores primos posee el número que se le pasa por parámetro.
	 * @param num
	 * @return
	 */
	public static int divPrimos(int num) {
		int primo=0; // Esta variable es la que nos dirá la cantidad de divisores primos que tiene el número pasado.
		/*
		 * Recorremos el bucle mientras que i sea menor a num más uno entre dos a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 2.
		 */
		for(int i=2;i<num+1/2;i++) {
			// Si el resto de dividir el valor de num entre el de i es cero.
			if(num%i==0) {
				// Si el valor devuelto por la función esPrimo a la que le pasamos el valor de i es true aumentamos el de la variable primo.
				if(esPrimo(i)==true) primo++;
			}
		}
		// Devolvemos el valor de la variable primo.
		return primo;
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
