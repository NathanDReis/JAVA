package com.nathan.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; // count ou cont
		int max = 10;
		
		System.out.println("Contanto de " + i + " até " + max);
		
		// Só executa se a expressão for true
		while (i <= 10) {
			System.out.println("O valor de i: " + i++);
		}
		System.out.println("O valor atual de i: " + i); // valor de 11
		
		max = 15;
		System.out.println("Contanto de " + i + " até " + max);
	
		// Executa primeiro e verifica depois se irá continuar
		do {
			System.out.println("Valor de i: " + ++i);
		} while (i < max);
		System.out.println("O valor atual de i: " + i); // valor de 14

	}

}
