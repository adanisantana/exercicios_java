package DiaTres;

import java.util.Scanner;

public class ExercicioIdadeWhile {

	public static void main(String[] args) {
		
		
		int idade, menorQue21 = 0, maiorQue50 =0;
		
		while(true) {
			
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite a idade: ");
			idade = leitor.nextInt();
			
			if(idade<21) {
				menorQue21++;
				
			}if(idade>50) {
				maiorQue50++;
			}
			if(idade<0) {
				break;
			}
			
			
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+ menorQue21);
		System.out.println("Total de pessoas com mais de 50 anos: "+ maiorQue50);

	}

}
