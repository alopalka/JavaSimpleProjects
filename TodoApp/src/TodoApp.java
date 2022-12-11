import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TodoApp implements ActionListener {

    private upperPanel upperPanel = new upperPanel();
    private JFrame frame = new JFrame("Todo App");
    private TaskList taskList = new TaskList();
    private JPanel mainPanel = new JPanel();

    private JButton addTask;

    private static final int WINDOWHEIGHT = 700;
    private static final int WINDOWWIDTH = 500;

    public TodoApp() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOWWIDTH, WINDOWHEIGHT);
        frame.setResizable(false);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(upperPanel);
        mainPanel.add(taskList);

        frame.add(mainPanel);
        frame.setVisible(true);

        addTask = upperPanel.getAddTask();
        addTask.addActionListener(this);
        addListeners();
    }

    public void addListeners() {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                taskList.add(new Task("zadanie"));
                System.out.println("kurla");
                taskList.repaint();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addTask)) {
            Task task = new Task("ziemniaki");
            taskList.add(task);
        }
    }
}
