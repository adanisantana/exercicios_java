package ExercicioFila;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class ExercicioFila {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Queue<String> filaDeClientes = new LinkedList<String>();
		
		while(true) {
			System.out.println("****** MENU *******");
			System.out.println("1. Adicionar cliente na Fila");
			System.out.println("2. Listar todos os clientes");
			System.out.println("3. Retirar cliente na fila");
			System.out.println("0. Sair");
		
			System.out.println("\nDigite uma opção: ");
			int respostaUsuario = leitor.nextInt();
		
			switch(respostaUsuario) {
				case 0:
					System.out.println("Fila encerrada");
					leitor.close();
					break;
					
				case 1:
					System.out.println("Digite seu nome:");
					String cliente = leitor.next();
					filaDeClientes.add(cliente);
					System.out.println("Cliente adicionado!");
					break;
					
				case 2:
					System.out.println("Lista de clientes na fila: "+ filaDeClientes);
					break;
					
				case 3:
					filaDeClientes.poll();
					break;
		
				
		}
		}	
	}
	
}
