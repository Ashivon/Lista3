import java.util.Random;
import java.util.Scanner;
public class Questao16 {
/*Polarização: Sua função deverá receber um vetor com números aleatórios.
Os números ímpares devem ficar nas posições iniciais do vetor e os números
pares nas posições finais.*/
	public static void gerarvetor(int vet[]) {
		Random gerar = new Random();
		for(int i =0; i<vet.length; i++) {
			vet[i]=gerar.nextInt(100);
		}
		
		System.out.println("O vetor é:");
		for(int i =0; i<vet.length; i++) {
			System.out.print(vet[i]+" ");
		}
		organizarvetor(vet);
	}
	
	public static void organizarvetor(int vet[]) {
		int vet2[]=new int[vet.length];
		int cont=0;
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i]%2==1) {
				vet2[cont]=vet[i];
				cont++;
			}
		}
		for(int i=0; i<vet.length; i++) {
			if(vet[i]%2==0) {
				vet2[cont]=vet[i];
				cont++;
			}
		}
		
		System.out.println("\n");
		System.out.println("O vetor organizado é:");
		for(int i=0; i<vet.length; i++)
			System.out.print(vet2[i]+" ");
	}
	
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int tamanho;
		System.out.println("Digite o tamanho do vetor:");
		tamanho=ler.nextInt();
		
		int vetor[]=new int[tamanho];
		gerarvetor(vetor);
	}

}
