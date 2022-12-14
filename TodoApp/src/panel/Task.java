package panel;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private String details;
    private boolean completed = false;
    private JTextField taskDetails;

    public Task(String details) {
        this.details = details;

        this.setMinimumSize(new Dimension(400, 20));
        this.setBackground(new Color(100,100,100));
        this.setLayout(new BorderLayout());

        taskDetails = new JTextField(details);
        taskDetails.setBorder(BorderFactory.createEmptyBorder());
        taskDetails.setBackground(new Color(100,100,100));
        taskDetails.setHorizontalAlignment(JTextField.CENTER);
        taskDetails.setFont(new Font("Serif",Font.BOLD,18));
        taskDetails.setForeground(Color.white);
//                text.setFont(new Font("Serif",Font.BOLD,30));
//        // Change text font color
//        text.setForeground(Color.RED);

        this.add(taskDetails,BorderLayout.CENTER);
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
