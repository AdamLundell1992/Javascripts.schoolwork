package week2_2019;
import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by u1853373 on 22/01/2019.
 */
public class Diary {

    private ArrayList <Job> jobs = new ArrayList<>();

    public Diary() {
    }

    public void addJob(Job newJob ) {
        this.jobs.add(newJob);
    }
    public void printJobs(){
        for (Job job : jobs){
            if(!job.isCompleted()){
                System.out.println(job);
            }
        }
    }
    public void printCompletedJobs(){
        for (Job job : jobs){
            if(job.isCompleted()){
                System.out.println(job);
            }
        }
    }


    public void sortTeam () {
        Collections.sort (this.jobs);
    }


    public static void main(String[] args) {
        Diary diary = new Diary();
        Job j1 = new Job("Teacher", 1);
        Job j5 = new Job("Cleaner", 5);
        Job j3 = new Job("Security guard", 3);
        Job j2 = new Job("Gym Staff", 2);
        Job j4 = new Job("Programmer", 4);
        final String formatString = "%-8s %15s %12s";
        //here i printed out the names on the board.over the numbers
        System.out.println( (String.format (formatString,
                "description",
                "Priority",
                "Completed")));

        j1.setCompleted();
        diary.addJob(j1);
        diary.addJob(j2);
        diary.addJob(j3);
        diary.addJob(j4);
        diary.addJob(j5);
        diary.sortTeam();
        diary.printJobs();
        System.out.println("");
        System.out.println("");
        System.out.println("Completed jobs List");
        final String formatString2 = "%-8s %15s %12s";
        //here i printed out the names on the board.over the numbers
        System.out.println( (String.format (formatString2,
                "description",
                "Priority",
                "Completed")));
        diary.printCompletedJobs();
    }
}

