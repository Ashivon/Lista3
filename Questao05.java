import java.util.Scanner;
public class Questao05 {
/*Junção de vetor: Sua função deverá receber dois vetores de qualquer
tamanho e retornar apenas um vetor que contenha os dois vetores. O
primeiro vetor deverá ficar nas primeiras posições e o segundo vetor nas
últimas posições.*/
	public static int juntarvetor(int vet1[], int vet2[], int tam1, int tam2) {
		int vetC[]=new int[(tam1+tam2)];
		
		for(int i=0; i<tam1; i++) {
			vetC[i]=vet1[i];
		}
		for(int i=0; i<(tam2); i++) {
			vetC[i+tam1]=vet2[i];
		}
	
		for(int i=0; i<(tam1+tam2); i++) {
			System.out.print(vetC[i]);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanhovet1, tamanhovet2;
		
		System.out.println("digite o tamanho do primeiro vetor:");
		tamanhovet1=ler.nextInt();
		int vetA[]=new int [tamanhovet1];
		
		for(int i=0; i<tamanhovet1; i++) {
			System.out.println("digite o "+(i+1)+"° elemento do vetor:");
			vetA[i]=ler.nextInt();
		}
		
		System.out.println("digite o tamanho do segundo vetor:");
		tamanhovet2=ler.nextInt();
		int vetB[]=new int [tamanhovet2];
		
		for(int i=0; i<tamanhovet2; i++) {
			System.out.println("digite o "+(i+1)+"° elemento do vetor:");
			vetB[i]=ler.nextInt();
		}

		juntarvetor(vetA, vetB, tamanhovet1, tamanhovet2);
	}

}
