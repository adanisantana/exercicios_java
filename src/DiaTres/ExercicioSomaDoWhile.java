package DiaTres;
import java.util.Scanner;

public class ExercicioSomaDoWhile {
	public static void main(String[] args) {
		int numero, soma = 0;
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leitor.nextInt();
			soma += numero;
		}while(numero != 0);
		
		System.out.println("A soma de todos os números é "+ soma);
	}
	

}
