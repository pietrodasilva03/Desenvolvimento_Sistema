package analise;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double []temperatura = new double [7];
		double maiorTemperatura , menorTemperatura;
		
		for(int i = 0 ; i < temperatura.length ; i++) {
			System.out.println(" Tempratura :" + temperatura[i]);
			temperatura[i] = leia.nextDouble();	
			
		}
		
		
			maiorTemperatura = temperatura[0];
			menorTemperatura= temperatura[0];	
			
			for(int i = 1 ; i < temperatura.length ; i++) {
				
			if (temperatura[i] > maiorTemperatura) {
				maiorTemperatura = temperatura[i];
			}
			if (temperatura[i] < menorTemperatura) {
				menorTemperatura = temperatura[i];
				
			}
		
		}
			System.out.println("Menor  temperatura:" +menorTemperatura);
			System.out.println("Maior  temperatura:" +maiorTemperatura);
	}
}

	  
	
