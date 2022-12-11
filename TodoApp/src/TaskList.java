import javax.swing.*;
import java.awt.*;

public class TaskList extends JPanel {

    public TaskList() {
        GridLayout layout = new GridLayout(6, 1);
        layout.setVgap(10);

        this.setLayout(layout);
        this.setMaximumSize(new Dimension(500, 600));
        this.setBackground(Color.GREEN);
        this.setVisible(true);
    }

}
