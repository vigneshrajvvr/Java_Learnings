package tickTackToe.strategies;

import tickTackToe.models.Board;
import tickTackToe.models.Player;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {
        return false;
    }
}
