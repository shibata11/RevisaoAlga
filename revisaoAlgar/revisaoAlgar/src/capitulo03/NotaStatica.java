package capitulo03;

import java.util.Scanner;

public class NotaStatica {
	
	
	//trabalhando com constantes
    static final double	NOTA_MINIMA_PARA_PASSAR = 7;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1,n2,n3, soma, media;
		
		System.out.println("Digite a nota1");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a nota2");
		n2 = entrada.nextDouble();
		
		System.out.println("Digite a nota3");
		n3 = entrada.nextDouble();
		
		soma = n1 + n2 + n3;
		media = soma/3;
		
		if(media >= NOTA_MINIMA_PARA_PASSAR) {
			System.out.println("aluno aprovado com media: "+ media);
		}else {	
			System.out.println("aluno reprovado "+ media);
		}
		
		
		
           entrada.close();
	}

}
