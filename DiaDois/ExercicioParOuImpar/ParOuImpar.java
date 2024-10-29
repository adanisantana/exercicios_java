package ExercicioParOuImpar;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite o valor: ");
		valor = leitor.nextInt();
		
		
		if(valor % 2 == 0) {
			System.out.println("Par");
			if(valor > 0) {
				System.out.println("Positivo");
			}
			else {
				System.out.println("Negativo");
			}
		}
		if(valor % 2 != 0) {
			System.out.println("Ímpar");
			if(valor > 0) {
				System.out.println("Positivo");
			}
			else {
				System.out.println("Negativo");
			}
		}
		
		leitor.close();
		

	}

}
