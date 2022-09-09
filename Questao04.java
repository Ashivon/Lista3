import java.util.Scanner;
public class Questao04 {
/*Somatório: Sua função deverá receber um vetor e retorna a soma de todos
elementos do vetor;*/
	
	public static int somaelementos(int vet[]) {
		int soma=0;
		for(int i=0; i<vet.length; i++) {
			soma= soma+vet[i];
		}
		System.out.println("A soma dos elementos é:"+soma);
		return soma;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vet[], tamanho;
		
		System.out.println("Digite o tamanho do vetor:");
		tamanho = ler.nextInt();
		vet=new int [tamanho];
		
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento:");
			vet[i]=ler.nextInt();
		}
		somaelementos(vet);
	}

}
