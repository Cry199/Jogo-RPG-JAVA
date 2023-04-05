package Game.Rooms;

import java.util.Scanner;

public class Rooms 
{
    public int screenForFirstRoom(Scanner sc, int roomChoices)
    {
        if(roomChoices == 1)
        {
        System.out.println("Você entra em uma sala escura... À sua frente é possível ouvir um 'SSSSSsssss' com um breve som de chocalhos. Logo você reconhece que se trata de uma cobra");
        System.out.println("O que deseja fazer?");
        System.out.println("1.Lutar");
        System.out.println("2.Correr");
        System.out.println("3.Abrir mochila");
        System.out.println("4.Rezar");
        }
        else if(roomChoices == 2)
        {
        System.out.println("O centro da sala está bem iluminado, com tamanho destaque no centro, o resto da sala está um completo breu, é possível ver um pequeno punhado de moedas de ouro.");
        System.out.println("O que deseja fazer?");
        System.out.println("1.Pegar as moedas");
        System.out.println("2.Analisar os arredores");
        System.out.println("3.Sair da sala");
        }
        else if(roomChoices == 3)
        {
        System.out.println("Ao entrar na sala você analisa seus arredores, um ambiente quadrado com paredes claras, um pouco sujas devidas ao tempo, porém muito bonitas ainda assim, o chão se mistura em um quadriculado preto e branco, e ao centro você vê uma espada fincada no chão.");
        System.out.println("O que deseja fazer?");
        System.out.println("1.Se aproximar");
        System.out.println("2.Analisar melhor os arredores");
        System.out.println("3.Sair da sala");
        }

        return sc.nextInt();
    }
    
    public int screenForSecondRoom(Scanner sc, int roomChoices)
    {  
        if(roomChoices == 1)
        {
            System.out.println("Ao entrar no novo cômodo, você logo repara na falta de cor do ambiente, as paredes e chão emanam energias negativas.");
            System.out.println("Você escuta a porta atrás de você se trancando, logo em seguida você consegue escutar um rosnado furioso vindo do centro.");
            System.out.println("Um lobo faminto está barrando seu caminho.");
            System.out.println("O que deseja fazer?");
            System.out.println("1.Atacar");
            System.out.println("2.Defender");
            System.out.println("3.Abrir Mochila");
        }
        else if(roomChoices == 2)
        {
          System.out.println("Ao entrar no novo cômodo, ele se assemelha a um óasis, tem diversas árvores com frutos chamativos e suculentos, um pequeno riacho cristalino, e uma sensação de paz toma conta do seu corpo.");
          System.out.println("O que você faz?");
          System.out.println("1.Descansar");
          System.out.println("2.Sair da sala");
          System.out.println("3.Explorar");
        }

        return sc.nextInt();
    }

    public String riddleScreen(Scanner sc, int roomChoices)
    {
        System.out.println("Ao entrar no novo cômodo, o ambiente está mais sereno, você não vê inimigos, no centro é possível ver algo como uma tela de computador com uma mensagem:");

        if(roomChoices == 1)
        {
            System.out.println("Você se depara com um pequeno enigma:");
            System.out.println("Eu posso ser o Sol, eu posso ser areia, eu posso ser um pássaro, o que eu sou?");
            System.out.println("Insira sua resposta:");
        }
        else if(roomChoices == 2)
        {
            System.out.println("Você se depara com um pequeno enigma:");
            System.out.println("Eu posso ser um Deus, um planeta, e medir o calor. O que eu sou?");
            System.out.println("Insira sua resposta:");
        }
        else if(roomChoices == 3)
        {
            System.out.println("Você se depara com um pequeno enigma:");
            System.out.println("Eu tenho lagos sem água, montanhas sem pedra e cidades sem prédios. O que eu sou?");
            System.out.println("Insira sua resposta:");
        }
        return sc.next();
    }
}
