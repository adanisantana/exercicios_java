package ExercicioTres;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o salario bruto: ");
		float salarioBruto = leitor.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		float adicionalNoturno = leitor.nextFloat();
		System.out.println("Digite as horas extras: ");
		float horasExtras = leitor.nextFloat();
		System.out.println("Digite os descontos: ");
		float descontos = leitor.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.println(salarioLiquido);
	}

}
