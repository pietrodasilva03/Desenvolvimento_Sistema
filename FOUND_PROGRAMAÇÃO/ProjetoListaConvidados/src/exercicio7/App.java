package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		ArrayList<String>convidados = new ArrayList();
		Scanner leia = new Scanner(System.in);
		int opcao = 4;
		
		swith(opcao){
			
		case 1 :
			
			System.out.println("Digite seu nome:");
			String nome = leia.nextLine();
			convidados.add(nome);
		}
		
		
		

	}

}
