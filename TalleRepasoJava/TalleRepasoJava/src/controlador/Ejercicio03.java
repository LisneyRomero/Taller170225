package controlador;

import java.util.Scanner;

public class Ejercicio03 {

	/*Realizar un programa en java que permita leer n precios
	 * de productos al final mostrar un arreglo resultante en donde se le calcule el
	 * 10% de descuento a aquellos precios de productos superirores a 55.000 mil pesos
	 * y los demas casos aplicar el 5% de descuento
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		 
		//variables
		int cantidad = 0;
		
		//se solicita la cantidad de productos 
		System.out.print("ingrese la cantidad de productos: ");
		cantidad = lector.nextInt();
		
		//se crean dos arreglos para almacenar lo precios con y sin descuento
		double precios []= new double [cantidad];
		double preciosD [] = new double [cantidad];
		
		//se llenan los precios ingresados por el usuario
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Ingrese el precio del producto " + (i + 1) +  ":");
			precios [i] = lector.nextDouble();
			
		}
		//se agregan los descuentos de acuerdo a los precios de los productos 
		for (int i = 0; i < cantidad; i++) {
			if (precios[i] > 55000) {
				preciosD[i] = precios[i] * 0.90; //descuento del 10%
			}else {
				preciosD[i] = precios[i] * 0.95; //descuento del 5%
				
			}
		}
		//Mostrar resultado 
		System.out.println();
		System.out.println("precios: ");
		for (int i = 0; i < cantidad; i++) {
			System.out.println("\nproducto #" + (i + 1) + ": Precio sin descuento = " + precios[i] +
					"\nPrecio con descuento: " + preciosD[i]);
		}
		
	}
	
	
	

}
