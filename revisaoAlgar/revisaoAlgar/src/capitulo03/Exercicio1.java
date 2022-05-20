package capitulo03;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, quadrado;
		
		System.out.println("Digite um numero : ");
		num1 = scanner.nextInt();
		
		quadrado = num1*num1;
		
		System.out.println("o resulta o " + num1 + " numero elevado a 2 ");
				
		System.out.println(quadrado);
		
		scanner.close();

	}

}
