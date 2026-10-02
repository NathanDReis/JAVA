package com.nathan.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 é 2: " + resultado);
		
		resultado = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2: " + resultado);
		
		// Tabela Verdade
		System.out.println("\n\r-----------------\n\rTabela Verdade\n\r-----------------");
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println((verdadeiro && falso));
		System.out.println((verdadeiro || falso));
		System.out.println((verdadeiro ^ falso)); // Só da false se os dois forem iguais, seja os dois falsos ou verdadeiros.
		System.out.println((!verdadeiro && falso));

	}

}
