package Game.Choices;

import java.util.Random;
import java.util.Scanner;

import Game.PrintGame.EndGame;
import Game.PrintGame.GameContinuation;

class SecondRandomness extends MainChoice
{ 
  private int wolfAttackChance;
  
  private Random gerador = new Random();
  private EndGame endGame = new EndGame();
  private GameContinuation gameContinuation = new GameContinuation();

  public SecondRandomness(int knife, int sword, int snakeRoom, int userResponse, boolean continuationOfTheGame, int randomEnemies)
  {
    super(knife, sword, snakeRoom, userResponse, continuationOfTheGame, randomEnemies);
  }
  
  protected void randomness(Scanner sc)
  {
      if(super.getRandomEnemies() == 1)
      {
        firstChoice(sc);
      }
      else if(super.getRandomEnemies() == 2)
      {
        secondChoice(sc);
      }
  }

  private void firstChoice(Scanner sc)
  {
    if(getUserResponse() == 1)
    {
      if(super.getSword() == 1)
      {
        System.out.println("Você prepara sua arma e parte para cima do lobo, apesar de não ser mais rápido, sua lâmina consegue cortar uma parte do tronco do animal.");
        System.out.println("Ainda mais raivoso do que antes, ele parte pra cima novamente, tentando morder seu rosto.");
        System.out.println("O que quer fazer?");
        System.out.println("1.Matar o Lobo");
        System.out.println("2.Nocautear o Lobo");
        setUserResponse(sc.nextInt());
        
        clearScreen();

        gameContinuation.wolfWithTheSword(getUserResponse());
      }
      else
      {
        System.out.println("Surpreso, porém não acuado pelo ser lupino você decide partir para cima primeiro, o lobo não recua, e faz um avanço rápido, tentando morder seu braço.");
        System.out.println("Você consegue desviar por pouco, porém percebe que não vai conseguir ganhar apenas na força bruta.");
        wolfsChoice(sc);

        clearScreen();

        battleWithTheWolf(sc);
      }
    }
    else if(getUserResponse() == 2)
    {
      System.out.println("Você espera o Ataque, o lobo faminto vem em sua direção, mirando sua perna, você percebe as intenções dele e consegue se jogar para fora do ataque, se levantando logo em seguida e mantendo o preparo.");
      wolfsChoice(sc);

      clearScreen();

      battleWithTheWolf(sc);
    }
    else if(getUserResponse() == 3)
    {
      setUserResponse(2);

      clearScreen();

      battleWithTheWolf(sc);
    }
  }

  private void secondChoice(Scanner sc)
  {
    clearScreen();

    if(getUserResponse() == 1)
    {
      endGame.rest();
      setContinuationOfTheGame(true);
    }
    else if(getUserResponse() == 2)
    {
      System.out.println("Focado em seu objetivo, você tenta sair da sala, mas não acha nenhuma porta ou saída aparente como na sala anterior.");
      System.out.println("Você caminha por horas, porém sem muitos resultados.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Descansar");
      System.out.println("2.Continuar procurando");
      setUserResponse(sc.nextInt());

      clearScreen();

      if(getUserResponse() == 1)
      {
        setContinuationOfTheGame(true);
        endGame.rest();
      }
      else if(getUserResponse() == 2)
      {
        gameContinuation.exploreOasis();
      }
    }
    else if(getUserResponse() == 3)
    {
      System.out.println("Explorando mais a fundo o lugar, você percebe algumas coisas... A sala é muito maior do que a outra que você já passou, o sol está radiante, mesmo que o lugar seja fechado, e você tem a sensação que tudo aquilo é apenas sua mente lhe pregando peças...");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Tentar entender mais do lugar");
      System.out.println("2.Tentar sair para a próxima sala");
      setUserResponse(sc.nextInt());

      exploreOasis(sc);
    }
  }

  /* Parte do Lobo First Choice */
  private void wolfAttackChance()
  {
    wolfAttackChance = gerador.nextInt(4) + 1;
  }

