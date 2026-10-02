package com.nathan.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		// Partes ausentes
		
		int count = 0;
		for ( ; count < 5 ; ) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		// Loop infinito (caso a condição seja true)
		
		// Loop sem corpo
		int soma = 0;
		for (int i=0; i < 5; soma += i++); // ou usar {} vazio
		System.out.println(soma);
		
		// As chaves não são necessárias quando só tem uma linha, mas é boa prática usar elas
		for (int i = 0, j = 10; i < j; i++, j--)
			System.out.println("i = " + i + "; j = " + j); // só a primeira linha é executada neste caso

	}

}
