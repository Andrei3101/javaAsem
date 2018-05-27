import java.util.ArrayList;
import java.util.List;

public class Game {

    static int gamesPlayed;

    Team homeTeam;
    Team awayTeam;
    List <Goal> goalScored = new ArrayList<>();

    public Game(Team home, Team away, List <Goal> g){

        gamesPlayed++;
        homeTeam = home;
        awayTeam = away;

    }

}
