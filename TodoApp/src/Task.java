import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private String details;
    private boolean completed = false;
    private JTextField taskDetails;

    public Task(String details) {
        this.details = details;

        this.setMinimumSize(new Dimension(400, 20));
        this.setBackground(Color.red);
        this.setLayout(new BorderLayout());

        taskDetails = new JTextField(details);
        taskDetails.setBorder(BorderFactory.createEmptyBorder());
        taskDetails.setBackground(Color.red);

        this.add(taskDetails);
        this.setVisible(true);
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
