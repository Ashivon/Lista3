import java.util.Scanner;
public class Questao12 {
/*Criptografia: Sua função deverá criptografar os caracteres do vetor de
strings segundo a lista abaixo. Desta forma todas as palavras no vetor deverão
ser criptografadas.*/
	public static char simbolizar(char l) {
		if (l == 'a')
			return '%';
		if (l == 'b')
			return '*';
		if (l == 'c')
			return '(';
		if (l == 'd')
			return '-';
		if (l == 'e')
			return '+';
		if (l == 'f')
			return '@';
		if (l == 'g')
			return '#';
		if (l == 'h')
			return '1';
		if (l == 'i')
			return '2';
		if (l == 'j')
			return '3';
		if (l == 'l')
			return '4';
		if (l == 'm')
			return '5';
		if (l == 'n')
			return '6';
		if (l == 'o')
			return '7';
		if (l == 'p')
			return '8';
		if (l == 'q')
			return '9';
		if (l == 'r')
			return '{';
		if (l == 's')
			return '}';
		if (l == 't')
			return '!';
		if (l == 'u')
			return '&';
		if (l == 'v')
			return '$';
		if (l == 'x')
			return '?';
		if (l == 'z')
			return ':';
		return 'o';
	}

	public static String[] criptografia(String[] palavras) {
		String[] criptografia = new String[palavras.length];
		char[][] palavra = new char[palavras.length][100];
		for (int i = 0; i < palavra.length; i++) {
			criptografia[i] = "";
			for (int j = 0; j < palavras[i].length(); j++) {
				palavra[i][j] = simbolizar(palavras[i].charAt(j));
				criptografia[i] += palavra[i][j];
			}
		}
		return criptografia;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a quantidade de palavras: ");
		int quantidade = ler.nextInt();
	
		String[] letras = new String[quantidade];
		ler.nextLine();
		
		for (int i=0; i<quantidade; i++) {
			System.out.println("Digite a "+(i+1)+"° Palavra: ");
			letras[i] = ler.nextLine();
		}
		for (int i = 0; i < quantidade; i++) {
			letras[i] = criptografia(letras)[i];
			System.out.println(letras[i]);
		}
	}
}