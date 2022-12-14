package panel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class UpperPanel extends JPanel {
    private JTextField txtField = new JTextField();
    private JButton addTask = new JButton("Add");

    public UpperPanel() {
        txtField.setPreferredSize(new Dimension(250, 30));
        txtField.setEditable(true);
        txtField.setText("test");
        txtField.setHorizontalAlignment(JTextField.CENTER);
        txtField.setLayout(null);
        txtField.setBorder(new LineBorder(new Color(55, 55, 55),1));

        addTask.setFocusable(false);
        addTask.setBackground(Color.white);
        addTask.setForeground(new Color(55, 55, 55));
        addTask.setPreferredSize(new Dimension(100, 35));
        addTask.setHorizontalAlignment(JButton.CENTER);
        addTask.setVerticalAlignment(JButton.CENTER);
        addTask.setEnabled(true);

        this.setBorder(BorderFactory.createEmptyBorder());
        this.setMaximumSize(new Dimension(510, 50));
        this.setBackground(new Color(95, 95, 95));
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

    public String getTxtFieldValue(){
        return txtField.getText();
    }

    public void resetTxtFieldValue(){
        txtField.setText("");
    }
}
