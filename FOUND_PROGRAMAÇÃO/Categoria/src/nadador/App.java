package nadador;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(leia.nextLine());
		
		if( idade < 5) {
		 System.out.println("Nenhuma Categoria");
		}else if(idade >= 8 && idade <= 10) {
			System.out.println("juvenil");
		}else if(idade >= 11 && idade <=15 ) {
			System.out.println("adolescente");
		}else if(idade >= 16 && idade <=30) {
			System.out.println("adulto");
		}else if(idade > 30){
			System.out.println("sênio");
		}

	

		
		
	 }
	}

