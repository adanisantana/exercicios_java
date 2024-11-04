package ExercicioPilha;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
	
		while(true) {
		
			System.out.println("****** MENU *******");
			System.out.println("1. Adicionar um novo livro");
			System.out.println("2. Listar todos os livros");
			System.out.println("3. Retirar um livro");
			System.out.println("0. Sair");
	
			System.out.println("\nDigite uma opção: ");
			int respostaUsuario = leia.nextInt();
			
			switch(respostaUsuario) {
				case 0:
					System.out.println("Encerrando o programa.");
					leia.close();
					break;
				case 1:
					System.out.println("Digite o título do livro para adicionar: ");
					leia.nextLine(); // Consumir a nova linha após nextInt()
	                String livro = leia.nextLine();;
					System.out.println("Livro adicionado!" +""+ pilha.push(livro));
					break;
				case 2:
					System.out.println("Lista de todos os livros: " +"\n"+ pilha);
					break;
				case 3:
					if(!pilha.isEmpty()) {
						System.out.println("Retirar livro");
						pilha.pop();
						System.out.println("Lista atualizada: " +"\n"+ pilha);}
					else {
						System.out.println("Lista Vazia");
					}
					break;				
					
			}
		
		}	

	}

}
