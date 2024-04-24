package estruturarepeticao;

import java.util.Scanner;

public class mediasalarial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarios = 0, funcionarios, media;

		System.out.println("Qual a quantidade de funcionários?");
		funcionarios = ler.nextInt();

		for(int i=1; i <= funcionarios; i++) {
			System.out.println("Informe o salário dos funcionários: ");
			salarios += ler.nextDouble();
			
		}

		media = salarios/funcionarios;

		System.out.println("A média salarial da empresa é de " + media);

		ler.close();
	}

}
