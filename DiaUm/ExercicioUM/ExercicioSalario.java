package ExercicioUM;
import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {

		    Scanner leitor = new Scanner(System.in);
		 
		    System.out.println("Digite o salário: ");
		    float salario = leitor.nextFloat();
		    
		    System.out.println("Digite o abono: ");
		    float abono = leitor.nextFloat();
		    
		    float novoSalario = salario + abono;
		    		
		    System.out.println(novoSalario);
		    
		  

	}

}
