package Game.Choices;

import Game.PrintGame.EndGame;
import Game.PrintGame.GameContinuation;

public class RiddleOfRandomness extends MainChoice 
{
    EndGame endGame = new EndGame();
    GameContinuation gameContinuation = new GameContinuation();
    
    public RiddleOfRandomness(String riddleAnswer,int userResponse, int roomChoices, boolean continuationOfTheGame)
    {
        super(riddleAnswer, userResponse, roomChoices, continuationOfTheGame);
    }

    public void validateRiddleHit()
    {
        clearScreen();

        if(validateRiddle() == true)
        {
            gameContinuation.riddleHit();
            setUserResponse(1);
        }
        else
        {
            setContinuationOfTheGame(true);
            endGame.riddleError();
        } 
    }

    private boolean validateRiddle()
    {
        return getRoomChoices() == 1 && getRiddleAnswer().equalsIgnoreCase("Relogio") 
        ||getRoomChoices() == 2 && getRiddleAnswer().equalsIgnoreCase("Mercurio")
        ||getRoomChoices() == 3 && getRiddleAnswer().equalsIgnoreCase("Mapa");
    }

    private void clearScreen() 
    {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
