import java.util.Scanner;
public class Questao15 {
/*Complementação: Sua função deverá receber dois vetores de números
inteiros positivos e negativos. Ela deverá produzir um terceiro vetor em que
cada índice desse vetor tenha um número que somado com elementos do
mesmo índice dos vetores anteriores tenha a soma sempre igual a 10.*/
	public static void igualacao(int vet[], int vet2[]) {
		int soma=0;
		int tamanhomax1, tamanhomax2;
		tamanhomax1=vet.length;
		tamanhomax2=vet2.length;
		
		if(tamanhomax1>=tamanhomax2) {
			int vet3[]=new int[tamanhomax1];
			for(int i=0; i<tamanhomax1; i++) {
				soma=vet[i]+vet2[i];
				soma=10-soma;
				vet3[i]=soma;
			}
			for(int i=0; i<vet3.length; i++) {
				System.out.println(vet3[i]);
			}
		}else{
			int vet3[]=new int[tamanhomax2];
			for(int i=0; i<tamanhomax2; i++) {
				soma=vet[i]+vet2[i];
				soma=10-soma;
				vet3[i]=soma;
			}
			for(int i=0; i<vet3.length; i++) {
				System.out.println(vet3[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int tamanho1, tamanho2;
		System.out.println("Digite o tamanho do primeiro vetor: ");
		tamanho1=ler.nextInt();
		System.out.println("Digite o tamanho do segundo vetor: ");
		tamanho2=ler.nextInt();
		
		int vetor1[] = new int [tamanho1];
		for(int i=0; i<vetor1.length; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento do primeiro vetor:");
			vetor1[i]=ler.nextInt();
		}
		
		int vetor2[] = new int [tamanho2];
		for(int i=0; i<vetor2.length; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento do primeiro vetor:");
			vetor2[i]=ler.nextInt();
		}
		
		igualacao(vetor1, vetor2);
	}

}
