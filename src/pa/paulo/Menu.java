package pa.paulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static int menuOp() {
		Scanner input = new Scanner(System.in);
		int opcao=0;  
		System.out.println("1 - Opcao 1");
		System.out.println("2 - Opcao 2");
		System.out.println("3 - Opcao 3");
		System.out.println("4 - Opcao 4");
		System.out.println("5 - Opcao 5");   
		System.out.println("0 - Sair");
		do {
			if(opcao<0 || opcao>5)
				System.out.println("Opção incorreta!");
			System.out.print("Opcao [0..5]: ");
			try {
				opcao = input.nextInt();	    		
			} catch (InputMismatchException e) {
				opcao = -1;
				input.next();
			}
		} while(opcao<0 || opcao>5);
		return opcao;
	}
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = Menu.menuOp();
			switch (opcao) {
			case 0: // Opcao 0 - Sair
				System.out.println("Opcao 0 - Sair");
				break;
			case 1: // Opcao 1
				System.out.println("Opcao 1!");
				break;
			case 2: // Opcao 2
				System.out.println("Opcao 2!");
				break;
			case 3: // Opcao 3
				System.out.println("Opcao 3!");
				break;
			case 4: // Opcao 4
				System.out.println("Opcao 4!");
				break;
			case 5: // Opcao 5
				System.out.println("Opcao 5!");
				break;
			default:
				// The user input an unexpected choice.
				System.out.println("Opcao Errada!");
			}
		}while(opcao!=0);
	}
}
