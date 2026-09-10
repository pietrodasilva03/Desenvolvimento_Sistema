
package nota;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		double[]notas = new double [4];
	
		
	
	for(int i = 0; i < notas.length ; i++) {
		System.out.println("Digite a " + (i + 1)  + "ª nota:");
		notas[i] = leia.nextDouble();
		
		soma+= notas[i];
		
	}
	 for(int i = 0 ; i < notas.length ; i++) {
		 System.out.println("Notas Cadastrada :" + notas[i]);	 
		 
	 }
	  
	 
	 double media = soma / notas.length;
	 
	 System.out.println("\n Média: " + media);

	}
}
