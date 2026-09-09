package desconto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int meses = 0;
		double investimentoCarlos = 3000.0 , investimentoJoao;
		double rendimentoCarlos = 0.02 , rendimentoJoao = 0.05;
		
		  System.out.println(investimentoJoao = investimentoCarlos /3);

		
		do {
		 
		  investimentoCarlos += investimentoCarlos * rendimentoCarlos;
		  investimentoJoao += investimentoJoao * rendimentoJoao;
		  
		  
		  meses++;
		
		
		 }while(investimentoCarlos >  investimentoJoao );
			System.out.println("A quantidade de meses necessários: " + meses);
			System.out.println("O valor acumulado por Carlos: " + investimentoCarlos );
			System.out.println("O valor acumulado por João : " + investimentoJoao );
		
		}
	}

