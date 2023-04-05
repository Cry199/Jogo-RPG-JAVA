import java.util.Scanner;

import Game.Choices.MainChoice;

public class UI 
{  
    public static void clearScreen() 
    {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void printMatch(Scanner sc)
	{
		System.out.println("RPG Textual!");  
        System.out.println("Você é um explorador desafortunado, que precisa ter algum sucesso em sua próxima aventura para conseguir se manter como um aventureiro. Então você decide explorar um antigo domínio desconhecido a fim de buscar tesouros!");
        System.out.println();
        System.out.println("O jogo é simples, serão dadas algumas situações, e você terá algumas escolhas, digite o *NUMERO* da escolha que quer fazer e veja o resultado! Mas tome cuidado, suas escolhas podem trazer consequências indesejadas!");
        System.out.println();
		
		String play = "";
		do{
			System.out.println("Digite jogar para jogar!");
			play = sc.next();	
		}
		while(! play.equalsIgnoreCase("jogar"));
	}

	public static void startOfTheMatch(MainChoice mainChoice, Scanner sc)
	{
		mainChoice.start(sc);
	}
}
