import java.util.Scanner;
public class Questao20 {
/*Diferença-A: são informados dois vetores (A e B) e o programa deverá
mostrar todos elementos que estão no vetor A e não estão no vetor B;*/
	public static void Diferenca(int[] vet, int[] vet2) {
		int cont=0;
		System.out.println("Existem no primeiro vetor, mas não existem no segundo:");
		for (int i=0; i<vet.length; i++) {
			for (int j=0; j<vet2.length; j++) {
				if (vet[i]==vet2[j])
					cont++;
			}
			if (cont==0)
				System.out.println("Número: "+vet[i]+" / Posição: "+(i+1));
			cont=0;
		}
	}
	
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int tamanho1, tamanho2;
		
		System.out.println("Digite o tamanho do primeiro vetor:");
		tamanho1=ler.nextInt();
		System.out.println("Digite o tamanho do segundo vetor:");
		tamanho2=ler.nextInt();
		
		int[] vetor1=new int [tamanho1];
		int[] vetor2=new int [tamanho2];
		for(int i=0; i<tamanho1; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento do primeiro vetor:");
			vetor1[i]=ler.nextInt();
		}
		for(int i=0; i<tamanho2; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento do segundo vetor:");
			vetor2[i]=ler.nextInt();
		}
		
		Diferenca(vetor1, vetor2);
	}

}
