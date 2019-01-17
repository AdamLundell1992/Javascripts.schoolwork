package week1_2019;
import java.util.ArrayList;
import java.util.Collections;



/**
 * Created by u1853373 on 17/01/2019.
 */
//Class name
public class Team {
    private String teamName;
//Attributes needed for the pointtable
    private int wins;
    private int losses;
    private int draws;
    private int pointsFor;
    private int pointsAgainst;

    public Team(String teamName ) {
        this.teamName = teamName;
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
        this.pointsFor = 0;
        this.pointsAgainst = 0;
    }
     // Method that count the wins the looses and the draws
    public void playMatch (int pointsFor, int pointsAgainst){
        if (pointsFor > pointsAgainst){
            this.wins += 1;
        }else if(pointsFor == pointsAgainst) {
            this.draws += 1;
        }else {
            this.losses += 1;
        }
        this.pointsFor += pointsFor;
        this.pointsAgainst += pointsAgainst;
    }
    //The %-20 = 20 spaces but the "-" means from the left ,%20 space from the right
    public String printFormatted () {
        final String formatString = "%-20s %8s %5s %7s %6s %5s %9s %14s %7s";
// this is all the out put that will be printed in the Main class
        return (String.format (formatString,
                    this.teamName,//print teamname
                    this.wins + this.losses + this.draws, //counts the games played
                    this.wins,// counts wins
                    this.draws,// counts draws
                    this.losses,//counts lost games
                    this.pointsFor,//counts points for the team
                    this.pointsAgainst,//count points against the team
                    this.pointsFor - this.pointsAgainst,//counts points differense
                    this.wins * 2 + this.draws //counts main points win=2 draw=1


                ));
    }

}
