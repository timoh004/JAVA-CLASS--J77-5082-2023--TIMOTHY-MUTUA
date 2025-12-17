////J77-5082-2023 TIMOTHY MUTUA
import javax.swing.*;
import java.awt.*;

public class SwingForm {
    public static void main(String[] args) {
        // main frame
        JFrame frame = new JFrame("Java Swing Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // panel with a layout (FlowLayout by default)
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // i. Creating a label
        JLabel label = new JLabel("Enter your name:");

        // ii. creating a text field
        JTextField textField = new JTextField(20);

        // iii. Creating  a button
        JButton button = new JButton("Submit");

        // Adding  components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Adding  the panel to the frame
        frame.add(panel);

        // Making  the frame visible
        frame.setVisible(true);
    }
}
