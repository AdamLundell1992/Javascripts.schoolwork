package week2_2019;
import javafx.scene.layout.Priority;

import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static week2_2019.Job.*;

/**
 * Created by u1853373 on 22/01/2019.
 */
public class Diary {
// Arraylist for my jobs, i will create them in my main method in the bottom on this class.
    private ArrayList <Job> jobs = new ArrayList<>();

    public Diary() {
    }
//Arraylist for the newjobs i create- this method will add the jobs to the Arraylist.
    public void addJob(Job newJob ) {
        this.jobs.add(newJob);
    }
    public void printJobs() {
        for (Job job : jobs) {
            if (!job.isCompleted()) {
                System.out.println(job);

            }
        }
    }
// Arraylist for completed Jobs if the job is completed it will be added to a new Arraylist,
// that i can use in my mainmethood by typing .printCompletedJobs.
// i need to choose my self if the job are completed inside the main method with set.completed.
    public void printCompletedJobs(){
        for (Job job : jobs){
            if(job.isCompleted()){
                System.out.println(job);
            }
        }
    }


    //public void isFound(String word){
    //for (Job job : jobs){
     //   if (job.isFound()){
         //   System.out.println(job);
       // }
   // }
//}




//Sort team is just a name... This method will sort my jobs , in this case with
// the priority it will sort it from 1-5(1bottom 5 top).Need to add the sortteam inside tha main
// to put in in use

    public void sortTeam () {
        Collections.sort (this.jobs);

   }
// This Arraylists name is "returnList" And the if inside means that if the jobname
// cointains the word you type in (lowercase will just make so the word you type in can be lover)
// If the word "or the letter" is found the "jobname" arraylist- "returnList" will add the
// return the job.
   public ArrayList<Job> searchDiary(String word){
       ArrayList<Job> returnList = new ArrayList<>(0);
       boolean found = false;
       for (Job job : jobs){
           if(job.getDescription().toLowerCase().contains(word.toLowerCase())){
               //System.out.println(job.getDescription() + " contains " + word);
               returnList.add(job);
               found = true;
           }
       }
       // if the returnList is empty it will return null else it will return the Arraylist
       // called "returnList"
       if(returnList.isEmpty()){
           return null;
       }else{
           return returnList;
       }

   }


    public static void main(String[] args) {
        Diary diary = new Diary();
        Job j1 = new Job("Teacher", 1);
        Job j5 = new Job("Cleaner", 5);
        Job j3 = new Job("Security guard", 3);
        Job j2 = new Job("Gym Staff", 2);
        Job j4 = new Job("Programmer", 4);
        Job j6 = new Job("Gym Trainer", 2);
        final String formatString = "%-8s %15s %12s";
        //here i printed out the names on the board.over the numbers
        System.out.println( (String.format (formatString,
                "description",
                "Priority",
                "Completed")));

        System.out.println("");
        j1.setCompleted();
        diary.addJob(j1);
        diary.addJob(j2);
        diary.addJob(j3);
        diary.addJob(j4);
        diary.addJob(j5);
        diary.addJob(j6);
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
        System.out.println("");
        diary.printCompletedJobs();
        // "The scanner class" it reads a string and search for the word.
        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String searchWord = scanner.nextLine();
        // returnList search for the word and if the returnList != not= null #
        // it will loop through the diary to find a simular "word letter" inside the
        // diary and print out the job.
        ArrayList<Job> returnList = diary.searchDiary(searchWord);
        if(returnList != null){
            for(Job job : diary.searchDiary(searchWord)){
                System.out.println(job);
            }
            // Else it will print this "You search term did not find a match"
        }else{
            System.out.println("You search term did not find a match");
        }



    }
}

        //String stringToTest = Job.getDescription();

       // boolean isFound = stringToTest.contains(word);






