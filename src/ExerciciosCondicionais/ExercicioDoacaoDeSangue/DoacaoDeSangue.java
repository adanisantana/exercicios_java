package ExercicioDoacaoDeSangue;
import java.util.Scanner;

public class DoacaoDeSangue {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		String nome;
		int idade;
		String apto;
		
		
		System.out.println("Digite o nome: ");
		nome = leitor.nextLine();
		System.out.println("Digite a idade: ");
		idade = leitor.nextInt();
		System.out.println("Primeira Doação (s - sim / n - não:");
		apto = leitor.next();
		
		switch (idade) {
		case 1:
			if(idade> 60 || idade <69 && apto.equalsIgnoreCase("n")) {
				System.out.println("Apto para doar!");
			}else {
				System.out.println("Não está apto para doar!");
			}
		case 2:
			if(idade<=18) {
				System.out.println("Pode doar");
			}
		}
		
		
		
	}

}
