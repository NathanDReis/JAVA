package com.nathan.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		// Este operador valida a segunda condição mesmo quando a primeira é falsa
		boolean resultado1 = falso & 
				verdadeiro;
		
		// Este operador pula a segunda condição quando a primeira é falsa
		// pois o operador é um & e só é verdadeiro se os dois forem.
		boolean resultado2 = falso && 
				verdadeiro;
		
		// Observação: rode o programa com debug para verificar o que foi dito.
		// O debug passa para a próxima linha com f5 e precisa marcar a linha de start
		// com dois clicks no número da linha
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int resultado = 1 + 1 - 1 + 2 * 2 / 1;
		System.out.println(resultado);

	}

}
