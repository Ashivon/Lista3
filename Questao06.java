import java.util.Scanner;
public class Questao06 {
/*Inversão de ordem: Sua função deverá retornar um vetor de ordem inversa.
Desta forma, o primeiro elemento passa ser o último elemento do vetor, o
segundo elemento passa ser o penúltimo, assim, sucessivamente;*/
	public static void invertervetor(int vetor[], int tam) {
		int armazen1, armazen2;
		for(int i=0; i<tam/2; i++) {
			armazen1=vetor[i];
			armazen2=vetor[(tam-1)-i];
			vetor[i]=armazen2;
			vetor[(tam-1)-i]=armazen1;
		}
		for(int i=0; i<tam; i++) {
			System.out.print(vetor[i]);
		}
		return;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor:");
		int tamanho = ler.nextInt();
		
		int vet[]= new int [tamanho];
		for (int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento:");
			vet[i]=ler.nextInt();
		}
		
		invertervetor(vet, tamanho);
	}

}
