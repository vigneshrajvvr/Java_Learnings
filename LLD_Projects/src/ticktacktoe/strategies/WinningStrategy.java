package ticktacktoe.strategies;

import ticktacktoe.models.Board;
import ticktacktoe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Player player, Board board);
}
