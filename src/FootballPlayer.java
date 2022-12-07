import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballPlayer extends Person{
    private Team current_team;
    private List<String> positions = new ArrayList<String>();
    private ArrayList<PlayerCareer> player_career = new ArrayList<PlayerCareer>();

    public FootballPlayer(String name, Country country, LocalDate dob, Team current_team) {
        super(name, country, dob);
        this.current_team = current_team;
    }

    public Team getCurrent_team() {
        return this.current_team;
    }

    public void setCurrent_team(Team current_team) {
        this.current_team = current_team;
    }

    public void addPosition(String position){
        positions.add(position);
    }

    public void playerHistory(PlayerCareer pc){
        player_career.add(pc);
    }

    public void printPlayerHistory(){
        System.out.println("Player: " + getName());
        System.out.println("Career\n" + player_career);
    }

    /*
    public void playerHistory(){
        Scanner sc = new Scanner(System.in);
        while (true){
            if (sc.hasNext() != Team.getName())
                System.out.print("Previous Team: " + sc.next());
            else
                break;
        }
    }
    */

    @Override
    public String toString() {
        return "Player \n" + super.toString() +
                "Current Team: " + current_team.getName() + '\n'+
                "Position(s): " + positions + '\n'+
                "----------------------------------";
    }
}
