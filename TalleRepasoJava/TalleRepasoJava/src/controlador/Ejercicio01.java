package controlador;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio01 {

	/*
	 * Realizar un programa en java que permita llenar dos vectores por teclado con
	 * numeros aleatorios del 1 al 500
	 * a: Mostrar la cantidad de numeros pares en ambos vectores 
	 * b: Indicar cual de los vectores contiene mas numeros impares 
	 * c: Mostrar los vectores ordenados ascendentemente (usando Stream)
	 */

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		//variables
		int tamano = 0;
		int limite1 = 1;
		int limite2 = 500;
		int contP1 = 0;
		int contP2 = 0;
		int contI1 = 0;
		int contI2 = 0;

		// Se pide al usuario la cantidad de numeros aleatoreos
		System.out.print("Escriba el tamaño del vector: ");
		tamano = lector.nextInt();

		// arreglos de vectores
		int vector1[] = new int[tamano];
		int vector2[] = new int[tamano];

		// une los dos vectores en un solo arreglo
		int vector3[] = new int[vector1.length + vector2.length];

		// llena el primer vector con numeros aleatorios
		System.out.println();
		for (int i = 0; i < tamano; i++) {
			System.out.print("VectorA" + (i + 1) + ": ");
			int random1 = (int) (Math.random() * (limite2 - limite1 + 1) + limite1); //generacion de numero aleatorio
			vector1[i] = random1;
			System.out.println("" + vector1[i]);
			// cuenta los pares y los impares
			if (vector1[i] % 2 == 0) {
				contP1++;
			} else {
				contI1++;
			}

		}

		// llena el segundo vector con numeros aleatorios
		System.out.println();
		for (int i = 0; i < tamano; i++) {
			System.out.print("VectorB" + (i + 1) + ": ");
			int random1 = (int) (Math.random() * (limite2 - limite1 + 1) + limite1); //generacion de numero aleatorio
			vector2[i] = random1;
			System.out.println("" + vector2[i]);
			// cuenta los pares y los impares
			if (vector2[i] % 2 == 0) {
				contP2++;
			} else {
				contI2++;
			}

		}
		// Muestra resultados
		System.out.println("hay " + contP1 + " pares en Vector A");
		System.out.println("hay " + contP2 + " pares en Vector B");
		System.out.println();
		
		//determina que vector tiene mas numeros impares
		String contador = (contI1 == contI2) ? "ambos tienen igual numero de impares"
				: (contI1 > contI2) ? "el vector A tiene mas numeros impares" : "el vector B tiene mas numeros impares";
		System.out.println(contador);

		// une los dos vectores en un solo arreglo
		System.arraycopy(vector1, 0, vector3, 0, vector1.length);
		System.arraycopy(vector2, 0, vector3, vector1.length, vector2.length);
		// Ordena los vectores
		Arrays.sort(vector3);
		// muestra los vectores ordenados
		System.out.println("orden de vectores:" + Arrays.toString(vector3));

	}

}
