package com.iucmc.lenguajes.formales.ejemplo;

import java.util.Scanner;
import java.util.regex.*;

public class Alfabeto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("SELECCIONE UNA OPCION: \n");
		System.out.print("1. VALIDAR PARABRA ALFABETICA");
		System.out.print("2. OBTENER PREFIJO");
		System.out.print("3. OBTENER SUFIJO");
		int opcion = sc.nextInt();
		
		sc = new Scanner(System.in);
		System.out.println("INGRESE LA PALABRA");
		String palabra = sc.nextLine();

		switch (opcion) {
		case 1:
			esAlfabeto(palabra);
			break;
		case 2:

			break;
		case 3:

			break;

		default:
			break;
		}
		
		
		

	}

	public static boolean esAlfabeto(String palabra) {
		Pattern p = Pattern.compile("[^A-Za-z]");
		Matcher m = p.matcher(palabra);
		return !m.find();
	}

	public static String obtenerSufijo(String palabra) {
		
	}

	public static String obtenerPrefijo(String palabra) {

	}

}
