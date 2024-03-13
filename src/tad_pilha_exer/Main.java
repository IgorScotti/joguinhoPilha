package tad_pilha_exer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Jogo jogo1 = new Jogo();

		while (true) {

			jogo1.mostraPilhas();

			System.out.println("Sair: 1-SIM 0-NÃO");
			int sair = sc.nextInt();

			if (sair == 1) {
				jogo1.finalJogo();
				break;
			}
			jogo1.mostraPilhas();

			System.out.println("Remover qual elemento da pilha");
			System.out.print("pilha:");
			String x = sc.next();
			System.out.print("linha:");
			int y = sc.nextInt();

			jogo1.pop(x, y);

			jogo1.mostraPilhas();

			System.out.println("Adicionar em qual elemento da pilha");
			System.out.print("pilha:");
			String a = sc.next();

			System.out.print("linha:");
			int b = sc.nextInt();

			jogo1.push(a, b);

			jogo1.mostraPilhas();

		}
		sc.close();
	}

}
