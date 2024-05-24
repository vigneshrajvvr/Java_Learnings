package tickTackToe.models;

import tickTackToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public static class Builder {
        int dimension;
        List<Player> players;
        List<WinningStrategy> winningStrategies;

        Builder() {
            this.dimension = 3;
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        void validateBotCount() {
            int botCount = 0;
            for(int i = 0; i < players.size(); i++) {
                if(players.get(i).getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }
            if(botCount > 1) {
                throw new RuntimeException("Too many Bots!");
            }
        }

        void validateNoOfPlayers() {
            if(players.size() != this.dimension - 1) {
                throw new RuntimeException("No of players are invalid!");
            }
        }

        void validateSymbols() {
            HashSet<Character> symbolCheck = new HashSet<>();
            for(int i = 0; i < players.size(); i++) {
                if(!symbolCheck.add(players.get(i).getPlayerSymbol().getSymbol())) {
                    throw new RuntimeException("Two players have same symbol");
                }
            }
        }

        void validate() {
            // Bot count
            validateBotCount();

            // No. of players
            validateNoOfPlayers();

            // Symbols
            validateSymbols();
        }

        public Game build() {
            // Validations
            validate();
            return new Game(this.dimension, this.players, this.winningStrategies);
        }
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
