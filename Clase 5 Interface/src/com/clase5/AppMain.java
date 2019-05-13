package com.clase5;

public class AppMain {

	public static void main(String[] args) {
		
		
		// INTERFACES
		/* En la programacion oo, a veces es util definir que debe hacer una clase pero no como lo hara.
		 * 
		 * 
		 * una interfaz (interface) es sintacticamente similar a una calse abstractan en la que se puede especificar uno o mas
		 * metodos que no tienen cuerpo {}
		 * 
		 * esos metodos deber ser implementado por una clase para que definan sus acciones 
		 *  una vez que se define una interfaz, cualquier cantidad de clases puede implementarlar
		 *  ademas, una clase puede implementar cualquier cantidad de interfaces 
		 * 
		 * para implementar una interfaz, una clase debe proporcionar cuerpos
		 * _(implementaciones) para los metodos descriptos por la interfaz. 
		 * cada clase es libre de determinar los detalles de su propia implementacion.
		 * ejmp 2 clases puden implementar la misma interfaz de diferenter maneras, pero CADA CLASE AUN
		 * ADMITE EL MISMO CONJUNTO DE METODOS
		 * 
		 * Si una clase implementa una interfaz pero no implementa (todos) los metodos definidos
		 * por esa interfaz, esa clase debe declarace como Abstracta, No se puede crear 
		 * objetos de dicha clase, pero se podra usar como una Super Clase(clase padre) abstracta,
		 * lo que permite  que las subclases proporcionen la implementacion Completa de la interfaz
		 * 
		 * Referencias a interface:
		 * Se puede declarar una variable de referencia de un tipo de interfaz en otras palabras, 
		 * puede crear una variable de referencia de interfaz. 
		 * 
		 * Dicha variable puede referirce a cualquier objeto que implemente su interfaz. Cuando llamamos un metodo
		 * en un objeto a travez de una referencia de interfaz, es la version del metodo implementado
		 * por el objeto que se ejecuta .
		 * 
		 * Este proceso es muy similar al uso de una referecia de superlase 
		 * para acceder a un objeto de Subclase.
		 * 
		 * JDK 8; En esta version se agrego una funcion a interface que genero un
		 * cambio significativo en sus capacidades. Antes d eJDK 8 no podiamos definir 
		 * ninguna implementacion de ningun tipo.
		 * Hoy es posible agregar una implementacion  predeterminada a un metodo de 
		 *la interfaz 		
		 *
		 * JDK 9 :
		 * Podemos incluir metodos privados 
		 * 
		 * 
		 * 
		 * sin embargo, esas nuevas cualidades son de USO ESPECIAL, por lo tanto como regla
		 * general, con frecuencia solo se crearar  y utilizara  interfaces en las que no se utilizaran
		 *  estas nuevas funcionalidades
		 *  
		 *  En una interfaz los metodos son implicitamente PUBLICOS
		 *  las variables declaradas en u na interfaz no son varias de instancia
		 *  son impliciatamente public, final y static, y deben 
		 *  
		 * 
		 *  */
		
		//SerieNumericaDe2en2 obj = new  SerieNumericaDe2en2();
		
		D3 obj= new D3();
	
		
		//Referencia a interface
		SerieNumericaDe2en2 dosOb=new SerieNumericaDe2en2();
		D3 tresOb=new D3();
		/*ob es el objeto declarado como referencia a la interface IseriesNumericas.
		Esto significa que podra utilizar oara almacenar referencias a cualquier objeto que implemente
		Iseriesnumericas.
		en este caso lo utilizamos para referirnos a 2OB y 3OB los cuales si implementan la interface
		IseriesNumericas.
		Una variable de interface solo tiene conocimiento de los  metodos declarados x 
		su declaracion de interface, por lo tanto OB no podria usarse para acceder a otras variables
		o metodos que puede ser compatibles con el objeto.  */
		ISerienumericas ob;
		
		
		for(int j=0; j<5; j++) {
			ob=dosOb;
			System.out.println("Ref, Siguiente valor D2 es : " +ob.getSiguiente());
			ob=tresOb;
			System.out.println("Ref, Siguiente valor D3 es :" +ob.getSiguiente());
		}
		
		
		for(int i=0; i<5;i++)
			System.out.println("siguiente valor es : " + obj.getSiguiente());
		
		System.out.println("\n reiniciando la serie ");
		obj.reiniciar();
	
		for(int i=0; i<5;i++)
			System.out.println("siguiente valor es : " + obj.getSiguiente());
		
		System.out.println("\n reiniciando la serie en 50");
		obj.setComenzar(50);	
		
		for(int i=0; i<5;i++)
			System.out.println("siguiente valor es : " + obj.getSiguiente());
		
		
		

	}
//
	
	
}
