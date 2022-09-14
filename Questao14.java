import java.util.Scanner;
public class Questao14 {
/*Contagem de caracteres: Sua função deverá contar os caracteres que
aparecem no vetor. Os caracteres podem ser qualquer letra ou número do
alfabeto.*/
	public static boolean verificacaodecaracter(char vet[], char vet2[],int n) {
		int cont=0;
		for (int i=0; i<vet.length; i++) {
				if (vet[n]==vet2[i]) {
					cont++;
				}
		}
		if (cont>=1)
			return false;
		else
			return true;
	}
	
	public static boolean buscarcaractere(char vet[], int i, char l) {
		if (vet[i] == l)
			return true;
		else
			return false;
	}
	
	public static String numerodecaracteres(char[] vet) {
		int cont=0;
		String quantidadedecaracteres="";
		char vet2[]=new char[vet.length];
		for (int i=0; i<vet.length; i++) {
			for (int j=0; j<vet.length; j++) {
				if (buscarcaractere(vet, j, vet[i])) {
					cont++;
				}
			}

			if (verificacaodecaracter(vet, vet2, i)) {
				quantidadedecaracteres+=vet[i]+"="+cont+" ";
			}
			
			cont=0;
			vet2[i]=vet[i];
		}
		return quantidadedecaracteres;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tamanho vetor de caracteres: ");
		int tamanho=ler.nextInt();
		char vetor[] = new char[tamanho];
		ler.nextLine();
		for (int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"º caractere: ");
			vetor[i]=ler.nextLine().charAt(0);
		}
		System.out.println(numerodecaracteres(vetor));
	}
}
