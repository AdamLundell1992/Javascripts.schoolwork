package SuperLeague;

/**
 * Created by u1853373 on 17/01/2019.
 */
    //3rd and main class,creating the game results and names of the team
    //and name of the league"theleague"
    public class Main {
    public static void main(String[] args) {
        SuperLeague theLeague = new SuperLeague();
        Team wigan = new Team("Wigan Warriors");
        Team leeds = new Team("Leeds Rhinos");
        Team hudds = new Team("Huddersfield Giants");
        Team hull = new Team("Hull FC");
        leeds.playMatch(22,12);
        hudds.playMatch(12,22);
        wigan.playMatch(22,18);
        hudds.playMatch(18,22);
        wigan.playMatch(34,0);
        hull.playMatch(0,34);
        leeds.playMatch(10,10);
        wigan.playMatch(10,10);
        //adding the teams

        theLeague.addTeam(wigan);
        theLeague.addTeam(leeds);
        theLeague.addTeam(hudds);
        theLeague.addTeam(hull);
        theLeague.printLeague();
        //printing the league

    }
}
