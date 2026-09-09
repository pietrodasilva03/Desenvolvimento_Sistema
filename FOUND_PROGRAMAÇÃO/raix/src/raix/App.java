
package raix;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
			     Scanner leia = new Scanner(System.in);
		  int n1;        
		 	
		 	System.out.println("Digite a opção desejada :");
		 	int opcao = Integer.parseInt(leia.nextLine());
			        
		 		if (opcao <= 0) {
		System.out.println("Opção inválida.");
		 		} else {
	
		 		System.out.println("Digite o valor do número:");
		 		n1 = Integer.parseInt(leia.nextLine());
			           
		 		
		 switch (opcao) {
		 		case 1:
		 			int valorDigitado =  n1;
		 				System.out.println("O valor digitado:" + (n1));
		 				break;
		 				
		 		case 2: 
		 			 int quadrado = n1*n1;
		 				System.out.println( "Número ao quadrado :"  + (n1*n1));

		 			
		 		case 3:
		 			int cubo = n1*n1*n1;
		 			System.out.println("Número ao cubo: " + (n1*n1*n1));
		 			
		 		case 4:
		 		    double raiz = Math.sqrt(n1);
		 		    System.out.println("Raiz: " + raiz);
		 		    break;

			  
		 		default:
		 			System.out.println("Opção não cadastrada no switch.");
		 			break;
		 			 
			  	
		 			}
			   }
		 	leia.close();
	}
}
