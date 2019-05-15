package com.clase6;

public class AppMain {

	public static void main(String[] args) {
		ListaMultimedia lista= new ListaMultimedia(10);
		Pelicula pelicula;
int posicion;

lista.add(new Pelicula("Duro de matar", "Steve", Formato.DVD, 41,  null, null));
lista.add(new Pelicula("Titanic", "Steve", Formato.AVI, 81, "Alex castro", "Alexia de asis"));
lista.add(new Pelicula("Tarzan", "Steve", Formato.MP4, 31, "Alex castro", "Alexia de asis"));
lista.add(new Pelicula("Mars attkas", "Steve", Formato.WAV, 91, "Alexd castro", "Alexia dde asis"));

System.out.println(lista.toString());
	}

}
