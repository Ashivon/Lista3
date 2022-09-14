import java.util.Scanner;
public class Questao13 {
/*Descritografia. Sua função deverá descriptografar os caracteres do vetor
de strings segundo a lista apresentada na questão anterior.*/
	public static char desimbolizar(char l) {
		if (l == '%')
			return 'a';
		if (l == '*')
			return 'b';
		if (l == '(')
			return 'c';
		if (l == '-')
			return 'd';
		if (l == '+')
			return 'e';
		if (l == '@')
			return 'f';
		if (l == '#')
			return 'g';
		if (l == '1')
			return 'h';
		if (l == '2')
			return 'i';
		if (l == '3')
			return 'j';
		if (l == '4')
			return 'l';
		if (l == '5')
			return 'm';
		if (l == '6')
			return 'n';
		if (l == '7')
			return 'o';
		if (l == '8')
			return 'p';
		if (l == '9')
			return 'q';
		if (l == '{')
			return 'r';
		if (l == '}')
			return 's';
		if (l == '!')
			return 't';
		if (l == '&')
			return 'u';
		if (l == '$')
			return 'v';
		if (l == '?')
			return 'x';
		if (l == ':')
			return 'z';
		return 'o';
	}
	
	public static String[] descriptografar(String[] palavras) {
		String[] descriptografia = new String[palavras.length];
		char[][] palavra = new char[palavras.length][100];
		for (int i = 0; i < palavras.length; i++) {
			descriptografia[i] = "";
			for (int j = 0; j < palavras[i].length(); j++) {
				palavra[i][j] = desimbolizar(palavras[i].charAt(j));
				descriptografia[i] += palavra[i][j];
			}
		}
		return descriptografia;
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
			letras[i] = descriptografar(letras)[i];
			System.out.println(letras[i]);
		}
	}
}
