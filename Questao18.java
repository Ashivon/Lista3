import java.util.Scanner;
public class Questao18 {
/*Organização: Sua função deverá receber um vetor e organizar os
elementos a fim de que os elementos iguais fiquem próximos.*/
	public static void OrganizarVetor(int vet[]) {
		int aux;
		for (int i=0; i<vet.length; i++) {
			for (int j=i; j<vet.length; j++) {
				if (vet[i]>vet[j]) {
					aux=vet[i];
					vet[i]=vet[j];
					vet[j]=aux;
				}
			}
		}
		
		System.out.println("Vetor organizado:");
		for(int i=0; i<vet.length; i++)
			System.out.print(vet[i]+" ");
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanho;
		System.out.println("Digite o tamanho do vetor:");
		tamanho=ler.nextInt();
		
		int vetor[]=new int [tamanho];
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento:");
			vetor[i]=ler.nextInt();
		}
		
		OrganizarVetor(vetor);
	}

}
