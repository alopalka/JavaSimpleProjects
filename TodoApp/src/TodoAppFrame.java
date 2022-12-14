import panel.Task;
import panel.TaskList;
import panel.UpperPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TodoAppFrame extends JFrame {

    private UpperPanel upperPanel = new UpperPanel();
    private TaskList taskList = new TaskList();
    private JPanel mainPanel = new JPanel();

    private JButton addTask;

    private static final int WINDOWHEIGHT = 700;
    private static final int WINDOWWIDTH = 500;

    public TodoAppFrame() {
        this.setTitle("Todo App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOWWIDTH, WINDOWHEIGHT);
        this.setResizable(false);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(upperPanel, BorderLayout.NORTH);
        mainPanel.add(taskList, BorderLayout.SOUTH);

        this.add(mainPanel);
        this.setVisible(true);

        addTask = upperPanel.getAddTask();
        addListeners();
    }

    public void addListeners() {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Task task = new Task(upperPanel.getTxtFieldValue());
                taskList.add(task, BorderLayout.CENTER);
                taskList.numerateTasks();
                upperPanel.resetTxtFieldValue();

                task.getComplateBtn().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e);
                        task.setCompleted(true);
                        taskList.refreshTasks();
                    }
                });

                repaint();
                revalidate();
            }
        });
    }

}
