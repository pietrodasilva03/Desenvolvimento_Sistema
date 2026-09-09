package tiangulo;
import java.util.Scanner;
public class App {
	
	
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base , altura , area;


	do {
	    System.out.println("Digite o valor da base:");
	    base = Double.parseDouble(leia.nextLine());
	    
	    System.out.println("Digite o valor da altura:");
	    altura = Double.parseDouble(leia.nextLine());
	    
	    area = (base * altura)/2;
	    System.out.println("Área: " + area);
	    
	} while (base <= 0 || altura <= 0);
	}
}

  
