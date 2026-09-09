package operacoes;

import java.util.Scanner;

	public class App {
		public static void main(String[] args) {
		     Scanner leia = new Scanner(System.in);
	  int n1, n2;        
	 	
	 	System.out.println("Digite a opção desejada :");
	 	int opcao = Integer.parseInt(leia.nextLine());
		        
	 		if (opcao <= 0) {
		System.out.println("Opção inválida.");
	 		} else {
		
		
	 		System.out.println("Digite o primeiro número:");
	 		n1 = Integer.parseInt(leia.nextLine());
		            
	 		System.out.println("Digite o segundo número:");
	 		n2 = Integer.parseInt(leia.nextLine());
		
		
		            
	 switch (opcao) {
	 		case 1:
	 			int media = (n1 + n2) / 2;
	 				System.out.println("Média: " + media);
	 				break;
	 				
	 		case 2: 
	 			if (n1 < n2)
	 				System.out.println( "Resultado :"  + (n2 - n1));
	 			else
	 				System.out.println("Subtração incorreta.");
	 			
	 		case 3:
	 			System.out.println("Multiplicação : " + (n1 * n2));
	 			
	 		case 4 :
	 			if(n2 != 0 );
	 			System.out.println("Divisão: " +  (n1 /n2));
		  
	 		default:
	 			System.out.println("Opção não cadastrada no switch.");
	 			break;
	 			 
		  	
	 			}
		   }
	 	leia.close();
		   }
		}

	

	



