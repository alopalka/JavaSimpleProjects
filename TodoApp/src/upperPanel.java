import javax.swing.*;
import java.awt.*;

public class upperPanel extends JPanel {
    private JTextField txtField = new JTextField();
    private JButton addTask = new JButton("Add");

    public upperPanel() {
        txtField.setPreferredSize(new Dimension(250, 30));
        txtField.setEditable(true);
        txtField.setText("test");
        txtField.setHorizontalAlignment(JTextField.CENTER);
        txtField.setLayout(null);

        addTask.setFocusable(false);
        addTask.setBackground(new Color(9, 14, 27));
        addTask.setForeground(new Color(196, 149, 79));
        addTask.setPreferredSize(new Dimension(100, 35));
        addTask.setHorizontalAlignment(JButton.CENTER);
        addTask.setVerticalAlignment(JButton.CENTER);
        addTask.setEnabled(true);

        this.setMaximumSize(new Dimension(500,100));
        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(txtField);
        this.add(addTask);
    }

    public JTextField getTxtField() {
        return txtField;
    }

    public void setTxtField(JTextField txtField) {
        this.txtField = txtField;
    }

    public JButton getAddTask() {
        return addTask;
    }

    public void setAddTask(JButton addTask) {
        this.addTask = addTask;
    }
}
