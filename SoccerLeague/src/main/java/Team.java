import java.util.ArrayList;
import java.util.List;

public class Team {
    String name;
    List<Player> playerList = new ArrayList<>();

    public Team(String s) {
        name = s;
    }


    void teamPlayers() {
        System.out.print(name + " : ");
        for (Player p :playerList ) {
            System.out.print(p.name + ", ");
        }
        System.out.println();
    }
}
