package com.clase5;
//definimos una interface llamada iSeriesnumericas
//Esta interfaz se declaro public para que pueda ser implementada por cualquier otro package
public interface ISerienumericas {
	
	//metodo que retorna el siguiente numero de la serie 
	int getSiguiente();
	
	
	//reiniciar serie 
	void reiniciar();
	
	//metodo que establece un valor inicial 
	void setComenzar(int x);
	

}
