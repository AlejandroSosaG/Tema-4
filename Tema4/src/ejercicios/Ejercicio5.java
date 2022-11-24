package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		char car; // Esta es la variable que le pediremos al usuario.
		boolean vocal; // Esta es la variable que dirá si el carácter introducido es una vocal o no.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario un carácter.
		System.out.println("Introduzca un carácter");
		// Asignamos a car el valor escrito por el usuario.
		car = sc.next().charAt(0);
		// Asignamos a la variable vocal el valor que devuelve la función esvocal a la que le pasamos el valor de car.
		vocal = esvocal(car);
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("Carácter introducido igual a vocal: " + vocal);
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * Esta función se encarga de decir si el carácter pasado por parámetro es una vocal o no.
	 * @param car
	 * @return
	 */
	public static boolean esvocal(char car) {
		boolean vocal; // Esta es la variable que dirá si el carácter pasado es una vocal o no.
		// Dependiendo del valor de car.
		switch(car) {
		// Si es a asignamos a la variable vocal el valor true.
		case 'a':
			vocal=true;
			break;
		// Si es e asignamos a la variable vocal el valor true.
		case 'e':
			vocal = true;
			break;
		// Si es i asignamos a la variable vocal el valor true.
		case 'i':
			vocal = true;
			break;
		// Si es o asignamos a la variable vocal el valor true.
		case 'o':
			vocal = true;
			break;
		// Si es u asignamos a la variable vocal el valor true.
		case 'u':
			vocal = true;
			break;
		// Si no es ninguno de los valores anteriores le asignamos a la variable vocal el valor false.
			default:
				vocal = false;
		}
		// Devolvemos el valor de la variable vocal.
		return vocal;
	}
}
