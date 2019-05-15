package com.clase6;

public class Multimedia {

	private String titulo;
	private String autor;
	private double duracion;
	private Formato formato;
	//cito al enum con su nombre
	
	
	
	public Multimedia (String titulo,String autor, Formato formato, double duracion) {
		this.titulo = titulo;
		this.autor=autor;
		this.formato=formato;
		this.duracion=duracion;
		
		
	}



	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + ", formato=" + formato
				+ "]";
	}

	public boolean equals(Multimedia m) {
		
		return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
		
	}


	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public double getDuracion() {
		return duracion;
	}



	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}



	public Formato getFormato() {
		return formato;
	}



	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
}
