package com.clase7;

import javax.swing.JOptionPane;

public class AppMain {
public static void main(String[] args) {
	

/*Exception :
		-Es un errror que ourre en timepo de ejecucion
		-utitlizando el subsitema de manejo de exvepciones de Java,
		se puede, de una manera estructurada y controla,
		manejar todo los errores de tiempo de ejecucion*/
	
	
	
	/* Manejo de Exceptions: 
	 * Una ventaja principal del manejo de excepcione es que nos automaitza gran parte 
	 * del codigo de manejo de errores, que antiguamente debiamos hacerlo "a mano" en caulquier programa
	 * x ejemplo en algunos lemguajes ,más anotiguos los codigos de error se devuelve cuando falla un metodo 
	 * y estos valores se debian verificar manualmente cada vez q llamabamos a esa funcion/metodo
	 */
 /* El manejo de excepciones nos agiliza el manejo de errores al permitir que tu programa
  *  defina un bloque de codigo, llamado " manejador de exception"
  *   que se ejecuta automaticamente cuando ocurre un error;
  */

	//Errores = cuando los inteanciamos son objetos 
	
	/*Otra razon por que el manejo de excepciones es importante 
	 * es que java nos define excvepciones estandar para erroers comunes del programa
	 * nuestro progama debe " vigilar y capturar estas excepciones"
	 * 
	 */
	
	/* JERARQUIA DE EXCEPCIONES:
	 * tenemos dos sublcase directas de Throwable : exception y Error
	 * 
	 * 1) Error: Estan relacionados con errores que ocurren en la JVM
	 * y no es tu progama, este tipo de errores se escapan de nuestro "control"
	 * y x lo general, tu programa no se vva a ocupar de ellos
	 * 
	 * 2)Exception; Son errores que resultan de la actividad de nuestro programa
	 * 
	 * Por ejemplo: intentar dividir entre 0 , superar los limites de un vector, en graal tu programa 
	 * debe manejar exception de este tipo, una Subclase importante de Exceeption es 
	 * Runtime Exception, que se usa para representar varios tipos comines de errores 
	 * en tiempo de ejecucion.
	 */
   
	/*Fundamento de manejo de Exceptions:
	 * Estas se gestionan a travez de 5 palabras claves*/
	//try,catch.throws, throw y finally
	/*estos forman un sistema interrelacionados en que el uso de uno, no implica
	 * el uso del otro 
	 */
	// Integer.parseInt(JOptionPane.showInputDialog("ingrese fruta"));
	 
	
	 try { 
	
	System.out.println("Antes de que se genere la exception");
//	JOptionPane.showInputDialog("ingrese fruta");
	
	//bloque de codigo paa monitorear errores
	/*Si no se genera una exveption, el bloque try finalizara normalmente
	 *  y todos sus catch se pasaran por alto
	 */
	ExcepNueva.forzarException();
}catch (Exception identificador) /*tipo exception + identidicador*/{
	//Manejamos la exception 1
System.out.println("Get message" + identificador.getMessage());
	
	
	System.out.println("ToString" + identificador.toString());
/* -toString devuelve un objeto que contiene una 
 * descripcion completa de la exception, este metodo a su vez llama 
 * 
 * println() de throwable */
	
	//devuelve un objeto thowabke que contriene seguimiento de la pila completo,
	//este objeto puede vovler a lanzar
	identificador.fillInStackTrace();
	
	
	//}muestra el flujo de error estandar
	identificador.printStackTrace();
	
	System.out.println("Papu, hiciste algo mál");
}
	

	System.out.println("dsp de que superemos la exception");


	
}
}
