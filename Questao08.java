import java.util.Scanner;
public class Questao08 {
/*Priorização: Sua função deverá receber um vetor e pegar os elementos do
vetor e colocar em um segundo vetor. Os novos elementos devem ser
colocados no segundo vetor apenas quando eles contribuam para a média
dos segundo vetor aumentar.*/
	public static void priorizacao (int vet[]) {
		int vet2[]= new int[vet.length];
		int somadovetor=0, mediaanterior=0, mediaatual=0;
		
		for(int i=0; i<vet.length; i++) {
			somadovetor=somadovetor+vet[i];
			mediaatual=somadovetor/vet.length;
			if(mediaatual>mediaanterior) {
				System.out.println("adicionado: "+vet[i]);
				mediaanterior=mediaatual;
				vet2[i]=vet[i];
			}
		}
		
		System.out.println("Valores adicionados no segundo vetor:");
		for(int i=0; i<vet.length; i++) 
			System.out.println(vet2[i]);
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanho;
		
		System.out.println("Digite o tamanho do vetor:");
		tamanho=ler.nextInt();
		
		int vetor[]=new int [tamanho];
		for(int i=0; i<tamanho; i++) {
			System.out.println("digite um elemento:");
			vetor[i]=ler.nextInt();
		}
		priorizacao(vetor);
	}

}
