package com.nathan.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10); // números aleatórios de 0-10
		}
		
		// Usado para ler e para setar valores
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("Usando o for each");
		// Usado para ler valores
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println("Exmeplo com arrays multidimensionais");
		// Como seria com MATRIZ
		double[][] alunos = new double[3][4];
		
		alunos[0][0] = 10;
		alunos[0][1] = 7;
		alunos[0][2] = 8;
		alunos[0][3] = 9.5;
		
		alunos[1][0] = 9;
		alunos[1][1] = 8;
		alunos[1][2] = 7;
		alunos[1][3] = 9;
		
		alunos[2][0] = 8;
		alunos[2][1] = 9;
		alunos[2][2] = 10;
		alunos[2][3] = 7;
		
		for (double[] aluno : alunos) {
			for (double nota : aluno) {
				System.out.println(nota + " ");
			}
			
			System.out.println();
		}

	}

}