  private void wolfsChoice(Scanner sc)
  {
    System.out.println("O que quer fazer?");
    System.out.println("1.Esperar e contra-atacar");
    System.out.println("2.Abrir Mochila");
    System.out.println("3.Tentar fugir");
    setUserResponse(sc.nextInt());

    System.out.println();
  }

  private void battleWithTheWolf(Scanner sc)
  {
    wolfAttackChance();

    if(getUserResponse() == 1)
    {
      System.out.println("Você se prepara, e o lobo avança novamente, buscando rasgar seu pescoço, porém, já sabendo seu curso de ação, você consegue se esquivar e se posicionar em cima do lobo, usando seu peso para mantê-lo no chão.");
      System.out.println("Com ele preso, você decide:");
      System.out.println("1.Matar o lobo");
      System.out.println("2.Nocautear o lobo");
      setUserResponse(sc.nextInt());

      gameContinuation.courageInTheWolf(getUserResponse());      
    }
    else if(getUserResponse() == 2)
    {
      gameContinuation.wolfDeathWithKnife();
      setKnife(1);
    }
    else if(getUserResponse() == 3)
    {
      if(wolfAttackChance == 3)
      {
        System.out.println("Com um desespero imenso, você corre até a próxima porta, e consegue fugir.");
      }
      else
      {
        setContinuationOfTheGame(true);
        endGame.wolfsDeath();
      }
    } 
  }
  /*------------- */
  
  /* Parte exploração */
  private void exploreOasis(Scanner sc)
  {
    clearScreen();

    if(getUserResponse() == 1)
    {
      System.out.println("Você se senta para organizar seus pensamentos, nada está fazendo sentido, uma casa não poderia ter um óasis assim, o lugar é como se fosse uma ilusão...");
      System.out.println("Enquanto você está pensando, você escuta algo se aproximando... Olhando melhor, é uma Mulher");
      System.out.println("Seu rosto está completamente sujo, seus olhos sem vida e é possível notar diversas manchas de sangue nas roupas, mãos e rosto dela.");
      System.out.println("Ela nota que você está a observando e entra em choque, Você nota a ilusão se distorcendo um pouco.");
      System.out.println("O que quer fazer?");
      System.out.println("1.Derrotar a Ilusionista");
      System.out.println("2.Sair da Ilusão");
      setUserResponse(sc.nextInt());

      clearScreen();

      battleWithIllusionist(sc);
    }
    else if(getUserResponse() == 2)
    {
      gameContinuation.exploreOasis();
    }
  }

  private void battleWithIllusionist(Scanner sc)
  {
    if(getUserResponse() == 1)
    {
      if(getSword() == 1)
      {
        System.out.println("Com sua espada em mãos você decide lutar contra a feiticeira, ela não parece forte, porém você não sabe os truques que ela guarda");
        System.out.println("Enquanto ela corre, você a persegue com facilidade e acerta um corte em sua perna, derrubando-a e saindo da ilusão, a porta está logo à sua frente.");
        System.out.println("O que fazer?");
        System.out.println("1.Finalizar ela");
        System.out.println("2.Sair da sala");
        setUserResponse(sc.nextInt());

        clearScreen();

        gameContinuation.deathOrMercyOfTheSorceress(getUserResponse());
      }
      else
      {
        System.out.println("Você pega a faca que estava em sua mochila e atira na ilusionista, derrubando-a no chão.");
        System.out.println("O que fazer?");
        System.out.println("1.Finalizar ela");
        System.out.println("2.Sair da sala");
        setUserResponse(sc.nextInt());

        clearScreen();

        gameContinuation.deathOrMercyOfTheSorceress(getUserResponse());
      }
    }
    else if(getUserResponse() == 2)
    {
      clearScreen();
      gameContinuation.exploreOasis();
    }
  } 
  /*------------- */

  private void clearScreen() 
  {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
