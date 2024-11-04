package ExercicioDois;
import java.util.Scanner;

public class ExercicioNotas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite as notas: ");
		float nota1 = leitor.nextFloat();
		float nota2 = leitor.nextFloat();
		float nota3 = leitor.nextFloat();
		float nota4 = leitor.nextFloat();
		
		float soma = nota1+ nota2 + nota3 + nota4;
		float media = soma/4;
		
		System.out.println(media);

	}

}
