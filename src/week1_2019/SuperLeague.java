package week1_2019;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by u1853373 on 17/01/2019.
 */
public class SuperLeague {
    private ArrayList <Team> teams = new ArrayList<>();

    public SuperLeague() {
    }
    public void addTeam(Team newTeam ) {

        this.teams.add(newTeam);
    }
    public void printLeague(){
        final String formatString = "%-20s %8s %5s %7s %6s %5s %9s %14s %7s";

        System.out.println( (String.format (formatString,
                    "Team",
                    "Played",
                    "Won",
                    "Drawn",
                    "Lost",
                    "For",
                    "Against",
                    "Points Diff",
                    "Points"
                )));

        for (Team t : teams){
            System.out.println(t.printFormatted());

        }
    }

}
