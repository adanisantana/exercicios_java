import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		//Construir vetor , ele não pode ser ordenado e nem repetido
		int vetorInteiros [] = {2,5,1,3,4,9,7,8,10,6};
		
		
		//Algoritmo de exibição
			System.out.println("Digite o número que você deseja encontrar: ");
			Scanner leitor = new Scanner(System.in);
			int numero = leitor.nextInt();
			
			for(int indice = 0;indice<9;indice++) {
				if(numero == vetorInteiros[indice]) {
					System.out.println("O número "+vetorInteiros[indice]+" está na posição "+indice);
					break;
			}
				else {
					System.out.println("O número não foi encontrado. ");
				}
							
					
				}
	
			
			
			
		
			}
		
		
	

}

