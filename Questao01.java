import java.util.Scanner;
public class Questao01 {
/*Pesquisa: Sua função deverá receber um vetor e retornar se um dado
elemento está dentro do vetor informado. Caso o elemento esteja no vetor
retornar a posição do elemento no vetor, caso não esteja retornar -100;*/
	
	public static int procurar(int vet[], int numero,int i) {
		if(vet[i]==numero) {
			System.out.println("Valor encontrado na posição:");
			return i+1;
		}
		if(i>vet.length)
			return -100;
		i++;
		return procurar(vet, numero, i);
	}
	
	public static void main(String[] args) {
		Scanner armazenar = new Scanner(System.in);
		int tamanhoVetor, elementoProcurado;
		System.out.println("Digite o tamanho do vetor:");
		tamanhoVetor=armazenar.nextInt();
		
		int vet[] = new int[tamanhoVetor];
		for(int contador=0; contador<tamanhoVetor; contador++) {
			System.out.println("Digite o "+(contador+1)+"° elemento:");
			vet[contador]=armazenar.nextInt();
		}
		
		System.out.println("Qual elemento deseja procurar?");
		elementoProcurado=armazenar.nextInt();
		
		System.out.println(procurar(vet, elementoProcurado,0));
	}

}
