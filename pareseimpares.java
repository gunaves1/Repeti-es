package estruturarepeticao;

import java.util.Scanner;

public class pareseimpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero = 0, somai = 0, somap = 0;

		for(int i=1; i<=10; i++) {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();

			if (numero %2 == 0) {
				somap ++;
			}
			else {
				somai ++;
			}
			System.out.println("A quantidade de números pares é " + somap);
			System.out.println("A quantidade de números impares é " + somai);
		}
		ler.close();
	}
}
