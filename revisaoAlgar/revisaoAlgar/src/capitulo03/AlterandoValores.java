package capitulo03;

import java.util.Scanner;

public class AlterandoValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valo do produto: ");
		double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo de pagamento: ");
		int tipoPagamento = scanner.nextInt();
		
		double juros = 0.0;
		if (tipoPagamento == 1) {
			System.out.println("sem juros");
		}else {
			juros = 0.10;
			
			System.out.println("valor com juros de 10% "+
			(valorProduto+(valorProduto * juros)));
		}
		
		
		
		scanner.close();

	}

}
