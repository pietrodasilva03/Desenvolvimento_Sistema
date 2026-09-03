package compa;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = Integer.parseInt(leia.nextLine());
		
	if(numero == 20 ) {
		System.out.println("Número igual");
	}else {
		System.out.println("Número diferente");
	}
	}

}
