public class Goal {
    static int goalsScored;
    Team teamScored;
    Player playerScored;
    double timeScored;

    public Goal(Team t, Player p, double time){
        goalsScored++;
        teamScored = t;
        playerScored = p;
        timeScored = time;
    }

    public void printGoal(){
        System.out.println("Goal scored by Team : " + teamScored.name +" Player : "+ playerScored.name + " at minute "+ timeScored);
    }

}