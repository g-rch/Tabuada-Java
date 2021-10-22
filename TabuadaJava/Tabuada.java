package test;

import java.util.Scanner;

public class Tabuada {
        
	static Scanner s = new Scanner(System.in);
	// Vetor de inteiros coontendo números de 1 até 10
	static int m[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void main(String[] args) {
		// Variável "Número"
		int n = 0;

        //Entrada do número
		System.out.println("--- Tabuada Automática ---");
		System.out.print("\nDigite um número: ");
		n = s.nextInt();
		

		multiplicacao(n);

        //Fechamento do programa
		System.out.println("\nFim do Programa");
	}

	public static void multiplicacao(int n) {
		//Vetor "Resultado"
		int r[] = new int[10];
		
		//Laço de repetição do código
		while (n != 0) {
			System.out.println("\nTabuada do " + n + ":\n");

            //Realiza a operação e armazena num Vetor / Imprime o resultado
			for (int i = 0; i < 10; i++) {
				r[i] = n * m[i];
				System.out.println(n + " x " + m[i] + " = " + r[i]);
			}

            //Nova entrada do número, possibilita o encerramento do programa
			System.out.println("\n(Digite 0 para finalizar o programa)");
			System.out.print("\nDigite um número: ");
			n = s.nextInt();
		}
	}
}