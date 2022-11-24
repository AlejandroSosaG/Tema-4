package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int opc; // Esta variable es la opción que deberá elegir el usuario.
		int radio; // Esta variable es el radio de la base del cilindro que pediremos al usuario.
		int altura; // Esta variable es la altura del cilindro que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor del radio de la base.
		System.out.println("Introduzca el radio de la base del cilindro");
		// Asignamos a la variable radio el valor escrito por el usuario.
		radio = sc.nextInt();
		// Pedimos al usuario el valor de la altura del cilindro.
		System.out.println("Introduzca la altura del cilindro");
		// Asignamos a la variable altura el valor escrito por el usuario.
		altura = sc.nextInt();
		// Mostramos por pantalla un menú con dos opciones y le pedimos al usuario que eliga una.
		System.out.println("Seleccione una opción:"
				+ "1. Calcular el área del cilindro."
				+ "2. Calcular el volumen del cilindro.");
		// Asignamos a opc el valor elegido por el usuario.
		opc = sc.nextInt();
		// Dependiendo del valor de opc.
		switch(opc) {
		// Si el valor es uno muestra por pantalla un mensaje con el área del cilindro que lo consigue de una función llamada area.
		case 1:
			System.out.println("El área del cilindro es " + area(radio, altura));
			// Cerramos la opción 1.
			break;
		// Si el valor es dos muestra por pantalla un mensaje con el volumen del cilindro que lo consigue de una función llamada volumen.
		case 2:
			System.out.println("El volumen del cilindro es " + volumen(radio, altura));
			// Cerramos la opción 2.
			break; 
			// Si Introduce otro valor mostramos por pantalla un mensaje de error.
			default:
				System.out.println("No existe ninguna opción para el número introducido");
		}
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * Esta función se encarga de calcular el área del cilindro utilizando para ello las dos variables que se pasan por parámetro.
	 * @param radio
	 * @param altura
	 * @return
	 */
	public static double area(int radio, int altura) {
		double area; // Esta variable es el área del cilindro que hallaremos mendiante un cálculo.
		// Asignamos a la variable area el valor de una operación matemática.
		area = 2*3.14*radio*(altura+radio);
		// Devolvemos el valor de la variable area.
		return area;
	}
	/**
	 * Esta función se encarga de calcular el volumen del cilindro utilizando para ello las dos variables que se pasan por parámetro.
	 * @param radio
	 * @param altura
	 * @return
	 */
	public static double volumen(int radio, int altura) {
		double vol; // Esta variable es el volumen del cilindro que hallaremos mendiante un cálculo.
		// Asignamos a la variable volumen el valor de una operación matemática.
		vol= 3.14*radio*radio*altura;
		// Devolvemos el valor de vol.
		return vol;
	}
}
