package com.nathan.cursojava.aula14;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tem batatas?");
		boolean temBatata = scan.nextBoolean();

		int ovos = 6;
		
		if (temBatata) {
			System.out.println("Pelo visto tem batatas.");
			ovos = 9;
		} else {
			System.out.println("Pelo visto não tem batatas.");
		}
		
		System.out.println("Compre " + ovos + " ovos.");
		
		System.out.println("Qual o preço do produto?");
		int precoItem = scan.nextInt();
		String resultadoPreco = "";
		
		if (precoItem <= 10) {
			resultadoPreco = "O preço está barato";
		} else if (precoItem < 15) {
			resultadoPreco = "O preço está justo";
		} else {
			resultadoPreco = "O preço está caro";
		}
		
		System.out.println(resultadoPreco);

	}

}
