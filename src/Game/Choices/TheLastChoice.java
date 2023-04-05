package Game.Choices;

import java.util.Scanner;

import Game.PrintGame.EndGame;
import Game.PrintGame.GameContinuation;

public class TheLastChoice  extends MainChoice
{
    private int bossLife = 25;
    private int userLife = 15;
    private int damage;
    private int accountantSpeaksOne = 1;
    private int accountantSpeaksTwo = 1;

    private EndGame endGame = new EndGame();
    private GameContinuation gameContinuation = new GameContinuation();

    public TheLastChoice(int knife, int sword, int userResponse)
    {
        super(knife, sword, userResponse);
    }

    public void finalChoice(Scanner sc)
    {
        System.out.println("O corredor para o próximo cômodo te dá calafrios, um tom acinzentado está sempre presente nessa curta jornada, e conforme você se aproxima da próxima porta, tons de vermelho sangue tomam o lugar em todas as paredes...");
        System.out.println("Você abre a próxima porta e encontra uma sala enorme, com diversos crânios espalhados pelo chão, uma ponte de cabeças levando ao centro, onde se pode ver um trono, e alguma coisa está sentada, esperando...\n");
        System.out.println("'Olha só, o humano tem algum potencial... Diga-me, o que busca nesse domínio?'\n");
        System.out.println("Uma criatura completamente vermelha, com asas escuras saindo de suas costas e um par de chifres, questiona sua determinação, independente do que isso seja, você sabe que qualquer decisão não será simples aqui...");
        System.out.println("O que quer fazer?");
        System.out.println("1.Lutar");
        System.out.println("2.Fugir");
        setUserResponse(sc.nextInt());

        clearScreen();

        choice(sc);
    }

    private void choice(Scanner sc)
    {
        if(getUserResponse() == 1)
        {
            System.out.println("'Não é muito de falar, não é mesmo? Mas suas intenções estão claras.'\n");
            System.out.println("A criatura se levanta e se posiciona na sua frente com um olhar hostil");
            
            bossFight(sc);
        }
        else if(getUserResponse() == 2)
        {
           endGame.runAwayFromTheBoss();
        }
    }

    private void bossFight(Scanner sc)
    {
        damageValidator();

        System.out.println("Você inicia uma batalha contra ele, se prepare");

        fight(sc);

        if(userLife > 0)
        {
            gameContinuation.userVictory();
        }
        else if(bossLife > 0)
        {
            endGame.postSquidDeath();
        }
    }

    private void fight(Scanner sc)
    {
        do
        {
            System.out.println();
            System.out.println("Seu HP: " + userLife + "/15");
            System.out.println("Hp Boss: " + bossLife + "/25");
            System.out.println();

            // USER TURNO
            
            System.out.println("O que deseja fazer?");
            System.out.println("1.Atacar");
            System.out.println("2.Defender");
            System.out.println("3.Esquivar");
            setUserResponse(sc.nextInt());

            clearScreen();
            userShift();

            //DEMONIO TURNO

            clearScreen();
            System.out.println("VEZ DO DEMONIO");
            System.out.println("O DEMONIO REALIZA UM ATAQUE");

            bossShift();

            bossTalks();
            clearScreen();
        }
        while(bossLife > 0 && userLife > 0);
    }

    /* User */

    private void userShift()
    {
        if(getUserResponse() == 1)
        {
            userAttackOption();
        }
        else if(getUserResponse() == 2)
        {
            userDefendOption();
        }
        else if(getUserResponse() == 3)
        {
            userDodgeOption();
        }
    }

    private void userAttackOption()
    {
        if(getSword() == 1)
        {
            int attack = (int) ((Math.random() * 4));

            if(attack == 2)
            {
                bossLife -= damage;
                System.out.println("Você acerta! O demonio possui agora "+ bossLife + " de vida\n");
            }
            else
            {
                System.out.println("Voce errou, aguarde a proxima chance\n");
            }
        }
        else if(getKnife() == 1)
        {
            int attack = (int) ((Math.random() * 3));

            if(attack == 2)
            {
                bossLife -= damage;
                System.out.println("Você acerta! O demonio possui agora "+ bossLife + " de vida\n");
            }
            else
            {
                System.out.println("Voce errou, aguarde a proxima chance\n");
            }
        }
        else
        {
            int attack = (int) ((Math.random() * 2));

            if(attack == 0)
            {
                bossLife -= damage;
                System.out.println("Você acerta! O demonio possui agora "+ bossLife + " de vida\n");
            }
            else
            {
                System.out.println("Voce errou, aguarde a proxima chance\n");
            }
        }
    }

