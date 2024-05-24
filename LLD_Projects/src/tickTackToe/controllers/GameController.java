package tickTackToe.controllers;

import tickTackToe.models.Game;
import tickTackToe.models.GameState;
import tickTackToe.models.Player;
import tickTackToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {


    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ) {
        // Validations - Implemented using Builder design pattern - Validate attributes before creation of the Game object
        // 1. No.of players
        // 2. Every player should have a diff symbol
        // 3. There should be only 1 bot in the game
//        return new Game(dimension, players, winningStrategies);
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void displayBoard(Game game) {

    }

    public void makeMove(Game game) {

    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return null;
    }

    public void undo(Game game) {

    }
}

// Client -> Game Controller -> Service

// 1. Start the game: taking the size, creating the board
// 2. While the game state in IN_PROGRESS
    // 2.1 Display the board
    // 2.2 Make the move
// 3. Based on the game state return the result
    // DRAW
    // WINNER
// 4. Undo
