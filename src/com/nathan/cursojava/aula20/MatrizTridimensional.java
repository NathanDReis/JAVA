package com.nathan.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int[][][] matrizTridimensional = new int[3][3][3];
		
		for (int i=0; i < matrizTridimensional.length; i++) {
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					matrizTridimensional[i][j][k] = (i + j + k);
					System.out.println(i + " + " + j + " + " + k + " = " + matrizTridimensional[i][j][k]);
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for (int i=0; i < matrizTridimensional.length; i++) {
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					int valor = matrizTridimensional[i][j][k];
					soma += valor;
					
					if (valor % 2 == 0) {
						somaPares += valor;
						continue;
					}
					
					somaImpares += valor;
				}
			}
		}
		
		System.out.println("A soma de tudo é: " + soma);
		System.out.println("A soma dos pares é: " + somaPares);
		System.out.println("A soma dos ímpares é: " + somaImpares);

	}

}
