package estruturarepeticao;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		int numero, fatorial = 1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe qual número será fatorado: ");
		numero = ler.nextInt();
		
		for(int i = numero; i>=1; i--) {
			fatorial *= i;
		}
		System.out.println("O número fatorado é igual a " + fatorial);
		ler.close();
	}
}
