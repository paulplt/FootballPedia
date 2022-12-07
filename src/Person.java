import java.time.LocalDate;
public class Person {
    private String name;
    private Country country;
    private LocalDate dob;

    public Person(String name, Country country, LocalDate dob) {
        this.name = name;
        this.country = country;
        this.dob = dob;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setNationality(Country country) {
        this.country = country;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Name : " + name + '\n' +
                "Nationality : " + country.getName() + '\n' +
                "Date of Birth : " + dob + '\n';
    }
}
