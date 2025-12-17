// J77-5082-2023 TIMOTHY MUTUA
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarExample {
    public static void main(String[] args) {
        //main frame
        JFrame frame = new JFrame("Menu Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        //menu bar
        JMenuBar menuBar = new JMenuBar();

        //"File" menu
        JMenu fileMenu = new JMenu("File");

        //items for the "File" menu
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listener for "Exit"
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });

    
        newItem.addActionListener(e -> System.out.println("New selected"));
        openItem.addActionListener(e -> System.out.println("Open selected"));

        //menu items to the "File" menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); //separator line
        fileMenu.add(exitItem);

        // Adding the "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Making the frame visible
        frame.setVisible(true);
    }
}
