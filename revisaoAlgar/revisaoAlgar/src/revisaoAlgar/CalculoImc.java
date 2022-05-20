package revisaoAlgar;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Float peso, altura, imc, alturaQuadrado;
		
		System.out.print("digite sua altura: ");
	    altura = scanner.nextFloat();	
	    
	    System.out.print("digite seu peso: ");
	    peso = scanner.nextFloat();
	    
	    alturaQuadrado = altura*altura;
	    
	    imc = peso/( alturaQuadrado);
	    
	    System.out.println("o indice de massa corporal é :" + imc);
		
		scanner.close();
	}

}
