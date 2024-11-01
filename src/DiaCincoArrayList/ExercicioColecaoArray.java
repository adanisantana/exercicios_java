package DiaCincoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioColecaoArray {

	public static void main(String[] args) {
		// Criar uma array que lista cores
		ArrayList<String> cores = new ArrayList<String>();
		String cor;

		Scanner leitor = new Scanner(System.in);
		// Solicitar ao usuario que digite 5 cores
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite " + (i + 1) + "/5 cores: ");
			cor = leitor.nextLine();
			cores.add(cor);
		}

		System.out.println("\nCores adicionadas:");
		for (String c : cores) {
			System.out.println(c);
		}

		Collections.sort(cores);
		System.out.println("\nCores Ordenadas");
		for (String cc : cores) {
			System.out.println(cc);
		}

		leitor.close();

	}

}
