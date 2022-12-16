package panel;

import javax.swing.*;
import java.awt.*;

public class TaskList extends JPanel {
    public TaskList() {
        GridLayout layout = new GridLayout(7, 1);
        layout.setVgap(10);
        layout.setHgap(10);
        this.setLayout(layout);
        this.setMaximumSize(new Dimension(510, 650));
        this.setBackground(new Color(195, 195, 195));
        this.setVisible(true);
    }

    public void numerateTasks() {
        Component[] components = this.getComponents();

        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof Task) {
                ((Task) components[i]).setIndex(i + 1);
            }
        }
    }

    public void refreshTasks(){
        for (Component c : getComponents()) {
            if(c instanceof Task && ((Task) c).isCompleted()){
                remove(c);
                numerateTasks();
            }
        }
    }
}
