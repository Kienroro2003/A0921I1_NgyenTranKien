package ss8_clear_code_and_refactoring.bai_tap;

import static ss8_clear_code_and_refactoring.bai_tap.Function.*;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore = 0;
        boolean EQUAL = m_score1 == m_score2;
        if (EQUAL) score = getString(m_score1);
        else if (m_score1 >= 4 || m_score2 >= 4) {
            score = getString(player1Name, player2Name, m_score1, m_score2);
        } else {
            for (int i = 1; i < 3; i++) {
                score = getString(m_score1, m_score2, score, i);
            }
        }
        return score;
    }

}