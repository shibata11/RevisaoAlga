package capitulo04;

import java.util.Scanner;

public class Exercício01Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Integer valor1, valor2, resultado;
		
		System.out.println("valor 1 : ");
		valor1 = entrada.nextInt();
		
		System.out.println("valor 2 : ");
		valor2 = entrada.nextInt();
		
		System.out.println("digite 1 para soma");
		System.out.println("digite 2 para diminuir");
		System.out.println("digite 3 para multiplicar");
		System.out.println("digite 4 para dividir");
		
		int escolha = entrada.nextInt();
		
		resultado =0;
		
		
		
		if(escolha == 1) {
			resultado = valor1+valor2;
			
		}else if(escolha == 2) {
			resultado = valor1-valor2;
			
		}else if(escolha == 3) {
			resultado = valor1*valor2;
			
		}else if(escolha == 4) {
			resultado = valor1%valor2;
			
			if(resultado == 0) {
				 resultado = valor1 / valor2;
				
			}else {
				System.out.println("resto " + resultado);
			}
		}else {
			System.out.println("escolha invalida");
		}
		
		System.out.println(resultado);
		
			
		entrada.close();

	}

}
