package com.nathan.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado /= 2;
		System.out.println(resultado);
		
		resultado += 9;
		System.out.println(resultado);
		
		resultado %= 3;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		System.out.println(--resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

	}

}
