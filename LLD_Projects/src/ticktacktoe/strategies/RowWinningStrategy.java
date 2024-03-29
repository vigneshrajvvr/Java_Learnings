package ticktacktoe.strategies;

import ticktacktoe.models.Board;
import ticktacktoe.models.Player;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {
        return false;
    }
}