    private void userDefendOption()
    {
        System.out.println("Voce se posiciona para uma defesa ao ataque do inimigo!\n");
    }

    private void userDodgeOption()
    {
        System.out.println("Voce resolve esperar o ataque do oponente e realizar uma esquiva!\n");
    }

    private void damageValidator()
    {
        if(getSword() == 1)
        {
            this.damage = 3;
        }
        else if(getKnife() == 1)
        {
            this.damage = 2;
        }
        else
        {
            this.damage = 1;
        }
    }
    /* ---------- */

    /* Demonio */

    private void bossShift()
    {
        if(getUserResponse() == 1)
        {
            bossAttackOption();  
        }
        else if(getUserResponse() == 2 && getSword() != 1)
        {
            bossDefendOptionOne();
        }
        else if(getUserResponse() == 2 && getSword() == 1)
        {
            bossDefendOptionTwo();
        }
        else if(getUserResponse() == 3)
        {
            bossDodgeOption();
        }
    }

    private void bossAttackOption()
    {
        int attack = (int) ((Math.random() * 3));

        if(attack == 0)
        {
            System.out.println("O DEMONIO REALIZA O ATAQUE COM SUCESSO\n");
            userLife -= 2;
            System.out.println("Você perde 2 de HP!\n");
        }
        else 
        {
            System.out.println("O DEMONIO ERROU O ATAQUE DELE, VOCE TEM NOVAMENTE SUA CHANCE");
        }
    }

    private void bossDefendOptionOne()
    {
        int attack = (int) ((Math.random() * 3));

        if(attack == 0)
        {
            System.out.println("O DEMÔNIO ACERTA!\nMas você já esperava por isso e recebe 1 de dano!\n");
            userLife -= 1;
        }
        else
        {
            System.out.println("O demônio erra!");
        }
    }

    private void bossDefendOptionTwo()
    {
        int attack = (int) ((Math.random() * 2));

        if(attack == 1)
        {
            System.out.println("Você defende o golpe e contra ataca com um corte limpo!\n");
            System.out.println("Ele recebe 2 de dano!");
            bossLife -= 2;
        }
        else
        {
            System.out.println("O DEMONIO ERROU O ATAQUE DELE, VOCE TEM NOVAMENTE SUA CHANCE");
        }
    }

    private void bossDodgeOption()
    {
        int attack = (int) (Math.random() * 5);

        if(attack == 4)
        {
            System.out.println("Mesmo com seu preparo, ELE ACERTA! Como estava preparando para desviar e não defender, você recebe 3 de dano!");
            userLife -= 3;
        }
        else
        {
            System.out.println("Ele tenta te acertar, mas você esquiva com sucesso!");
        }
    }

    /* ---------- */

    /* Demonio Falas */

    public void bossTalks()
    {
        if(getSword() == 1 && bossLife == 16 || getKnife() == 1&& bossLife == 15 || getKnife() != 1 && getSword() !=1 && bossLife == 15)
        {
            do
            {
                System.out.println("\n'Você realmente tem potencial! ME ENTRETENHA MAIS!'\n");
                accountantSpeaksOne = 0;
            }
            while(accountantSpeaksOne == 1);
        }
        if(getSword() == 1 && bossLife == 7 || getKnife() == 1 && bossLife == 8 || getKnife() != 1 && getSword() !=1 && bossLife == 10)
        {
            do
            {
                System.out.println("\n'AINDA NÃO TERMINAMOS AQUI!'\n");
                accountantSpeaksTwo = 0;
            } 
            while(accountantSpeaksTwo == 1);
        }
    }
    
    /* ---------- */

    private void clearScreen() 
    {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
