package com.nathan.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		char o = 'o';
		char i = 'i';
		
		char o2 = 111;
		char i2 = 105;
		
		char aComAcento = 0X00E1; // valor 'á'
		char interrogacao2 = '?';
		
		System.out.println("" + o + i);
		System.out.println("" + o2 + i2);
		
		System.out.println(o + i);
		
		System.out.println("" + aComAcento);
		System.out.println("" + interrogacao2);
		
		// Podem ser utilizados no char
		// ---------------------------------------------------------
		// Sequências de Escape         Descrição
		// ---------------------------------------------------------
		// \t                    	|   tab
		// \b           	     	|   backspace
		// \n       			 	|   nova linha
		// \r       				|   retorno de carro
		// \f       				|   avanço de página
		// \'       				|   aspas simples
		// \"       				|   aspas duplas
		// \\       				|   barra invertida
		// \ddd     				|   constante octal
		// \\uxxxx   				|   constante hexadecimal
		// ---------------------------------------------------------

	}

}
