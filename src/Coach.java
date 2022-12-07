import java.time.LocalDate;
public class Coach extends Person{
    private Team current_team;

    public Coach(String name, Country country, LocalDate dob, Team current_team) {
        super(name, country, dob);
        this.current_team = current_team;
    }

    public Team getCurrent_team() {
        return current_team;
    }

    public void setCurrent_team(Team current_team) {
        this.current_team = current_team;
    }

    @Override
    public String toString() {
        return "Coach \n" + super.toString() +
                "Current Team: " + current_team.getName() + '\n'+
                "----------------------------------";
    }
}
