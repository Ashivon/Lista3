import java.util.Scanner;

public class Questao03 {

	public static void Organizar(int vet[]) {
		int vetA[] = new int[vet.length];
		int vetB[] = new int[vet.length];

		for (int i = 0; i < vet.length; i++) {
			vetA[i] = vet[i];
			if (vetA[i] < 0 && i > 0) {
				if (vetA[i] < vetA[(i - 1)]) {
					vetB[i] = vetA[(i - 1)];
					vetA[(i - 1)] = vetA[i];
					vetA[i] = vetB[i];
				} else {
					vetA[i] = vet[i];
				}
			} else {
				if (i > 0) {
					if (vetA[i] < vetA[(i - 1)]) {
						vetB[i] = vetA[(i - 1)];
						vetA[(i - 1)] = vetA[i];
						vetA[i] = vetB[i];
					} else {
						vetA[i] = vet[i];
					}
				}
			}
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println(vetA[i]);
		}
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanhodovetor;

		System.out.println("Digite o tamanho do vetor:");
		tamanhodovetor = ler.nextInt();
		int vetor[] = new int[tamanhodovetor];

		for (int i = 0; i < tamanhodovetor; i++) {
			System.out.println("Digite o " + (i + 1) + "° elemento:");
			vetor[i] = ler.nextInt();
		}
		ler.close();
		Organizar(vetor);
	}

}
