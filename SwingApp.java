//J77-5082-2023 TIMOTHY MUTUA
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {
    public static void main(String[] args) {
        // Main Frame
        JFrame frame = new JFrame("Java Swing Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(240, 240, 240));

        //MENU BAR
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(220, 220, 220));

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        //MAIN PANEL (Holds everything)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(240, 240, 240));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        //Row 1: Name and Username
        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        row1.setBackground(new Color(240, 240, 240));
        row1.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(10);
        nameField.setText("Alice");
        row1.add(nameField);
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(200, 220, 240));
        row1.add(submitButton);

        row1.add(Box.createHorizontalStrut(30));

        row1.add(new JLabel("Username:"));
        JTextField userField = new JTextField(10);
        row1.add(userField);
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(200, 220, 240));
        row1.add(loginButton);

        // Row 2: Checkbox, Radio, Combo
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        row2.setBackground(new Color(240, 240, 240));
        JCheckBox termsCheck = new JCheckBox("Accept Terms");
        row2.add(termsCheck);
        JRadioButton maleRadio = new JRadioButton("Male");
        row2.add(maleRadio);
        JComboBox<String> combo = new JComboBox<>(new String[]{"Java", "Python", "C++"});
        combo.setSelectedItem("Java");
        row2.add(combo);

        // Row 3: Click Me Button
        JPanel row3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        row3.setBackground(new Color(240, 240, 240));
        JButton clickButton = new JButton("Click Me");
        clickButton.setBackground(new Color(220, 240, 220));
        clickButton.setFont(new Font("Arial", Font.BOLD, 12));
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked !");
            }
        });
        row3.add(clickButton);

        //Row 4: Calculator Grid (4x3) 
        JPanel row4 = new JPanel(new GridLayout(4, 3, 5, 5));
        row4.setBackground(new Color(220, 220, 220));
        row4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        String[][] buttons = {
            {"7", "8", "9"},
            {"4", "5", "6"},
            {"1", "2", "3"},
            {"0", "-", "+"}
        };
        for (String[] row : buttons) {
            for (String text : row) {
                JButton btn = new JButton(text);
                btn.setBackground(new Color(250, 250, 250));
                btn.setFont(new Font("Arial", Font.BOLD, 14));
                row4.add(btn);
            }
        }

        // Add rows to main panel
        mainPanel.add(row1);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(row2);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(row3);
        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(row4);

        //Add to frame
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}