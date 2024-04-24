package estruturarepeticao;
import java.util.Scanner;

public class somaemedia {

	public static void main(String[] args) {
		int soma, media, numero;
		soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			System.out.println("Informe o número: ");
			numero = ler.nextInt();
			
			soma += numero;
		}
		media = soma/5;
		System.out.println("A soma dos números é " + soma + " e a média é " + media);
		ler.close();
	}
}