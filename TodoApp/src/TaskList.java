import javax.swing.*;
import java.awt.*;

public class TaskList extends JPanel {

    public TaskList() {
        GridLayout layout = new GridLayout(6, 1);
        layout.setVgap(10);

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(300, 500));
//        this.setBounds(0, 0, 500, 700);
        this.setBackground(Color.GREEN);
        this.setVisible(true);

    }

}
