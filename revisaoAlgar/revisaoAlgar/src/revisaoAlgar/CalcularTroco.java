package revisaoAlgar;

import java.util.Scanner;

public class CalcularTroco {

	public static void main(String[] args) {
		System.out.println("Que saudades eu estava de voce");
		Scanner scanner =  new Scanner(System.in);
		Double valorProduto,valor, troco;
		
		
		System.out.print("digite o valor do produto: ");
		 valorProduto = scanner.nextDouble();
		 
		System.out.print("digite o valor passado pelo cliente: "); 
		 valor = scanner.nextDouble();
		 
		 troco = valor - valorProduto;
		 
		System.out.println("O valor do produto é: " + valorProduto );
		System.out.println("Dinheiro passado pelo cliente : " + valor);
		System.out.println("troco :" + troco );
		
		
		scanner.close();
		
	}

}
