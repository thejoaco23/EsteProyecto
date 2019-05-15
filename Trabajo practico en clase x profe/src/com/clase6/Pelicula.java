package com.clase6;

public class Pelicula  extends Multimedia{

	private String actorPrincipal;
	private String actrizPrincipal;
	
	public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
		//Invoco al constructor de la clase Multimedia
		
		super(titulo, autor, formato, duracion); 
     if(actor ==null && actriz == null) {
 throw new IllegalArgumentException("Strike 2 Bobo, parametros vacios"); }
	 actorPrincipal = actor;
	actrizPrincipal = actriz;

	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}
	
	public String toString() {
String s = "Protagonizado por : ";
s += actrizPrincipal;	
return super.toString()+ s;

	}
	
	}

