import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class League {

    public static void main(String[] args) {

        System.out.println("League Started  ! ");
        Team home = new Team("LIVERPOOL");
        Team away = new Team("REAL MADRID");

        home.playerList.add(new Player("Karius") );
        home.playerList.add(new Player("Virgil") );
        home.playerList.add(new Player("Lovren") );
        home.playerList.add(new Player("Mane") );
        home.playerList.add(new Player("Firmino") );
        home.playerList.add(new Player("Salah") );

        away.playerList.add(new Player("Navas") );
        away.playerList.add(new Player("Ramos") );
        away.playerList.add(new Player("Varane") );
        away.playerList.add(new Player("Modric") );
        away.playerList.add(new Player("Ronaldo") );
        away.playerList.add(new Player("Bale") );

        home.teamPlayers();
        away.teamPlayers();

        Random nr = new Random();
        Random rmPlayer = new Random();

        List<Goal> gList = new ArrayList<>();
        for (int i =0; i < nr.nextInt(10) ; i++) {
            if (nr.nextInt(2) % 2 < 1 ) gList.add(new Goal(home, home.playerList.get( rmPlayer.nextInt(5)+1 ), nr.nextInt(90)));
            else gList.add(new Goal(away, away.playerList.get( rmPlayer.nextInt(5)+1 ), nr.nextInt(90)));
        }

        new Game(home, away, gList);

        System.out.println("This is game nr :" + Game.gamesPlayed);

        int homeCount = 0;
        int awayCount = 0;
        for (Goal g: gList) {
            g.printGoal();
            if (g.teamScored == home) homeCount++;
            else awayCount++;

        }

        System.out.println("Final Score: LIVERPOOL "+ homeCount + " : " + awayCount + " REAL MADRID " );

    }
}