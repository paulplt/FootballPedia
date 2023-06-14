import java.util.HashSet;
import java.util.Set;

public class Continent {
    private ContinentName name;
    private final Set<Country> countries = new HashSet<>();
//    private static final int TOTAL_CONTINENTS = 6;
//    private static ContinentName[] allContinents = new ContinentName[TOTAL_CONTINENTS];



    public Continent(ContinentName name) {
        this.name = name;
        int counter = 0;
//        if (counter < TOTAL_CONTINENTS){
//            allContinents[counter] = new ContinentName(this.name);
//            counter++;
//        }
//        else
//            System.out.println("There isn't other Continent.");
    }

    public ContinentName getName() {
        return name;
    }

    public void setName(ContinentName name) {
        this.name = name;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountryInContinent(Country c){
        countries.add(c);
    }

    @Override
    public String toString() {
        return "Continent: " +
                name + '\n' +
                "Countries : " + countries + '\n' + "*".repeat(60);
    }

}
