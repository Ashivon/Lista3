import java.util.Scanner;
public class Questao11 {
/*Descompactação: Sua função deverá receber um vetor e gerar um vetor
descompactado. O número de repetições devem ser colocadas no novo vetor
conforme o número indicado.*/
	public static String[] descompactacao(String vet[]) {
		int soma=0, valor=0, quantidade=0;
		String descompactado="", posicao="";
		
		int vetordevalores[]=new int[vet.length];
		int vetordequantidade[]=new int[vet.length];
		String[] vetordescompactado=new String[vet.length];
		
		for (int i = 0; i < vet.length; i+=2) {
			posicao = vet[i];
			for(int j=0; j<=vet[i]; j++) {
				soma+=1;
				if(soma%10==0) {
					valor+=1;
				}
			}
			vetordevalores[i]=valor;
			valor=0;
		}
		
		for (int i = 1; i < vet.length; i+=2) {
			posicao = vet[i];
			for(int j=0; j<=posicao; j++) {
				soma+=1;
				if(soma<10) {
					quantidade+=1;
				}
			}
			vetordequantidade[i]=quantidade;
			quantidade=0;
		}
		
		for(int i=0; i<vet.length; i++) {
			for(int j=0; j<vetordequantidade[i]; j++) {
				descompactado=vetordevalores[i]+" ";
			}
			vetordescompactado[i]=descompactado;
			descompactado="";
		}
		for(String i : vetordescompactado) {
			System.out.print(i+",");
		}
		return vetordescompactado;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanho;
		
		System.out.println("Digite o vetor:");
		tamanho=ler.nextInt();
		
		String vetor[]=new String [tamanho];
		for(int i=0; i<tamanho; 
				i++) {
			System.out.println("digite um elemento para ser descompactado:");
			vetor[i]=ler.next();
		}
		descompactacao(vetor);
	}

}
