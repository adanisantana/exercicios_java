package DiaTres;
import java.util.Scanner;


public class ExercicioNumerosMultiplos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador;
		int primeiroNumero, ultimoNumero;
		
		System.out.println("Digite o primeiro número: ");
		primeiroNumero = leitor.nextInt();
		
		System.out.println("Digite o último número: ");
		ultimoNumero = leitor.nextInt();
		
		if(primeiroNumero<ultimoNumero) {
			for(int i = primeiroNumero; i < ultimoNumero; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i +"  "+ "é múltiplo de 3 e 5");
				}
			}
		}

	}

	
	

}
