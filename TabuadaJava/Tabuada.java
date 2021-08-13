import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	
        Scanner s = new Scanner(System.in);

        //Vetor "Resultado" e "Multiplicandos"
		int r[] = new int[10], m[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Variável "Número"
		int n = 0;

        //Entrada do número
		System.out.println("---------------TABUADA AUTOMÁTICA---------------");
		System.out.print("\nDigite um número: ");
		n = s.nextInt();
		System.out.println("\n------------------------------------------------");

        //Laço de repetição do código
		while (n != 0) {
			System.out.println("\nTabuada do " + n + ":\n");

            //Realiza a operação e armazena num Vetor / Imprime o resultado
			for (int i = 0; i < 10; i++) {
				r[i] = n * m[i];
				System.out.println(n + " x " + m[i] + " = " + r[i]);
			}

            //Nova entrada do número, possibilita o encerramento do programa
			System.out.println("\n------------------------------------------------");
			System.out.println("\n(Digite 0 para finalizar o programa)");
			System.out.print("\nDigite um número: ");
			n = s.nextInt();
			System.out.println("\n------------------------------------------------");
		}

        //Fechamento do programa
		System.out.println("\nFim do Programa");
        s.close();
	}
}