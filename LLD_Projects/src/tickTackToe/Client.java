package tickTackToe;

import tickTackToe.controllers.GameController;
import tickTackToe.models.Game;
import tickTackToe.models.GameState;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Game is starting!");

        Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());

        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }

        if(gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.println("The game ends in a DRAW!");
        } else if(gameController.checkState(game).equals(GameState.SUCCESS)) {
            System.out.println("The winner is : " + gameController.getWinner(game));
        }
    }
}
