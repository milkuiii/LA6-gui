import javax.swing.*;
import java.awt.event.*;

public class CharacterRemover extends JFrame {
    private JPanel contentPane;
    private JLabel textLabel;
    private JCheckBox vowelCheckBox;
    private JCheckBox consonantCheckBox;
    private JCheckBox numberCheckBox;
    private JButton removeButton;
    private JButton restoreButton;

    public CharacterRemover(){
        super("CharacterRemover");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textLabel.getText();

                if(vowelCheckBox.isSelected()){
                    text = text.replace("A", "");
                    text = text.replace("E", "");
                    text = text.replace("I", "");
                    text = text.replace("O", "");
                    text = text.replace("U", "");
                }
                if(consonantCheckBox.isSelected()){
                    text = text.replace("B", "");
                    text = text.replace("C", "");
                    text = text.replace("D", "");
                    text = text.replace("F", "");
                    text = text.replace("G", "");
                    text = text.replace("H", "");
                    text = text.replace("J", "");
                    text = text.replace("K", "");
                    text = text.replace("L", "");
                    text = text.replace("M", "");
                    text = text.replace("N", "");
                    text = text.replace("P", "");
                    text = text.replace("Q", "");
                    text = text.replace("R", "");
                    text = text.replace("S", "");
                    text = text.replace("T", "");
                    text = text.replace("V", "");
                    text = text.replace("W", "");
                    text = text.replace("X", "");
                    text = text.replace("Y", "");
                    text = text.replace("Z", "");
                }
                if(numberCheckBox.isSelected()){
                    text = text.replaceAll("[0-9]", "");
                }

                textLabel.setText(text);
            }
        });

        restoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CharacterRemover();
        frame.setVisible(true);
        frame.setSize(400, 200);
    }
}
