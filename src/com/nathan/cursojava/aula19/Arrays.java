package com.nathan.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		// double temp[]; é outra forma de declarar, mas a boa prática é que 
		// o sinal de vetor esteja junto com o tipo, para facilitar a leitura
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 27.5;
		temperaturas[2] = 30.7;
		temperaturas[3] = 28.8;
		temperaturas[4] = 34.3;
		temperaturas[5] = 22.0;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		System.out.println("O tamanho do array: " + temperaturas.length); // valor total do tamanho reservado na declaração
		System.out.println("Valores do array: " + temperaturas); // endereço de memória onde o array está
		
		// Forma padrão de iterar um array
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		// Forma melhorada a partir da versão Java 5 
		// NÃO POSSUI índice
		for (double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
