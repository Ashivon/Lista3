import java.util.Scanner;
public class Questao17 {
/*Explosão: Sua função deverá receber um vetor e gerar um segundo vetor
com os dados acrescidos. O número de cada posição do vetor de entrada
corresponde ao número de elementos que devem ser gerados.*/
	public static void explosao(int vet[]) {
		int tam=0, aux=0, cont=0;
		for(int i=0; i<vet.length; i++)
			tam+=vet[i];
		int vet2[]=new int[tam];
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet[i]; j++) {
				vet2[cont] = vet[i];
				cont++;
			}
		}
		
		System.out.println("A explosão será:");
		for(int i=0; i<tam; i++)
			System.out.print(vet2[i]+" ");
	}
	
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		int tamanho;
		System.out.println("Digite o tamanho do vetor:");
		tamanho=ler.nextInt();
		
		int vetor[]=new int [tamanho];
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento do vetor:");
			vetor[i]=ler.nextInt();
		}
		
		explosao(vetor);
	}

}
