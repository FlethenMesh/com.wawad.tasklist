package tasklist;

import java.time.LocalDate;

public class Task {
    private String taskName;
    private LocalDate creationDate;
    private LocalDate dueDate;
    private int priorityLevel; // 1 = High, 2 = Medium, 3 = Low
    
    // Constructor
    public Task(String taskName, LocalDate creationDate, LocalDate dueDate, int priorityLevel) {
        this.taskName = taskName;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.priorityLevel = priorityLevel;
    }

    // Getter and Setter for taskName
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    // Getter and Setter for creationDate
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    // Getter and Setter for dueDate
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // Getter and Setter for priorityLevel
    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    // ToString method for easy display
    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", creationDate=" + creationDate +
                ", dueDate=" + dueDate +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
