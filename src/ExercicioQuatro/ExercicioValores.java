package ExercicioQuatro;
import java.util.Scanner;

public class ExercicioValores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		float n1 = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		float n2 = leitor.nextInt();
		System.out.println("Digite o terceiro numero: ");
		float n3 = leitor.nextInt();
		System.out.println("Digite o quarto numero: ");
		float n4 = leitor.nextInt();
		
		float produto = (n1 * n2) - (n3 * n4);
		System.out.println(produto);
		
		
		

	}

}
