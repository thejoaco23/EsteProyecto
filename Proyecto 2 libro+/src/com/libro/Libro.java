package com.libro;

public class Libro extends Publicacion implements Prestable{
	
	private boolean prestado;
	

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		this.prestado = false;
		
	}

	@Override
	public void prestar() {
		
		System.out.println("se devolvio el libro bb"+ " \n me dio paja borrar todo pero en realidad se presto");
		prestado = true;
	}

	@Override
	public void devolver() {
		System.out.println("Si, me confundi en la anterior clase pero se devolvio");
		prestado = false;
	}


@Override
	public boolean prestado() {
		return prestado;
	}


	
	public String toString() {
		return "Libro [prestado=" + prestado + "]";
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}}
