package ticktacktoe.models;

import ticktacktoe.strategies.BotPlayingStrategy;
import ticktacktoe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    private BotPlayingStrategy botPlayingStrategy;

    public Bot(int id, String name, PlayerType playerType, Symbol playerSymbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, playerType, playerSymbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
