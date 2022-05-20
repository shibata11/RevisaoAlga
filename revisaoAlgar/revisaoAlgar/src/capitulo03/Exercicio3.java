package capitulo03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1,n2,n3, soma, media;
		
		System.out.println("digite a nota 1");
		n1 = scanner.nextDouble();
		
		System.out.println("digite a nota 2");
		n2 = scanner.nextDouble();
		
		System.out.println("digite a nota 3");
		n3 = scanner.nextDouble();
		
		soma = n1+n2+n3;
		media = soma/3;
		
		if(media >= 7) {
		   System.out.println("aluno aprovado " + media);
		}else if(media >=6){
			System.out.println("aluno esta de recuperação " + media);
		}else {
			System.out.println("Aluno reprovado " + media);
		}
		
		
		
		
		
		scanner.close();
	}

}
