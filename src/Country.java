import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private League league;
    private long population;
    private Continent belong_to_continent;
    public static final List<Country> country_list = new ArrayList<>();

    public Country(String name, League league, long population) {
        this.name = name;
        this.league = league;
        this.population = population;
    }

    public Country(String name, League league, long population, Continent belong_to_continent) {
        this.name = name;
        this.league = league;
        this.population = population;
        this.belong_to_continent = belong_to_continent;
    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }



    public static void upload_Countries_from_txt(){
       // List<Country> country_List = new ArrayList<>();

        File f = new File("Countries.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse the line and extract values
                String[] parts = line.split(",");
                String country_name = parts[0];
                String league_name = parts[1];
                int number_of_teams = Integer.parseInt(parts[2]);
                long country_population = Long.parseLong(parts[3]);

                // Create objects and add to the list
                League league = new League(league_name, number_of_teams);
                Country obj = new Country(country_name, league, country_population);
                country_list.add(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public String toString() {
//        return this.name +  " - " + population + " - " + league.getLeagueName() + "\n";
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" - ").append(population).append(" - ").append(league.getLeagueName()).append(",\n");

        return sb.toString();
    }

    public void country_info(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" - ").append(population).append(" - ").append(league.getLeagueName()).append(",\n");

        System.out.println(sb);
    }


//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(this.name).append(" - ").append(population).append(" - ").append(league.getLeagueName()).append("\n[");
//        for (int i = 0; i < country_list.size(); i++) {
//            sb.append(country_list.get(i));
//            if (i < country_list.size() - 1) {
//                sb.append(",\n ");
//            }
//        }
//        sb.append("\n]");
//        return sb.toString();
//    }


}
