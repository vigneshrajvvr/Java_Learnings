package tickTackToe.strategies;

import tickTackToe.models.Board;
import tickTackToe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Player player, Board board);
}
