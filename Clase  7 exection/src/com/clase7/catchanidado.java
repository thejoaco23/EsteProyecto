package com.clase7;

public class catchanidado {
	public static void main(String[] args) {
		
	
	int num[] = {1,2,4,6,67,7,89,12,56756,716,7,726,12,3124,23};
	int denominador [] = {2,0,4,6,4,0,8};
	
	
	try {
		
		for ( int i = 0; i < num.length; i++) {
			//try interno
			try {
				System.out.println(num[i] + " / " + denominador[i] + " es" + num[i] / num[i]);
			}catch (ArithmeticException e) {
				
				//capturando la Exception
				System.out.println("NO se puede dividir por 0 en este caso bro");
				
			}
		}
	

	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ocurrio un error");
System.out.println("ERROR: programa terminado");		
	}

}
}
