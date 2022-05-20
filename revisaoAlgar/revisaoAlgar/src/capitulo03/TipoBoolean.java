package capitulo03;

public class TipoBoolean {

	public static void main(String[] args) {
		Boolean variavelVerdade = true; 
		System.out.println("variavel verdadeira " + variavelVerdade);
		
		Boolean variavelFalsa = false; 
		System.out.println("variavel falsa " + variavelFalsa);
		
		System.out.println("------------------------------------------");
		
		int idade =15;
		
		boolean podeTirarCarteira = idade >=18;
		
		if(podeTirarCarteira) {
			System.out.println("pode sim");
		}else {
			System.out.println("não pode");
		}
		
		
	}

}
