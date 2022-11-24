package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		double num1; // Esta es la primera variable que le pedimos al usuario.
		double num2; // Esta es la segunda variable que le pedimos al usuario.
		int opc; // Esta variable es la opción que pediremos al usuario.
		double sol; // Esta variable es el resultado del cálculo elegido por el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el primer número.
		System.out.println("Introduzca el primer operando");
		// Asignamos a num1 el valor escrito por el usuario.
		num1= sc.nextDouble();
		// Pedimos al usuario el segundo número.
		System.out.println("Introduzca el segundo operando");
		// Asignamos a num2 el valor escrito por el usuario.
		num2 = sc.nextDouble();
		// Mostramos al usuario las distintas opciones que tiene para elegir.
		System.out.println("Eliga una de las siguientes opciones: \n"
				+ "1. Sumar\n"
				+ "2. Restar\n"
				+ "3. Mlutiplicar\n"
				+ "4. Dividir");
		// Asignamos a opc el valor escrito por el usuario.
		opc = sc.nextInt();
		// Asigamos a sol el valor devuelto por la función calculadora a la que le pasamos el valor de num1, num2 y opc.
		sol = calculadora(num1, num2, opc);
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El resultado de la opción escogida es " + sol);
		// Cerramos el escaner.
		sc.close();
	}
	/**
	 * Esta función se encarga de hacer un cálculo u otro de los dos primeros valores que se pasan por parámetro según el etro valor pasado.
	 * @param a
	 * @param b
	 * @param opc
	 * @return
	 */
	public static double calculadora(double a, double b, int opc) {
		double result; // Esta variable es el resultado del cálculo elegido por el usuario.
		// Dependiendo del valor de opc asignamos a result un valor u otro.
		result = switch (opc) {
		// Para el caso 1 se le asigna el valor de a más b.
		case 1: {
			yield a+b;
		}
		// Para el caso 2 se le asigna el valor de a menos b.
		case 2: {
			yield a-b;
		}
		// Para el caso 3 se le asigna el valor de a por b.
		case 3: {
			yield a*b;
		}
		// Para el caso 4 se le asigna el valor de a entre b.
		case 4:{
			yield a/b;
		}
		// Si no es ninguno de los valores anteriores mostramos un mensaje de error.
		default:
			throw new IllegalArgumentException("Valor de la elección incorrecto");
		};
		// Devolvemos el valor de result.
		return result;
	}
}
