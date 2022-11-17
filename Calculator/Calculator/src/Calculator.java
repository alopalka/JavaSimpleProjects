import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Calculator implements ActionListener {

    JFrame jFrame = new JFrame("CalculatorApp");
    JTextField jTextField = new JTextField();
    JButton[] numberButtons = new JButton[10];
    JButton[] symbolButtons = new JButton[8];
    JButton addBtn;
    JButton subBtn;
    JButton mulBtn;
    JButton divBtn;
    JButton decBtn;
    JButton equBtn;
    JButton delBtn;
    JButton clrBtn;
    JPanel panel;
    Font font = new Font("Times New Roman", Font.BOLD, 20);

    double numX = 0;
    double numY = 0;
    char operator = 0;

    public Calculator() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 600);
        jFrame.setLayout(null);

        jTextField.setBounds(70, 30, 300, 50);
        jTextField.setFont(font);
        jTextField.setEditable(false);

        jFrame.add(jTextField);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
