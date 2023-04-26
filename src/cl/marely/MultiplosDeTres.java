/*
 * MULTIPLOS DE TRES
 * @author Marely
 * Este programa calcula la suma y el promedio de los múltiplos de 3.
 */
package cl.marely;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MultiplosDeTres {

	/*
	 * METODO SUMA. Este método suma los numeros multiplos de 3
	 */

	public static void suma(ArrayList<Integer> lista) {
		double suma = 0;
		int contador = 0;
		for (int elemento : lista) {
			suma += (Math.abs(elemento) % 3 == 0) ? elemento : 0;
			contador += (Math.abs(elemento) % 3 == 0) ? 1 : 0;
		}
		System.out.printf("Suma\t : %.0f", suma);
		promedio(suma, contador);
	}

	/*
	 * METODO PROMEDIO. Este método promedia los múltiplos de 3
	 */
	public static void promedio(double suma, int n) {
		
		System.out.printf((n > 0) ? "\nPromedio : %.1f" : "Promedio : 0", (suma / n));
	}

	/*
	 * METODO PRINCIPAL
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("** MULTIPLOS DE TRES **");
		System.out.println("Ingrese los datos. Presionar '0' para Salir");
//		llenando el arrayList	
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println();
		int nro = -1;
		do {
			try {
				nro = sc.nextInt();
				if (nro != 0) {
					arrayList.add(nro);
				}
			} catch (InputMismatchException e) {
				System.out.println("\tERROR. Ingrese un número entero");
				sc.next();
			}
		} while (nro != 0);

		sc.close();

		System.out.println("\nArrayList: " + arrayList);

		suma(arrayList);

	}

}
