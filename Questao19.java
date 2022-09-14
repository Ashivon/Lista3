import java.util.Iterator;
import java.util.Scanner;
public class Questao19 {
/*Agrupamento: Sua função deverá receber o número de agrupamento desejado
 * e os elementos devem ser agrupados conforma o número do agrupamento informado.*/
	public static int[][] criarvetores(int vet[], int quantvetor) {
		int resp[][]=new int[quantvetor][vet.length];
		int aux[];
		int cont=0;
		for(int i=0; i<vet.length; i++) {
			aux=new int[quantvetor];
			
			resp[i]=aux;
			for(int j: aux) {
				aux[j]=vet[cont];
				System.out.println(aux[j]);
				cont++;
			}
			System.out.println("-------");
		}
		return resp;
	}
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int quantidade, tamanho;
		System.out.println("Digite o tamanho do vetor:");
		tamanho=ler.nextInt();
		
		int vetor[]=new int[tamanho];
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento do vetor: ");
			vetor[i]=ler.nextInt();
		}
		
		System.out.println("Digite a quantidade de vetores que deseja gerar:");
		quantidade=ler.nextInt();
		
		criarvetores(vetor, quantidade);
	}

}
