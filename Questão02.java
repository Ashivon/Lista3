import java.util.Scanner;
public class Questão02 {
/*Pesquisa por índice: Sua função deverá receber um vetor e retornar o
elemento do vetor por meio de um índice informado. Seu programa deverá
tratar os casos em que o índice não existe no vetor.*/
	public static int pesquisar(int vet[], int numero) {
		numero--;
		if(numero>vet.length-1) {
			System.err.println("índice não existente.");
			return 0;
		}
		System.out.println(vet[numero]);
			return vet[numero];
	}
	
	public static void main(String[] args) {

		Scanner armazenar = new Scanner(System.in);
		int tamanhoVetor, posicao;
		System.out.println("Digite o tamanho do vetor:");
		tamanhoVetor = armazenar.nextInt();
		
		int vet[] = new int [tamanhoVetor];
		for(int i=0; i<tamanhoVetor; i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			vet[i]=armazenar.nextInt();
		}
		
		System.out.println("Digite um indíce do vetor:");
		posicao = armazenar.nextInt();
		
		pesquisar(vet, posicao);
	}

}
