package com.nathan.cursojava.aula11;

public class Literais {

	public static void main(String[] args) {
		
		// ---------------------------------------
		// Para deixar explícito que é um longo 
		// pode usar um "l" ou "L" no final
		// ---------------------------------------
		
		int idade1 = 20;
		long idade2 = 20l;		
		
		// ---------------------------------------
		// Por padrão sempre declaramos um int,
		// por isso não precisa de literal para int.
		// A mesma regra se aplica ao double.
		// Por padrão sempre usamos double. 
		// E o float deve ter o literal "f" ou "F".
		// ---------------------------------------

		double d1 = 1.234e2; // Aceita notação científica
		float f1 = 1.234e2f; // Também aceita notação científica
		float f2 = 1.234e2F; // é o mesmo que o número vezes 10 elevado a 2
		
	}

}
