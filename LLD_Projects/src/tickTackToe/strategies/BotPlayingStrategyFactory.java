package tickTackToe.strategies;

import tickTackToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        }

        return null;
    }
}
