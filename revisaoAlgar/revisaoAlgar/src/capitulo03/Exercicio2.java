package capitulo03;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome, sobreNome;
		
		System.out.print("digite o nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite o segundo nome");
		sobreNome = scanner.nextLine();

		
		System.out.println("o nome completo é : "+ nome+" "+sobreNome );
		scanner.close();

	}

}
