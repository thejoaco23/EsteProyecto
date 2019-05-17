package com.libro;

public class AppMain {
public static void main(String[] args) {
		
	Libro harryPotter = new Libro ("234", "HARRY POSTRES Y LA PIEDRA FILOSOFAL",2101); 
			Revista life = new Revista ("123","Life",2009, 5);
Publicacion ps= new Publicacion("646","new times",2017);



System.out.println(harryPotter.toString());
harryPotter.prestar();
System.out.println(harryPotter.toString());
harryPotter.devolver();


life.toString();
life.getCodigo();

ps.toString();

System.out.println("Codigo revista : "+ ps.getCodigo());

}
}
