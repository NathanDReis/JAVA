package com.nathan.cursojava.aula20;

public class Matriz {

	public static void main(String[] args) {
		
		// Criando uma Matriz
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		// Percorrendo cada posição da matriz
		for (int i=0; i < notasAlunos.length; i++) {
			System.out.println("\nNotas do aluno: " + i);
			System.out.println("----------------------------");
			
			for (int j=0; j < notasAlunos[i].length; j++) {
				System.out.println("Bimestre " + j + ": " + notasAlunos[i][j]);
			}
		}
		
		System.out.println("Calculando a média de cada aluno");
		
		double soma = 0;
		for (int i=0; i < notasAlunos.length; i++) {
			
			soma = 0;
			for (int j=0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			
			System.out.println("Média do aluno " + i + ": " + (soma / 4));
		}
		
		// Outra forma de criar com os valores na inicialização
		// double[] notasAluno1 = {7, 8, 9, 10};
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
		
		// Percorrendo cada posição da matriz
		for (int i=0; i < notasAlunos2.length; i++) {
			System.out.println("\nNotas do aluno: " + i);
			System.out.println("----------------------------");
			
			for (int j=0; j < notasAlunos2[i].length; j++) {
				System.out.println("Bimestre " + j + ": " + notasAlunos2[i][j]);
			}
		}

	}

}
