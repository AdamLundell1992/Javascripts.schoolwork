package week10;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/**
 * Created by u1853373 on 06/12/2018.
 */
       public class Clubmembers {


    private ArrayList<Member> members = new ArrayList<>();


    public Clubmembers() {

    }
    public void theMembers(){
        for (Member member : members) {
            System.out.println("Members contribution is:");
            System.out.println(member.getContribution());
            System.out.println("Members name is:");
            System.out.println(member.getName());
        }
    }
    public Clubmembers (ArrayList<Member> members) {
        this.members = members;
    }
    public int totalContributions() {
        int contributions = 0;
        for (Member member : members) {
            contributions += member.getContribution();
        }
        return contributions;
    }
    public void addMember(Member newMember) {

        this.members.add(newMember);
    }

    public int turkeys(){
        int contributions = totalContributions();
        return  contributions / 20;
    }
    public static void main(String[] args) {
          Clubmembers theClub = new Clubmembers ();
          Member gary = new Member("Gary",27);
          Member tony = new Member("Tony",21);
          Member rubiya = new Member("Rubiya",20);
          Member steven = new Member("Steven",28);
        theClub.addMember(gary);
        theClub.addMember(tony);
        theClub.addMember(rubiya);
        theClub.addMember(steven);
        theClub.theMembers();
        System.out.println("the contribution amount together is " + theClub.totalContributions() + " pounds");
        System.out.println("A turkey cost 20£ so they can buy " + theClub.turkeys() + " turkeys with their shared contribution");
    }
}






