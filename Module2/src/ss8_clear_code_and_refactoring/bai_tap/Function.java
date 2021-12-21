package ss8_clear_code_and_refactoring.bai_tap;

public class Function {
    static String getString(int m_score1) {
        String score;
        switch (m_score1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    static String getString(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score;
        int minusResult = m_score1 - m_score2;
        boolean firstCondition = minusResult == 1;
        if (firstCondition) {
            String result = "Advantage " + player1Name;
            score = result;
        } else {
            boolean secondCondition = minusResult == -1;
            if (secondCondition) {
                String result = "Advantage " + player2Name;
                score = result;
            } else {
                boolean thirdCondition = minusResult >= 2;
                if (thirdCondition) {
                    String result = "Win for " + player1Name;
                    score = result;
                } else {
                    String result = "Win for " + player2Name;
                    score = result;
                }
            }
        }
        return score;
    }

    static String getString(int m_score1, int m_score2, String score, int i) {
        int tempScore;
        boolean isTrue = i == 1;
        if (isTrue) tempScore = m_score1;
        else {
            score += "-";
            tempScore = m_score2;
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
        return score;
    }
}
