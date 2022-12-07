import java.util.ArrayList;
public class Team {
    private String name;
    private int year_founded;
    private Country country;
    private String ground;
    private Coach coach;
    private ArrayList<FootballPlayer> roster = new ArrayList<FootballPlayer>();


    public Team(String name, int year_founded, Country country, String ground) {
        this.name = name;
        this.year_founded = year_founded;
        this.country = country;
        this.ground = ground;
    }

    public Team(String name, int year_founded, Country country, String ground, Coach coach) {
        this.name = name;
        this.year_founded = year_founded;
        this.country = country;
        this.ground = ground;
        this.coach = coach;
    }

    public String getName() {
        return this.name;
    }

    /*-----------Getters and Setters-----------*/
    public void setName(String name) {
        this.name = name;
    }

    public int getYear_founded() {
        return this.year_founded;
    }

    public void setYear_founded(int year_founded) {
        this.year_founded = year_founded;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getGround() {
        return this.ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public Coach getCoach() {
        return this.coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Team\n" +
                "Name : " + name + '\n' +
                "Founded : " + year_founded + '\n' +
                "Based in : " + country.getName() + '\n' +
                "Ground : " + ground + '\n' +
                "----------------------------------";
    }

    public void addFootballPlayer(FootballPlayer p) {
        roster.add(p);
    }

    public void footballPlayerPartAway(FootballPlayer p){

    }
}
