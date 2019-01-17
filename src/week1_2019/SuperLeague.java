package week1_2019;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by u1853373 on 17/01/2019.
 */
//second class
public class SuperLeague {
    //arraylist for my teams
    private ArrayList <Team> teams = new ArrayList<>();

    public SuperLeague() {
    }
        // method for add teams
    public void addTeam(Team newTeam ) {
        //add new team in the main method
        this.teams.add(newTeam);
    }
        //method for doing the meaning of the result numbers "se under"and the distance between them.
    public void printLeague(){
        final String formatString = "%-20s %8s %5s %7s %6s %5s %9s %14s %7s";
        //here i printed out the names on the board.over the numbers
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
        // loops through the arraylist "team" and print out the content
        for (Team t : teams){
            System.out.println(t.printFormatted());

        }
    }

}
