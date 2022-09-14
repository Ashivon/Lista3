import java.util.Scanner;
public class Questao10 {
/*Compactação Sua função deverá receber um vetor composto com uma
sequência de zeros e uns e gerar um novo vetor compactado.

A quantidade dos elementos repetidos devem ser contados e o número de
ocorrências deve ser colocado logo após o elemento.*/
	
	public static int[] Compactacao(int vet[], int n) {
		int armazen = vet[0], cont = 0, aux = 0;
		int []vet2;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != 1 && vet[i] != 0)
				System.err.println("Valor não binário.");
			if (vet[i] != armazen % 2)
				armazen++;
		}
		if (vet[0] == 0)
			vet2 = new int[(armazen + 1) * 2];
		else
			vet2 = new int[armazen * 2];
		armazen = vet[0];
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != armazen % 2) {
				vet2[aux] = vet[i - 1];
				vet2[++aux] = cont;
				aux++;
				cont = 0;
				armazen++;
			}
			cont++;
			if (i == vet.length - 1) {
				vet2[aux] = vet[i];
				vet2[++aux] = cont;
			}
		}
		for (int i : vet2) {
			System.out.print(i);
		}
		return vet2;
	}
	
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int tamanho, n=0;
		
		System.out.println("Digite o tamanho do vetor binário:");
		tamanho=ler.nextInt();
		
		int vetor[]=new int[tamanho];
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite um elemento:");
			vetor[i]=ler.nextInt();
		}
		
		Compactacao(vetor, n);
	}

}
