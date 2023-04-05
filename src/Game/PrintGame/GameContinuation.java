package Game.PrintGame;

public class GameContinuation 
{
    public void goblinExit()
    {
        System.out.println("Estranhando a situação, você decide sair da sala, perto da porta é possível ouvir um som de passos rápidos.");
        System.out.println("Aproveitando que já estava perto da porta, você sai da sala.");
    } 

    public void choiceOfSword(int sword)
    {
        if(sword != 1)
        {
        System.out.println("Você tenta tirar a espada, fascinado pela beleza dela, e com um pouco de esforço você consegue removê-la do chão.\n");
        System.out.println("Você adquiriu: Espada leve\n"); 
        System.out.println("Sentindo confiante com sua lâmina, você segue para a próxima sala.");
        }
        else
        {
        System.out.println("Com receio do que essas escrituras possam ser, você decide recuar e não tocar na espada.");
        System.out.println("Você saiu da sala.");
        }  
    }

    public void exploreOasis()
    {
        System.out.println("Você decide explorar a sala, e com um pouco de esforço consegue achar uma porta camuflada no meio de folhas e árvores, e decide sair da sala.");  
    }

    /* Parte do Lobo */
    public void wolfWithTheSword(int userResponse)
    {
        if(userResponse == 1)
        {
            System.out.println("Sabendo de suas capacidades e temendo que ele não desista até que você morra, você decide matá-lo.");
            System.out.println("O lobo ataca ferozmente, você defende a mordida com sua espada e num movimento rápido, corta a cabeça do animal.");
        }
        else if(userResponse == 2)
        {
            System.out.println("Não sabendo nada sobre o animal, porém confiante de que pode vencer, você decide apenas deixá-lo inconsciente.");
            System.out.println("O lobo ataca, você defende a mordida com sua espada e aproveita o movimento para jogá-lo em direção à parede com força.");
            System.out.println("O baque é forte, e após alguns segundos, você percebe que ele não está mais se movimentando, ainda assim sua respiração está estável.");
        }

        System.out.println("Você derrotou lobo faminto!");
    }

    public void wolfDeathWithKnife()
    {
        System.out.println("Você decide abrir sua mochila e tira um punhado de roupas e sua faca, enrolando as roupas em seu braço pensando em amortecer um possível dano.\n");
        System.out.println("Você equipou: Defesa improvisada e faca!\n");
        System.out.println("O lobo então avança novamente, buscando atacar seu pescoço, você então defende com seu braço 'fortificado', aguentando um bom dano.");
        System.out.println("Aproveitando que o lobo estava preso mordendo suas roupas, você esfaqueia o lobo com a mão livre, jorrando sangue na sala.");
        System.out.println("Ele afrouxa a mordida, e você o acerta novamente, logo você percebe que ele não é mais um problema.");
        System.out.println("Você derrotou Lobo faminto!");
    }

    public void courageInTheWolf(int userResponse)
    {
        System.out.println();

        if(userResponse == 1)
        {
            System.out.println("Você então usa toda sua força em um golpe certeiro na cabeça do animal, diversas vezes, ele até tenta se defender e te arranhar, mas estava enfraquecido devido à fome, e você consegue finalizá-lo.");
        }
        else if(userResponse == 2)
        {
            System.out.println("Aproveitando da exaustão e fraqueza do animal, você facilmente consegue nocauteá-lo sem sofrer danos.");
        }

        System.out.println("Você venceu!");
    }

    /* --------------  */

    public void deathOrMercyOfTheSorceress(int userResponse)
    {
        if(userResponse == 1)
        {
            System.out.println("Com um corte limpo, você mata a feiticeira.\n");
        }
        else if(userResponse == 2)
        {
            System.out.println("Vendo o rosto aterrorizado da mulher, você decide não matar ela, e sai em direção à próxima sala.\n");
        }

        System.out.println("Você venceu!\n");
    }

    public void riddleHit()
    {
        System.out.println("O estranho mecanismo recebe sua resposta e analisa por alguns segundos...");
        System.out.println(".\n.\n.\n.\n.\n.");
        System.out.println("Resposta CORRETA");
        System.out.println("A tela pisca em verde e você pode ver uma das paredes descendo lentamente, revelando uma nova passagem.");
        System.out.println("Você passou da sala do enigma!");
    }


    /*  */
    public void userVictory()
    {
        System.out.println("Você finaliza o demônio, tirando sua vida... Analisando melhor a sala, você encontra no fundo dela há uma outra passagem.");
        System.out.println("Você entra, e encontra a sala de tesouros do Demônio, riquezas das mais diversas, armaduras de ouro, espadas de prata, utensílios de prata, barras de ouro, entre outros diversas jóias e pertences valiosos...\n");
        System.out.println("Feliz com sua conquista, você pega o máximo de tesouros possíveis e volta para casa...");
        System.out.println("\t\t\t\t\tVOCÊ VENCEU!\n\t\t\t\t OBRIGADO POR JOGAR!");
    }
}
