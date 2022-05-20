package capitulo03;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valorProduto, quantidade, subtotal,desconto, total;
		
		System.out.print("digite a quantidade: ");
		quantidade = scanner.nextDouble();
		
		System.out.print("digite a Preco: ");
		valorProduto = scanner.nextDouble();
          subtotal = valorProduto * quantidade;
		
		System.out.println(subtotal);
		desconto=0;
		
		if(quantidade > 10) {
			desconto = subtotal * 0.10;
		}else {
			System.out.println("não tem desconto");
		}
		
		total = subtotal - desconto; 
		System.out.println("o valor total é: " + total );
		
		scanner.close();

	}
}
