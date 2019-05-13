package com.clase5;

public class SerieNumericaDe2en2 implements ISerienumericaHerencia{
	
	
	int iniciar;
	int valor;
	int anterior;
	
	//metodo constructor
 SerieNumericaDe2en2(){
iniciar=0;
valor= 0;

		
		
	}
	
//siempre que implementemos un metodo definido x una interfaz
 //debe implementarse como Public por que todos lso miembros
 //de una interfaz son implicitamente Public
	@Override
	public int getSiguiente() {
	anterior=valor;
		valor+=2;
	
	
		return valor;
	}

	@Override
	public void reiniciar() {
		valor=iniciar;
		anterior =valor-2;
		
		
	}

	@Override
	public void setComenzar(int x) {
		iniciar=x;
		valor=x;
		anterior=x-2;
	}
	//añadimos un metodo que no esta definido en la interface  IseriesNumericas
	public int getAnterior() {
		return anterior;
	}

}
