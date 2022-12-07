import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {


        Continent e = new Continent(ContinentName.EUROPE);
        switch (e.getName()){

            case EUROPE -> {
            }
            case ASIA -> {
            }
            case AFRICA -> {
            }
        }

        Team pao = new Team
                ("Panathinaikos",
                        1908,
                        new Country("Greece"),
                        "Apostolos Nikolaidis");

        Team barca = new Team
                ("Barcelona",
                        1899,
                        new Country("Spain"),
                        "Camp Nou");

        Match day1 = new Match(pao,barca);
        day1.match(pao,barca);
        day1.table();


        FootballPlayer messi = new FootballPlayer
                ("Lionel Messi",
                new Country("Argentina"),
                LocalDate.of(1987, 7, 24),
                new Team("PSG",1970, new Country("France"),
               "Parc des Princes"));


        PlayerCareer messi1 = new PlayerCareer(barca, 2004, 2021, 520, 474);
        PlayerCareer messi2 = new PlayerCareer(messi.getCurrent_team(), 2021, 2022, 39, 13);

        messi.playerHistory(messi1);
        messi.playerHistory(messi2);
        messi.printPlayerHistory();

        /*
        Coach ivan = new Coach("Ivan Jovanovic",
                                 new Country("Serbia"),
                                 LocalDate.of(1962, 7, 8),
                                 new Team("Panathinaikos",1908, new Country("Greece"),
                                "Apostolos Nikolaidis"));



        messi.addPosition("Forward (Center)");
        messi.addPosition("Attacking Midfield (Center)");
        messi.addPosition("Attacking Midfield (Right)");

        System.out.println(pao);
        System.out.println(messi);
        System.out.println(ivan);
        */
    }
}
