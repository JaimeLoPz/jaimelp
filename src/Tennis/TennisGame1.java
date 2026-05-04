package Tennis;

public class TennisGame1 implements TennisGame {

    private int marcador_j1 = 0;
    private int marcador_j2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            marcador_j1 += 1;
        else
            marcador_j2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (marcador_j1 == marcador_j2)
        {
            switch (marcador_j1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (marcador_j1 >=4 || marcador_j2 >=4)
        {
            int minusResult = marcador_j1 - marcador_j2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = marcador_j1;
                else { score+="-"; tempScore = marcador_j2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}