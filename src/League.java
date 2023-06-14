import java.util.ArrayList;
import java.util.List;

public class League {
    private String name;
    private int number_of_teams;
    public static final List<Team> teams = new ArrayList<>();

    public League(String name){
        this.name = name;
    }

    public League(String name, int number_of_teams) {
        this.name = name;
        this.number_of_teams = number_of_teams;
    }

    public String getLeagueName() {
        return name;
    }

    public void setLeagueName(String name) {
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
        return name + " - Number of teams : " + number_of_teams;
    }

    public void league_info() {
        System.out.println(name + " - Number of teams : " + number_of_teams + " (" + teams + ")");
    }
}
