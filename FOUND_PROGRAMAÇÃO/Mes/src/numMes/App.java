package numMes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int n1 , n2 ;

		int opcao = 4;
		Scanner leia = new Scanner(System.in);
		
		 System.out.println("Digite primeiro o número:");
		 opcao = Integer.parseInt(leia.nextLine());
		 
		  System.out.println("Digite segundo o número:");
		  opcao = Integer.parseInt(leia.nextLine());
		 
	switch(opcao){

	
		case 1:
			 (n1 + n2)/2;
			System.out.println(""); break;
		
		case 2:
			System.out.println("Fervereiro"); break;
		
		case 3:
			System.out.println("Março"); break;
			
		case 4:
			System.out.println("Abril"); break;
			

	}
		if(opcao <= 0 ) System.out.println("Opção invalida.");
 }

}

