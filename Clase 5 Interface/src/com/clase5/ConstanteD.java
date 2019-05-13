package com.clase5;

public class ConstanteD implements Iconstante {

	public static void main(String[] args) {

		int numeros[] = new int[MAX];

		for (int i = MIN; i < 11; i++) {
			if (i >= MAX) {
				System.out.println(MENSAJEERROR);
			} else {
				numeros[i] = i;
				System.out.println(numeros[i] + " ");
			}

		}
	}

}
