package Tennis;

public class TennisGame1 implements TennisGame {

    private int puntosJugador1 = 0;
    private int puntosJugador2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            puntosJugador1 += 1;
        else
            puntosJugador2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (puntosJugador1 == puntosJugador2)
        {
            score = getString();
        }
        else if (puntosJugador1 >=4 || puntosJugador2 >=4)
        {
            int minusResult = puntosJugador1 - puntosJugador2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = puntosJugador1;
                else { score+="-"; tempScore = puntosJugador2;}
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

    private String getString() {
        String score;
        switch (puntosJugador1)
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
        return score;
    }
}