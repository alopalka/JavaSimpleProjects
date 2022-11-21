import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGui implements ActionListener {

    JFrame frame = new JFrame("PasswordGenerator");
    JTextField textField1 = new JTextField();
    JPanel panel = new JPanel();
    JButton oneTimeGenerate;
    Font font = new Font("Roboto", Font.BOLD, 20);
    private static final int WINDOWHEIGHT = 800;
    private static final int WINDOWWIDTH = 600;

    public PasswordGui() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
