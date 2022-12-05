import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoApp implements ActionListener {

    private upperPanel upperPanel = new upperPanel();
    private JFrame frame = new JFrame("Todo App");

    private JButton addTask;


//    Font font = new Font("Roboto", Font.BOLD, 20);

    private static final int WINDOWHEIGHT = 700;
    private static final int WINDOWWIDTH = 500;

    public TodoApp() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOWWIDTH, WINDOWHEIGHT);
        frame.setLayout(null);
        frame.setResizable(false);

        frame.add(upperPanel);
        frame.setVisible(true);

        addTask = upperPanel.getAddTask();
        addTask.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addTask)) {
            System.out.println("test");
        }
    }
}
