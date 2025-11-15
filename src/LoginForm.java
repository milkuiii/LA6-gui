import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginForm extends JFrame {
    private JTextField usernameTextField;
    private JButton loginButton;
    private JPanel contentPane;
    private JPasswordField passwordField;

    public LoginForm(){
        super("LoginForm");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                char[] password = passwordField.getPassword();

                char[] expectedPassword = new char[]{'a', 'd', 'm', 'i', 'n'};

                if(username.equals("admin") && Arrays.equals(password, expectedPassword)){
                    JOptionPane.showMessageDialog(null, "Login successful.", "Status", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Login unsuccessful.", "Status", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new LoginForm();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 200);
    }
}
