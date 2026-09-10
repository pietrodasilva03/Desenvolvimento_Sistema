package exercicio5;

import java.util.Scanner;

public class ParesEImpares {
		
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
					
		int[]num = new int [4];
		int contPar = 0 , contImpar = 0 ;
		
		
		for(int i = 0; i < num.length ; i++) {
			System.out.print("Número :" );
			num[i] = leia.nextInt();
		
			if(num[i] % 2== 0 ) {
				contPar++;
				System.out.println("Par "  );
			}else {
				System.out.println("Impar");
				contImpar++;
			}
		
		  }
		
		System.out.println("Quantidade de pares:" + contPar);
		System.out.println("Quantidade de impares:" + contImpar);
		
			}
		}


