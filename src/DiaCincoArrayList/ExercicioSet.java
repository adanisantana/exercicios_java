package DiaCincoArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class ExercicioSet {

	public static void main(String[] args) {

		// Criar uma coleção que não se repete
		Set<Integer> setInteiros = new HashSet<Integer>();
		int numero;

		Scanner leitor = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

			System.out.println("Digite o " + (i + 1) + "º número: ");
			numero = leitor.nextInt();
			setInteiros.add(numero);
		}

		for (Integer n : setInteiros) {
			System.out.println(n);
		}

		leitor.close();

	}

}
