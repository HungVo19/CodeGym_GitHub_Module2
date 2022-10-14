package Refactoring_4;

public class TennisGame {
    private String player1Name;
    private String player2Name;
    private static int player1Score;
    private static int player2Score;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return determineDrawResult(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return determineAdvantageOrWinResult(player1Score, player2Score);
        } else {
            String score = "";
            return determineTempScore(player1Score, player2Score, score);
        }
    }

    private static String determineTempScore(int player1Score, int player2Score, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String determineAdvantageOrWinResult(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return  "Win for player2";
        }
    }

    private static String determineDrawResult(int player1Score) {
        switch (player1Score) {
            case 0:
                return "Love-All";
            case 1:
                return  "Fifteen-All";
            case 2:
                return  "Thirty-All";
            case 3:
                return  "Forty-All";
            default:
               return  "Deuce";
        }
    }
}