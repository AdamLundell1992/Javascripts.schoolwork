package week2_2019;

/**
 * Created by u1853373 on 22/01/2019.
 */
public class Job implements Comparable <Job> {


    private String description;
    private int priority;



    private boolean completed;


    public Job(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }


    public String getDescription() {
        return description;
    }


    public int getPriority() {
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