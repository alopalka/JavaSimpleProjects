import javax.swing.*;
import java.awt.*;

public class upperPanel extends JPanel {
    public upperPanel() {
        this.setBackground(Color.GRAY);
        this.setBounds(0, 0, 500, 150);
        JTextField txtField = new JTextField();
        JButton addTask = new JButton("Add");

        txtField.setBounds(40, 30, 400, 50);
        txtField.setEditable(false);

        this.add(txtField);
        this.add(addTask);


    }
}
