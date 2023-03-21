import java.util.ArrayList;

public class League {
    private String name;
    private int number_of_teams;
    private final ArrayList<Team> teams = new ArrayList<>();

    public League(String name, int number_of_teams) {
        this.name = name;
        this.number_of_teams = number_of_teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_teams() {
        return number_of_teams;
    }

    public void setNumber_of_teams(int number_of_teams) {
        this.number_of_teams = number_of_teams;
    }

    public void addTeamInLeague(Team team){
        teams.add(team);
    }

    @Override
    public String toString() {
        return name + " - Teams : " + teams; 
    }
}
