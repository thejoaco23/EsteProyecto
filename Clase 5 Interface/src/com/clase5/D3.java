package com.clase5;

public class D3 implements ISerienumericas {

	int iniciar;
	int valor;
	
	D3(){
	iniciar =0;
	valor=0;
	}
	@Override
	public int getSiguiente() {
		valor+=3;
		
		
		
			return valor;
	}

	@Override
	public void reiniciar() {
 valor=iniciar;

	}

	@Override
	public void setComenzar(int x) {
		iniciar=x;
		valor=x;
		
		

	}

}
