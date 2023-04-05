package Game.Choices;

import java.util.Random;
import java.util.Scanner;

import Game.Rooms.Rooms;

public class MainChoice
{
    private int knife;
    private int sword;
    private int snakeRoom;
    private int roomChoices;
    private int userResponse;
    private boolean continuationOfTheGame;
    private int randomEnemies;
    private String riddleAnswer;

    private Random gerador = new Random();
    private Rooms room = new Rooms();

    /* Main */
    public MainChoice(){}

    /* First Randomness */
    protected MainChoice(int knife, int sword, int snakeRoom, int roomChoices, int userResponse, boolean continuationOfTheGame)
    {
        this.knife = knife;
        this.sword = sword;
        this.snakeRoom = snakeRoom;
        this.roomChoices = roomChoices;
        this.userResponse = userResponse;
        this.continuationOfTheGame = continuationOfTheGame;
    }

    /* Second Randomness */
    protected MainChoice(int knife, int sword, int snakeRoom, int userResponse, boolean continuationOfTheGame, int randomEnemies)
    {
        this.knife = knife;
        this.sword = sword;
        this.snakeRoom = snakeRoom;
        this.userResponse = userResponse;
        this.continuationOfTheGame = continuationOfTheGame;
        this.randomEnemies = randomEnemies;
    }

    /* Riddle Randomness */
    protected MainChoice(String riddleAnswer, int userResponse, int roomChoices, boolean continuationOfTheGame)
    {
        this.riddleAnswer = riddleAnswer;
        this.userResponse = userResponse;
        this.roomChoices = roomChoices;
        this.continuationOfTheGame = continuationOfTheGame;
    }

    /* The Last Choice */
    protected MainChoice(int knife, int sword, int userResponse)
    {
        this.knife = knife;
        this.sword = sword;
        this.userResponse = userResponse;
    }

    protected void setKnife(int knife)
    {
        this.knife = knife;
    }

    protected int getKnife()
    {
        return knife;
    }

    protected void setSword(int sword)
    {
        this.sword = sword;
    }

    protected int getSword()
    {
        return sword;
    }

    protected void setSnakeRoom(int snakeRoom)
    {
        this.snakeRoom = snakeRoom;
    }

    protected int getSnakeRoom()
    {
        return snakeRoom;
    }

    protected int getRoomChoices()
    {
        return roomChoices;
    }

    protected void setRiddleAnswer(String riddleAnswer)
    {
        this.riddleAnswer = riddleAnswer;
    }

    protected String getRiddleAnswer()
    {
        return riddleAnswer;
    }

    protected void setUserResponse(int userResponse)
    {
        this.userResponse = userResponse;
    }

    protected int getUserResponse()
    {
        return userResponse;
    }

    protected int getRandomEnemies()
    {
        return randomEnemies;
    }

    protected void setContinuationOfTheGame(boolean continuationOfTheGame)
    {
        this.continuationOfTheGame = continuationOfTheGame;
    }

    protected boolean getContinuationOfTheGame()
    {
        return continuationOfTheGame;
    }

    public void start(Scanner sc)
    {   
        randomNumberForRooms(); // Numero Aleatorio para escolha de sala

        this.userResponse = room.screenForFirstRoom(sc, roomChoices); // Primeira Sala 

        FirstRandomness firstRandomness = new FirstRandomness(knife, sword, snakeRoom, roomChoices, userResponse, continuationOfTheGame);
        firstRandomness.randomness(sc);

        System.out.println();

        if(getContinuationOfTheGame() == false)
        {
            randomNumberForEnemies(); // Numero Aleatorio para escolha de sala

            this.userResponse = room.screenForSecondRoom(sc, randomEnemies); // Segunda Sala 

            SecondRandomness secondRandomness = new SecondRandomness(knife, sword, snakeRoom, userResponse, continuationOfTheGame, randomEnemies);
            secondRandomness.randomness(sc);
        }

        System.out.println();

        if(getContinuationOfTheGame() == false)
        {
            randomNumberForEnemies(); 

            this.riddleAnswer = room.riddleScreen(sc, roomChoices); 

            RiddleOfRandomness riddleOfRandomness = new RiddleOfRandomness(riddleAnswer, userResponse, roomChoices, continuationOfTheGame);
            riddleOfRandomness.validateRiddleHit();
        }

        System.out.println();

        if(continuationOfTheGame == false)
        {
            TheLastChoice theLastChoice = new TheLastChoice(knife, sword, userResponse);
            theLastChoice.finalChoice(sc);
        }
    }   

    private void randomNumberForRooms()
    {
        roomChoices = gerador.nextInt(3) + 1;
    }

    private void randomNumberForEnemies()
    {
        randomEnemies = gerador.nextInt(2) + 1;
    }
}
