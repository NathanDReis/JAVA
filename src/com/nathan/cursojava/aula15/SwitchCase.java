package com.nathan.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o dia da semana hoje?");
		int diaSemana = scan.nextInt();

		String nomeDiaSemana;
		switch (diaSemana) {
			case 1: nomeDiaSemana = "Domingo"; break;
			case 2: nomeDiaSemana = "Segunda"; break;
			case 3: nomeDiaSemana = "Terça"; break;
			case 4: nomeDiaSemana = "Quarta"; break;
			case 5: nomeDiaSemana = "Quinta"; break;
			case 6: nomeDiaSemana = "Sexta"; break;
			case 7: nomeDiaSemana = "Sábado"; break;
			default: nomeDiaSemana = "Este dia não é válido";
		}
		System.out.println(nomeDiaSemana);
		
		String diaUtil;
		switch (diaSemana) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: diaUtil = "Dia útil"; break;
			case 1:
			case 7: diaUtil = "Fim de semana"; break;
			default: diaUtil = "Este dia não é válido";
		}
		System.out.println(diaUtil);
		
		// Enquanto no if utilizamos sempre expressões com operadores lógicos e relacionais que resultam num boolean
		// no switch podemos passar um byte, short, int, char (pode ser visto como um valor numérico) ou Enum,
		// sempre números inteiros e a partir do Java 7 o tipo String.

	}

}
