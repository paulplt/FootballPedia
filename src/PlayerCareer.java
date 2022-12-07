public class PlayerCareer {
    //private FootballPlayer player;
    private Team team;
    private Integer from_year;
    private Integer to_year;
    private Integer apps;
    private Integer goals;

    public PlayerCareer(Team team, Integer from_year, Integer to_year, Integer apps, Integer goals) {
        this.team = team;
        this.from_year = from_year;
        this.to_year = to_year;
        this.apps = apps;
        this.goals = goals;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getFrom_year() {
        return this.from_year;
    }

    public void setFrom_year(Integer from_year) {
        this.from_year = from_year;
    }

    public Integer getTo_year() {
        return this.to_year;
    }

    public void setTo_year(Integer to_year) {
        this.to_year = to_year;
    }

    public Integer getApps() {
        return this.apps;
    }

    public void setApps(Integer apps) {
        this.apps = apps;
    }

    public Integer getGoals() {
        return this.goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "Team: " + team.getName() +
                "     Joined: " + getFrom_year() +
                "     Left: " + getTo_year() +
                "     Appearances: " + getApps() +
                "      Goals: " + getGoals() + "\n";
    }
}
