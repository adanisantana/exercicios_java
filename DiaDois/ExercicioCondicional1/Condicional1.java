package ExercicioCondicional1;
import java.util.Scanner;


public class Condicional1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de a: ");
		a = leitor.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leitor.nextInt();
		System.out.println("Digite o valor de c: ");
		c = leitor.nextInt();
		
		if (a + b > c) {
			System.out.println("A soma de a + b =  "+ a + b +"é maior que C");
		}
		if (a + b < c) {
			System.out.println(" A soma de a + b = " + a + b + "que é menor que C");
			
		}
		else {
			System.out.println("A soma de a + b é igual a c " );
		}
		
		leitor.close();
	}

}
