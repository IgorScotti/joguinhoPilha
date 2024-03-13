package tad_pilha_exer;

import java.util.Random;

public class Jogo {

	int a[];
	int b[];
	int c[];
	int vetor3[];
	int vetorFinal[];

	Random random = new Random();
	String pla;
	int valor1, valor2, li, maior, menor, valFinal;

	public Jogo() {

		this.a = new int[6];
		this.b = new int[6];
		this.c = new int[6];
		vetor3 = new int[this.a.length + this.b.length];
		vetorFinal = new int[this.a.length + this.b.length];
		inicioJogo();
	}

	private void inicioJogo() {

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
			b[i] = random.nextInt(100);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; i < a.length; i++) {
				if (a[i] == a[j]) {
					a[i] += 10;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; i < b.length; i++) {
				if (b[i] == b[j]) {
					b[i] += +10;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			vetor3[i] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			vetor3[i + a.length] = b[i];
		}

	}

	public void pop(String x, int y) {
		if (x.equals("a")) {
			valor1 = this.a[y];
			this.a[y] = 0;
			pla = x;
			li = y;

		} else if (x.equals("b")) {
			valor1 = this.b[y];
			this.b[y] = 0;
			pla = x;
			li = y;

		} else if (x.equals("c")) {
			valor1 = this.c[y];
			this.c[y] = 0;
			pla = x;
			li = y;

		} else {
			System.out.println("Jogada inválida!!");
		}
	}

	public void push(String x, int y) {
		if (x.equals("a")) {
			if (this.a[y] == 0) {
				this.a[y] = valor1;
			} else {
				System.out.println("Jogada inválida!!");
				if (pla.equals("a")) {
					this.a[li] = valor1;
				} else if (pla.equals("b")) {
					this.b[li] = valor1;
				} else if (pla.equals("c")) {
					this.c[li] = valor1;
				}
			}

		} else if (x.equals("b")) {
			if (this.b[y] == 0) {
				this.b[y] = valor1;
			} else {
				System.out.println("Jogada inválida!!");
				if (pla.equals("a")) {
					this.a[li] = valor1;
				} else if (pla.equals("b")) {
					this.b[li] = valor1;
				} else if (pla.equals("c")) {
					this.c[li] = valor1;
				}
			}

		} else if (x.equals("c")) {
			if (this.c[y] == 0) {
				this.c[y] = valor1;
			} else {
				System.out.println("Jogada inválida!!");
				if (pla.equals("a")) {
					this.a[li] = valor1;
				} else if (pla.equals("b")) {
					this.b[li] = valor1;
				} else if (pla.equals("c")) {
					this.c[li] = valor1;
				}
			}

		}

	}

	public void finalJogo() {

		for (int i = 0; i < vetor3.length; i++) {
			maior = 0;
			menor = 0;
			for (int j = 0; j < vetor3.length; j++) {
				if (vetor3[i] > vetor3[j]) {
					maior++;
				} else {
					menor++;
				}
			}
			if (maior == 0) {
				vetorFinal[i] = vetor3[0];
			} else if (maior == 1) {
				vetorFinal[i] = vetor3[1];
			} else if (maior == 2) {
				vetorFinal[i] = vetor3[2];
			} else if (maior == 3) {
				vetorFinal[i] = vetor3[3];
			} else if (maior == 4) {
				vetorFinal[i] = vetor3[4];
			} else if (maior == 5) {
				vetorFinal[i] = vetor3[5];
			} else if (maior == 6) {
				vetorFinal[i] = vetor3[6];
			} else if (maior == 7) {
				vetorFinal[i] = vetor3[7];
			} else if (maior == 8) {
				vetorFinal[i] = vetor3[8];
			} else if (maior == 9) {
				vetorFinal[i] = vetor3[9];
			} else if (maior == 10) {
				vetorFinal[i] = vetor3[10];
			} else if (maior == 11) {
				vetorFinal[i] = vetor3[11];
			}
		}

		for (int i : vetorFinal) {
			if (i != 0) {
				valFinal++;
			}

		}

		if (valFinal == 12) {
			System.out.println("Parabêns você ganhou!!");
		} else {
			System.out.println("Algo errado aconteceu!!");
		}
	}

	public void mostraPilhas() {
		System.out.println("======a========");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("======b========");
		for (int j = 0; j < b.length; j++) {

			System.out.print(b[j] + " ");
		}
		System.out.println();
		System.out.println("======c========");
		for (int n = 0; n < b.length; n++) {

			System.out.print(c[n] + " ");
		}
		System.out.println();
		System.out.println();
	}
}
