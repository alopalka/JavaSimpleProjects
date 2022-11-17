import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Calculator implements ActionListener {

    JFrame jFrame = new JFrame("Calculator");
    JTextField jTextField = new JTextField();
    JButton[] numberButtons = new JButton[10];
    List<JButton> symbolList = new ArrayList<>();
    JButton addBtn,subBtn,mulBtn,divBtn,decBtn,equBtn,delBtn,clrBtn;
    JPanel panel = new JPanel();
    Font font = new Font("Roboto", Font.BOLD, 20);

    double numX = 0;
    double numY = 0;
    char operator = 0;

    private static final int WINDOWHEIGHT = 600;
    private static final int WINDOWWIDTH = 500;

    public Calculator() {
        appSetup();
    }

    public void appSetup(){
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(WINDOWWIDTH, WINDOWHEIGHT);
        jFrame.setLayout(null);

        jTextField.setBounds(70, 30, 300, 50);
        jTextField.setFont(font);
        jTextField.setEditable(false);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        decBtn = new JButton(".");
        equBtn = new JButton("=");
        delBtn = new JButton("Del");
        clrBtn = new JButton("Clear");

        symbolList.add(addBtn);
        symbolList.add(subBtn);
        symbolList.add(mulBtn);
        symbolList.add(divBtn);
        symbolList.add(decBtn);
        symbolList.add(equBtn);
        symbolList.add(delBtn);
        symbolList.add(clrBtn);

        for (JButton symbolBtn : symbolList) {
            symbolBtn.addActionListener(this);
            symbolBtn.setFont(font);
            symbolBtn.setFocusable(false);
        }

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);
        }

        delBtn.setBounds(50,430,143,50);
        clrBtn.setBounds(205,430,145,50);

        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.setBackground(Color.GRAY);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addBtn);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subBtn);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulBtn);
        panel.add(decBtn);
        panel.add(numberButtons[0]);
        panel.add(equBtn);
        panel.add(divBtn);

        jFrame.add(panel);
        jFrame.add(delBtn);
        jFrame.add(clrBtn);
        jFrame.add(jTextField);
        jFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
