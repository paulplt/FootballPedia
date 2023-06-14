import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){

                /*Continent Creation*/
                final int TOTAL_CONTINENTS = 6;
                Continent[] allContinents = new Continent[TOTAL_CONTINENTS];
                Continent europe = new Continent(ContinentName.Europe);
                Continent south_am = new Continent(ContinentName.South_America);
                Continent asia = new Continent(ContinentName.Asia);
                Continent africa = new Continent(ContinentName.Africa);
                Continent north_am = new Continent(ContinentName.North_America);
                Continent oceania = new Continent(ContinentName.Oceania);

                allContinents[0] = europe; allContinents[1] = south_am; allContinents[2] = asia;
                allContinents[3] = africa; allContinents[4] = north_am; allContinents[5] = oceania;


                /*League Creation*/
                League gr_supl1 = new League("Greek Super League", 14);
                League arg_league = new League("Liga Profesional de Futbol",28);

                /*Country Creation*/
                Country greece = new Country("Greece", gr_supl1, 11_000_000);;
                Country spain = new Country("Spain", new League("La Liga", 20), 47_500_000);
                Country argentina = new Country("Argentina", arg_league,46_000_000);

                /*Add Countries in their continent*/
                europe.addCountryInContinent(greece);
                europe.addCountryInContinent(spain);
                south_am.addCountryInContinent(argentina);

                /*Team Creation*/
                Team pao = new Team("Panathinaikos", 1908, greece, "Apostolos Nikolaidis");
                Team barca = new Team("Barcelona", 1899, new Country("Spain"), "Camp Nou");

                /*Football Player Creation*/
                FootballPlayer messi = new FootballPlayer
                        ("Lionel Messi", argentina, LocalDate.of(1987, 7, 24),
                                new Team("PSG",1970, new Country("France"),
                                        "Parc des Princes"));
                FootballPlayer zeca = new FootballPlayer("Zeca", greece, LocalDate.of(1988,8,31),
                        pao);
                Person aitor = new FootballPlayer("Aitor Cantalapiedra",spain,
                        LocalDate.of(1996, 2, 10),pao);

                /*Coach Creation*/
                Coach ivan = new Coach("Ivan Jovanovic",
                        new Country("Serbia"), LocalDate.of(1962, 7, 8), pao);
                Person pep = new Coach("Pep Guardiola",spain, LocalDate.of(1971, 1, 18),
                        new Team("Manchester City", 1880, new Country("England"),"Etihad Stadium"));

                /*Add Teams in their League*/
                gr_supl1.addTeamInLeague(pao);

                /*Add players in a team roster*/
                //pao.addFootballPlayer(aitor);
                pao.addFootballPlayer(messi);
                pao.addFootballPlayer(zeca);



                try (Scanner sc = new Scanner(System.in)){
                        boolean exit = false;
                        while (!exit){
                                int choice;
                                System.out.println("Menu ");
                                System.out.println("1 - Continents");
                                System.out.println("2 - Countries");
                                System.out.println("3 - Leagues");
                                System.out.println("4 - Teams");
                                System.out.println("5 - Team's roster");
                                System.out.println("6 - Players");
                                System.out.println("7 - Player's career");
                                System.out.println("8 - Play a match");
                                System.out.println("9 - Exit");
                                System.out.print("\nMake a choice (1-9): ");
                                choice = sc.nextInt();

                                switch (choice){
                                        case 1:
                                                for (Continent continent: allContinents){
                                                        System.out.println(continent);
                                                }
                                                break;
                                        case 2:
                                                System.out.println("Manually created: ");
                                                System.out.println(greece);
                                                System.out.println(spain);
                                                System.out.println(argentina);

                                                Country.upload_Countries_from_txt();
                                                System.out.println("\nUploaded from txt file: ");
                                                System.out.println(Country.country_list + "\n");
                                                break;
                                        case 3:
                                                gr_supl1.league_info();
                                                break;
                                        case 4:
                                                System.out.println(pao);
                                                System.out.println(barca);
                                                break;
                                        case 5:
                                                pao.print_team_roster();

                                                /*A player part away from a team*/
                                                pao.footballPlayerPartAway(messi);
                                                System.out.println(messi.getName() + " is leaving " + pao.getGround());
                                                pao.print_team_roster();
                                                break;
                                        case 6:
                                                System.out.println(messi);
                                                System.out.println(aitor);
                                                System.out.println(zeca);
                                                break;
                                        case 7:
                                                /*Player career*/
                                                System.out.println(messi.getName() + "'s career.");
                                                PlayerCareer messi1 = new PlayerCareer(barca, 2004, 2021, 520, 474);
                                                PlayerCareer messi2 = new PlayerCareer(messi.getCurrent_team(), 2021, 2022, 39, 13);

                                                messi.playerHistory(messi1);
                                                messi.playerHistory(messi2);
                                                messi.printPlayerHistory();
                                                break;
                                        case 8:
                                                /*Play a match*/
                                                System.out.println("\nPlay a match.");
                                                Match day1 = new Match(pao,barca);
                                                day1.match(pao,barca);
                                                day1.table();
                                                break;
                                        case 9:
                                           exit = true;
                                }

                        }
                }



//        From here is the original main
//        /*Continent Creation*/
//        final int TOTAL_CONTINENTS = 6;
//        Continent[] allContinents = new Continent[TOTAL_CONTINENTS];
//        Continent europe = new Continent(ContinentName.Europe);
//        Continent south_am = new Continent(ContinentName.South_America);
//        Continent asia = new Continent(ContinentName.Asia);
//        Continent africa = new Continent(ContinentName.Africa);
//        Continent north_am = new Continent(ContinentName.North_America);
//        Continent oceania = new Continent(ContinentName.Oceania);
//
//        allContinents[0] = europe; allContinents[1] = south_am; allContinents[2] = asia;
//        allContinents[3] = africa; allContinents[4] = north_am; allContinents[5] = oceania;
//
//        for (Continent continent: allContinents){
//                System.out.println(continent);
//        }
//
//
//        /*League Creation*/
//        League gr_supl1 = new League("Greek Super League", 14);
//        League arg_league = new League("Liga Profesional de Futbol",28);
//
//        /*Country Creation*/
//        Country greece = new Country("Greece", gr_supl1, 11_000_000);;
//        Country spain = new Country("Spain", new League("La Liga", 20), 47_500_000);
//        Country argentina = new Country("Argentina", arg_league,46_000_000);
//
//        System.out.println("Print Countries.");
//        System.out.println(greece);
//        System.out.println(spain);
//        System.out.println(argentina);
//
//        /*Team Creation*/
//        Team pao = new Team("Panathinaikos", 1908, greece, "Apostolos Nikolaidis");
//        Team barca = new Team("Barcelona", 1899, new Country("Spain"), "Camp Nou");
//
//        /*Football Player Creation*/
//        FootballPlayer messi = new FootballPlayer
//                ("Lionel Messi", argentina, LocalDate.of(1987, 7, 24),
//                        new Team("PSG",1970, new Country("France"),
//                                "Parc des Princes"));
//        Person aitor = new FootballPlayer("Aitor Cantalapiedra",spain,
//                LocalDate.of(1996, 2, 10),pao);
//
//        /*Coach Creation*/
//        Coach ivan = new Coach("Ivan Jovanovic",
//                new Country("Serbia"), LocalDate.of(1962, 7, 8), pao);
//        Person pep = new Coach("Pep Guardiola",spain, LocalDate.of(1971, 1, 18),
//                new Team("Manchester City", 1880, new Country("England"),"Etihad Stadium"));
//
//        /*Add Countries in their continent*/
//        europe.addCountryInContinent(greece);
//        europe.addCountryInContinent(spain);
//        south_am.addCountryInContinent(argentina);
//
//        /*Print Continents*/
//        System.out.println("Print Continents.");
//        System.out.println(europe);
//        System.out.println(south_am);
//
//        /*Add Teams in their League*/
//        gr_supl1.addTeamInLeague(pao);
//        System.out.println("Print Leagues.");
//        System.out.println(gr_supl1);
//
//        /*Add players in a team roster*/
//        //pao.addFootballPlayer(aitor);
//        pao.addFootballPlayer(messi);
//        System.out.println("Print a team's roster.");
//        pao.print_team_roster();
//
//        /*A player part away from a team*/
//        pao.footballPlayerPartAway(messi);
//        pao.print_team_roster();
//
//
//        /*Play a match*/
//        System.out.println("\nPlay a match.");
//        Match day1 = new Match(pao,barca);
//        day1.match(pao,barca);
//        day1.table();
//
//        /*Player career*/
//        System.out.println(messi.getName() + "'s career.");
//        PlayerCareer messi1 = new PlayerCareer(barca, 2004, 2021, 520, 474);
//        PlayerCareer messi2 = new PlayerCareer(messi.getCurrent_team(), 2021, 2022, 39, 13);
//
//        messi.playerHistory(messi1);
//        messi.playerHistory(messi2);
//        messi.printPlayerHistory();
//
//        Country.upload_Countries_from_txt();
//        System.out.println("\nCountry - Population - League");
//        System.out.println(Country.country_list);
//
//        /*
//        messi.addPosition("Forward (Center)");
//        messi.addPosition("Attacking Midfield (Center)");
//        messi.addPosition("Attacking Midfield (Right)");
//        */
//
//        //for (Continent continent: allContinents){     error, it needs debugging
////        for (int i = 0; i<= allContinents.length; i++){
////
////              System.out.print(allContinents[i].getName() + " : ");
////              System.out.println(Country.country_list.get(i).getName());
////        }
//
//        //System.out.println(Country.country_list.get(0).getName());
//

    }
}
