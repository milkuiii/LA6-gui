import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class CharacterCounter extends JFrame {
    private JPanel contentPane;
    private JTextArea messageTextArea;
    private JTextField characterTextField;
    private JLabel charLabel;
    private JButton countButton;
    private JLabel countLabel;
    private JLabel totalCharLabel;
    private JScrollPane scrollPane;

    public CharacterCounter(){
        super("CharacterCounter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);
        totalCharLabel.setText(" ");

        messageTextArea.setLineWrap(true);
        messageTextArea.setWrapStyleWord(true);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = messageTextArea.getText();
                HashMap<Character, Integer> charCounts = new HashMap<>();

                for (char c: temp.toCharArray()){
                    charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
                }

                char c = characterTextField.getText().charAt(0);
                if(charCounts.get(c) == null){
                    totalCharLabel.setText("0");
                } else {
                    totalCharLabel.setText(String.valueOf(charCounts.get(c)));
                }
            }
        });
    }

    public static void main(String [] args){
        JFrame frame = new CharacterCounter();
        frame.setVisible(true);
        frame.setSize(500,300);
    }
}
