import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Calculator implements ActionListener {

    JFrame frame = new JFrame("Calculator");
    JTextField txtField = new JTextField();
    JButton[] numberButtons = new JButton[10];
    List<JButton> funcButtons = new ArrayList<>();
    JButton addBtn, subBtn, mulBtn, divBtn, dotBtn, equBtn, delBtn, clrBtn, negBtn, offBtn;
    JPanel panel = new JPanel();
    Font font = new Font("Roboto", Font.BOLD, 20);

    double numX = 0;
    double numY = 0;
    double result = 0;
    char operator = 0;

    private static final int WINDOWHEIGHT = 600;
    private static final int WINDOWWIDTH = 500;

    public Calculator() {
        appSetup();
    }

    public void appSetup() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOWWIDTH, WINDOWHEIGHT);
        frame.setLayout(null);
        frame.setResizable(false);

        txtField.setBounds(40, 30, 400, 50);
        txtField.setFont(font);
        txtField.setEditable(false);

        funcButtons.add(addBtn = new JButton("+"));
        funcButtons.add(subBtn = new JButton("-"));
        funcButtons.add(mulBtn = new JButton("*"));
        funcButtons.add(divBtn = new JButton("/"));
        funcButtons.add(dotBtn = new JButton("."));
        funcButtons.add(equBtn = new JButton("="));
        funcButtons.add(delBtn = new JButton("Del"));
        funcButtons.add(clrBtn = new JButton("Clr"));
        funcButtons.add(negBtn = new JButton("+/-"));
        funcButtons.add(offBtn = new JButton("Off"));

        for (JButton symbolBtn : funcButtons) {
            symbolBtn.addActionListener(this);
            symbolBtn.setFont(font);
            symbolBtn.setFocusable(false);
            symbolBtn.setBackground(new Color(9, 14, 27));
            symbolBtn.setForeground(new Color(196, 149, 79));
        }

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(9, 14, 27));
            numberButtons[i].setForeground(new Color(196, 149, 79));
        }
        panel.setBounds(40, 100, 400, 430);
        panel.setLayout(new GridLayout(5, 3, 6, 6));

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulBtn);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subBtn);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addBtn);
        panel.add(numberButtons[0]);
        panel.add(dotBtn);
        panel.add(negBtn);
        panel.add(equBtn);
        panel.add(delBtn);
        panel.add(clrBtn);
        panel.add(divBtn);
        panel.add(offBtn);

        frame.add(panel);
        frame.add(txtField);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                txtField.setText(txtField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == dotBtn) {
            if (!txtField.getText().contains(".")) {
                txtField.setText(txtField.getText().concat("."));
            }
        }
        if (e.getSource() == addBtn) {
            numX = Double.parseDouble(txtField.getText());
            operator = '+';
            txtField.setText("");
        }
        if (e.getSource() == subBtn) {
            numX = Double.parseDouble(txtField.getText());
            operator = '-';
            txtField.setText("");
        }
        if (e.getSource() == mulBtn) {
            numX = Double.parseDouble(txtField.getText());
            operator = '*';
            txtField.setText("");
        }
        if (e.getSource() == divBtn) {
            numX = Double.parseDouble(txtField.getText());
            operator = '/';
            txtField.setText("");
        }
        if (e.getSource() == equBtn) {
            numY = Double.parseDouble(txtField.getText());
            switch (operator) {
                case '+':
                    result = numX + numY;
                    break;
                case '-':
                    result = numX - numY;
                    break;
                case '*':
                    result = numX * numY;
                    break;
                case '/':
                    result = numX / numY;
                    break;
            }
            txtField.setText(String.valueOf(result));
            numX = result;
        }
        if (e.getSource() == clrBtn) {
            numX = 0;
            numY = 0;
            txtField.setText("");
        }
        if (e.getSource() == delBtn) {
            txtField.setText(txtField.getText().substring(0, txtField.getText().length() - 1));
        }
        if (e.getSource() == negBtn) {
            double n = Double.parseDouble(txtField.getText());
            txtField.setText(String.valueOf(n * -1));
        }
        if (e.getSource() == offBtn) {
            System.exit(0);
        }
    }
}
