package panel;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class Task extends JPanel {

    private JLabel index = new JLabel("");
    private String details;
    private boolean completed = false;
    private JButton complateBtn = new JButton("Done");
    private JTextField taskDetails;

    public Task(String details) {
        this.details = details;
        this.setMinimumSize(new Dimension(400, 20));
        this.setBackground(new Color(100, 100, 100));
        this.setLayout(new BorderLayout());

        index.setPreferredSize(new Dimension(30, 30));
        index.setHorizontalAlignment(CENTER);
        index.setFont(new Font("Serif", Font.BOLD, 18));
        index.setForeground(Color.WHITE);

        taskDetails = new JTextField(details);
        taskDetails.setBorder(BorderFactory.createEmptyBorder());
        taskDetails.setBackground(new Color(100, 100, 100));
        taskDetails.setHorizontalAlignment(CENTER);
        taskDetails.setFont(new Font("Serif", Font.BOLD, 18));
        taskDetails.setForeground(Color.WHITE);

        complateBtn.setPreferredSize(new Dimension(40, 40));
        complateBtn.setBorder(BorderFactory.createEmptyBorder());
        complateBtn.setFocusable(false);
        complateBtn.setBackground(Color.WHITE);
        complateBtn.setForeground(new Color(55, 55, 55));

        this.add(taskDetails, BorderLayout.CENTER);
        this.add(complateBtn, BorderLayout.EAST);
        this.add(index, BorderLayout.WEST);
        this.setVisible(true);
    }

    public boolean isCompleted() {
        return completed;
    }

    public JButton getComplateBtn() {
        return complateBtn;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setIndex(int n) {
        index.setText(String.valueOf(n));
        this.revalidate();
    }
}
