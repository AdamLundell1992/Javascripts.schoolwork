package week2_2019;

/**
 * Created by u1853373 on 22/01/2019.
 */
// Class name and implements Comparable i use to sort the Priority list.look down in this code
public class Job implements Comparable <Job> {


// Attributes
    private String description;
    private int priority;
    private boolean completed;
    private boolean found;




    public Job(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
        this.found = false;
    }

/// getters and setters
    public  String getDescription() {

        return description;
    }

    public boolean isFound() {
        return isFound();
    }

    public void setFound(boolean found) {
        this.found = found;
    }
    public  int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }




    @Override
    public String toString() {
            final String formatString = "%-15s %5s %15s";
        return (String.format (formatString,

                this.description,
                this.priority,
                this.completed,
                '}'));
    }
//Here i use the Compare i have in my class name/ the boolean will compare my priority and
// make it so it can be sorted in a list from 1-5 in my output when i make printJobs
// it will print a list of the jobs and the priority and this will sort it.

    @Override
    public int compareTo(Job j) {
        if (j.priority > this.priority) {
            return 1;
        }
        else if (j.priority < this.priority) {
            return -1;
        }
        else {
            return 0;
        }
    }
}