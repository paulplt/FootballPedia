import java.util.ArrayList;
import java.util.Iterator;


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

    /*-----------Getters and Setters-----------*/
    public String getName() {
        return this.name;
    }

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
        return name;
    }

    public void team_info(){
        System.out.println("Team\n" +
                "Name : " + name + '\n' +
                "Founded : " + year_founded + '\n' +
                "Based in : " + country.getName() + '\n' +
                "Ground : " + ground + '\n' +
                "----------------------------------");
    }

    public void addFootballPlayer(FootballPlayer p) {
        roster.add(p);
    }

    public void footballPlayerPartAway(FootballPlayer p){
        roster.remove(p);
    }

    public void print_team_roster(){
        System.out.println(getName() + "'s roster");
        Iterator<FootballPlayer> pl = roster.iterator();
        if (pl.hasNext()) {
            System.out.print(pl.next());
            while (pl.hasNext()) {
                System.out.print(", " + pl.next());
            }
        }
        System.out.println(".");
    }

}
