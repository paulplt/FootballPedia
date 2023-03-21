import java.util.HashSet;
import java.util.Set;

public class Continent {
    private ContinentName name;
    private final Set<Country> countries = new HashSet<>();


    public Continent(ContinentName name) {
        this.name = name;
    }

    public ContinentName getName() {
        return name;
    }

    public void setName(ContinentName name) {
        this.name = name;
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
