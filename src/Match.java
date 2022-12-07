import java.util.Random;
public class Match {
    private Team home;
    private Team away;
    Random r = new Random();
    public static int homePoints = 0;
    public static int awayPoints = 0;

    public Match(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public void match(Team home, Team away){
        int homeGoals = r.nextInt(5);
        int awayGoals = r.nextInt(5);
        System.out.print(home.getName() + " - " + away.getName() + "   ");
        System.out.print(homeGoals + " - " + awayGoals + '\n'+ "------------------------" + '\n');

        if (homeGoals > awayGoals)
            homePoints += 3;
        else if (homeGoals < awayGoals)
            awayPoints += 3;
        else {
            homePoints++;
            awayPoints++;
        }
    }

    public void table(){
        System.out.println("League Table");
        if (homePoints > awayPoints) {
            System.out.println("1. " + home.getName() + " " + homePoints);
            System.out.println("2. " + away.getName() + " " + awayPoints);
        }
        else if (homePoints < awayPoints){
            System.out.println("1. " + away.getName() + " " + awayPoints);
            System.out.println("2. " + home.getName() + " " + homePoints);
        }
        else{
            System.out.println("1. " + away.getName() + " " +awayPoints);
            System.out.println("2. " + home.getName() + " " +homePoints);
        }
        System.out.println("------------------------");
    }
}