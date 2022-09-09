import java.util.Scanner;
public class Questao07 {
/*Inversão de vetores: Sua função deverá receber dois vetores. Sendo que
os dados do primeiro vetor deve ser colocado no segundo vetor e os dados
segundo vetor devem ser colocados no primeiro vetor.*/
	public static int inverter(int vet1[], int vet2[]) {
		int vetaux[]=new int [(vet1.length+vet2.length)];
		
		for(int i=0; i<vet1.length && i<vet2.length; i++) {
			vetaux[i]=vet1[i];
			vet1[i]=vet2[i];
			vet2[i]=vetaux[i];
		}
		
		System.out.println("Vetor 1:");
		for(int i=0; i<vet1.length && i<vet2.length; i++)
			System.out.println(vet1[i]);
		
		System.out.println("Vetor 2:");
		for(int i=0; i<vet1.length && i<vet2.length; i++)
			System.out.println(vet2[i]);
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanhovet1, tamanhovet2;
		
		System.out.println("Digite o tamanho do vetor 1:");
		tamanhovet1=ler.nextInt();
		
		int vetor1[]=new int [tamanhovet1];
		for(int i=0; i<tamanhovet1; i++) {
			System.out.println("Digite um elemento:");
			vetor1[i]=ler.nextInt();
		}
		
		System.out.println("Digite o tamanho do vetor 2:");
		tamanhovet2=ler.nextInt();
		
		int vetor2[]=new int [tamanhovet2];
		for(int i=0; i<tamanhovet2; i++) {
			System.out.println("Digite um elemento:");
			vetor2[i]=ler.nextInt();
		}
		
		inverter(vetor1, vetor2);

	}

}
