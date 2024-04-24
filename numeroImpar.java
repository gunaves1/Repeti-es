package estruturarepeticao;

import java.util.Scanner;

public class numeroImpar {

	public static void main(String[] args) {
	int inicio, fim;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Insira o início do intervalo: ");
	inicio = ler.nextInt();
	
	System.out.println("Insira o fim do intervalo: ");
	fim = ler.nextInt();
	
	for(int i = inicio; i <=fim; i++) {
		if (i%2 == 0) {	
		}
		else {
			System.out.println(i + " é impar");
		}
	}
	ler.close();
	}

}
