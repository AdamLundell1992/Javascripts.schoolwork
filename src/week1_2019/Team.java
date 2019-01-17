package week1_2019;
import java.util.ArrayList;
import java.util.Collections;



/**
 * Created by u1853373 on 17/01/2019.
 */
public class Team {
    private String teamName;

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
    public String printFormatted () {
        final String formatString = "%-20s %8s %5s %7s %6s %5s %9s %14s %7s";

        return (String.format (formatString,
                    this.teamName,
                    this.wins + this.losses + this.draws,
                    this.wins,
                    this.draws,
                    this.losses,
                    this.pointsFor,
                    this.pointsAgainst,
                    this.pointsFor - this.pointsAgainst,
                    this.wins * 2 + this.draws


                ));
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", played=" + (wins + losses + draws) +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", pointsFor=" + pointsFor +
                ", pointsAgainst=" + pointsAgainst +
                ", pointsdifferense=" + (pointsFor - pointsAgainst) +
                ", totalpoints=" + (wins * 2 + draws ) +
                '}';
    }
}
