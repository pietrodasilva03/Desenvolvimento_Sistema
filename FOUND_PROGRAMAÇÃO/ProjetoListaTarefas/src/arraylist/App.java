package arraylist;


import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 ArrayList<String> nomes = new ArrayList<>();
		 Scanner leia = new Scanner(System.in);
		 String continuar; 
		 String tipo;
		 
		 do {
			 System.out.println("Digite o tipo de tarefa:");
			 String tarefa = leia.nextLine();
			 nomes.add(tarefa);
			 
			 System.out.println("Deseja cadastra outra tarefa: S/N");
			 continuar = leia.nextLine();		 	 
			 
		 }while(continuar.equalsIgnoreCase("s"));
		 
		 System.out.println("Tarefas cadastradas :" );
		 		for(String tarefas : nomes ) {
		 		System.out.println(tarefas);
		 	}
	}

}
