

public class Task {
    private final String details;
    private boolean completed = false;

    public Task(String details, boolean completed) {
        this.details = details;
        this.completed = completed;
    }

    public String getDetails() {
        return details;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
