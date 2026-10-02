package com.nathan.cursojava.aula11;

public class CuriosidadeInteiros {

	public static void main(String[] args) {
		
		int var1 = 2147483647; // Está no limite do inteiro
		int var2 = 100;
		
		// O que acontece se eu somar os dois, sendo que o var1 já está no limite?
		System.out.println(var1 + var2);
		
		// Depois do limite ele lança um número negativo, pois
		// ao invés de lançar um erro ele dá a volta para o início

	}

}
