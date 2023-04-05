package Game.PrintGame;

public class EndGame
{
    public void deathGoblin()
    {
        System.out.println("Feliz por encontrar um pouco de sorte finalmente, você caminha diretamente até elas.");
        System.out.println("Um...dois...três...cinco passos, aos poucos você vai se aproximando");
        System.out.println("Quando chega até as moedas, você se agacha para guardá-las.");
        System.out.println("Ao se abaixar, você sente uma coisa fria perfurando seu peito, sangue começa a subir até sua boca rapidamente. Olhando para o local, você vê uma faca enficanda a partir das suas costas.");
        System.out.println("Uma pequena risada é ouvida, e você cai no chão, sentindo a frieza de sua própria pele e uma poça vermelha crescendo.");
        System.out.println("Você foi atacado por um goblin e morreu! Fim de jogo!");
    }

    public void rest()
    {
        System.out.println("Cansado de suas aventuras anteriores, e com um ambiente tão convidativo, você decide descansar um pouco.");
        System.out.println("Você se deita na costa de uma árvore, e tenta pegar no sono... lentamente tudo se escurece...");
        System.out.println(".\n.\n.\n.\n");
        System.out.println("De repente, você acorda num susto!");
        System.out.println("Você não consegue mais sentir seu corpo direito, todas as paredes se tornaram pretas com inscrições vermelhas, você não consegue ler absolutamente nada, mas o círculo com símbolos em volta não tem erro... É um ritual.");
        System.out.println("Sem conseguir mexer seu corpo, uma faca é fincada em seu peito, sua respiração começa a fica descompassada, e você sente o sangue saindo de seu corpo.");
        System.out.println("'Mais um sacrifício em nome do nosso Senhor!'");
        System.out.println("Você morreu! Fim de jogo!");
    }

    /* Parte do Lobo */
    public void wolfsDeath()
    {
        System.out.println("Com um desespero imenso, você tenta correr até a próxima porta, porém o lobo morde sua perna no meio do caminho, você vê a poça de sangue se formando antes dele arrancar sua cabeça.....");
        System.out.println("Você morreu! Fim de jogo!");
    }

    /*  */
    public void oneDeath()
    {
        System.out.println("Você tenta lutar contra a cobra com suas mãos nuas, a falta de informação sobre o animal te leva a fazer movimentos imprudentes e você é mordido e envenenado.");
        System.out.println("Aos poucos o veneno começa a fazer efeito e você sente suas forças se esvaindo, você então pode sentir o abraço da morte.");
        System.out.println("Fim de jogo!");
    }

    public void twoDeath()
    {
        System.out.println("Você não consegue ser silencioso o bastante e chama a atenção da cobra.\nSurpreso e em choque ao ver ela se movendo em sua direção, você não consegue reagir rápido o suficiente e é mordido e envenenado até a morte.");
        System.out.println("Você morreu, fim de jogo!");
    }

    public void threeDeath()
    {
        System.out.println("Desajeitado enquanto tenta guardar suas coisas novamente, você não consegue reagir ao ataque e sente uma mordida na sua perna.");
        System.out.println("Assustado, você cai no chão. A cobra continua te atacando e você sente sua vida se esvaindo.....");
        System.out.println("Você morreu! Fim de jogo");
    }

    public void fourDeath()
    {
        System.out.println("Enquanto você se ajoelha para rezar, você ouve a cobra se aproximando, sua respiração comeaça a ficar cada vez mais ofegante, e a cobra realiza um ataque com sucesso, picando seu pescoço e lhe deixando para morrer.");
    }

    /* --------------------- */

    public void riddleError()
    {
        System.out.println("O estranho mecanismo recebe sua resposta e analisa por alguns segundos...");
        System.out.println(".\n.\n.\n.\n.\n.");
        System.out.println("Resposta INCORRETA");
        System.out.println("Então de todas as paredes e do teto, você pode ver lâminas se formando magicamente como espinhos. Você não tem como desviar");
        System.out.println("Sem tempo para reagir, as lâminas são lançadas a uma velocidade absurda em você.");
        System.out.println("Você morreu! Fim de jogo!");
    }

    /* Boss */
    public void runAwayFromTheBoss()
    {
        System.out.println("Temendo a criatura, você tenta sair pela porta onde voltou, o demônio abre ela com magia e você corre, como se não houvesse amanhã...\n");
        System.out.println("Uma, duas, três portas, e então a última porta finalmente se abre...");
        System.out.println("Você volta à sala do demônio, que não parece muito feliz por você ter tentado fugir...");
        System.out.println("Ele voa rapidamente, e em um instante, sua cabeça está no chão...\n");
        System.out.println("\t\t\t\t\t'FRACO'\n");
        System.out.println("\t\t\t\t\tVOCÊ MORREU!\n\t\t\t\t\tFIM DE JOGO!");
    }

    public void postSquidDeath()
    {
        System.out.println("O Demônio olha para você com um ar de superioridade...\n");
        System.out.println("'Você lutou bem, humano, mas sua ingenuidade e arrogância foram maiores que você...''");
        System.out.println("\t\t\t\t\tVOCÊ MORREU!\n\t\t\t\t\tFIM DE JOGO!");
    }
}
