package controlador;

import java.util.Scanner;

import java.util.ArrayList;

public class Ejercicio02 {

	/*
	 * Realizar un programa en java que permita leer un arreglo de nombres al final
	 * mostrar el nombre con mayor cantidad de caracteres y su posicion
	 */

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		// variables
		int cantName = 0;
		int posicion = 0;

		// pedir la cantidad de nombres a escribir
		System.out.print("Ingrese la cantidad de nombres a escribir: ");
		cantName = lector.nextInt();
		lector.nextLine();

		// arreglo que almacena los nombres
		String name[] = new String[cantName];

		// se llena el arreglo con la cantidad de nombres
		for (int i = 0; i < cantName; i++) {
			System.out.print("Nombre #" + (i + 1) + ": ");
			name[i] = lector.nextLine();
		}

		// se inicializa el arreglo con el primer nombre como mayor caracter
		String nameL = name[0];

		// lista para almacenar los nombres de mayor caracter
		ArrayList<Integer> posiciones = new ArrayList<>();
		posiciones.add(posicion);

		// se recorre el arreglo para encontrar el nombre con mayor numero de caracteres
		for (int i = 1; i < cantName; i++) {
			if (name[i].length() > nameL.length()) {
				nameL = name[i];
				posicion = i;
				posiciones.clear();
				posiciones.add(posicion);

			} else if (name[i].length() == nameL.length()) {
				posiciones.add(i);
			}
		}
		// se muestran los resultados
		if (posiciones.size() > 1) {
			System.out.println();
			System.out.println("Nombres con mas caracteres: ");
			System.out.println();
			for (int i = 0; i < posiciones.size(); i++) {
				System.out.println(name[posiciones.get(i)] + " en la posicion #" + (posiciones.get(i) + 1));
			}
		} else {
			System.out.println();
			System.out.println("El nombre con mas caractres es: " + nameL);
			System.out.println("En la posicion: #" + (posicion + 1));
		}

	}

}
