package hms;
import javax.swing.*;
import java.awt.*;

public class login {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Login");

        // Set frame properties
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // User ID label
        JLabel userLabel = new JLabel("User ID:");
        userLabel.setBounds(50, 40, 100, 25);
        panel.add(userLabel);

        // User ID field
        JTextField userField = new JTextField();
        userField.setBounds(150, 40, 180, 25);
        panel.add(userField);

        // Password label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 80, 100, 25);
        panel.add(passwordLabel);

        // Password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 80, 180, 25);
        panel.add(passwordField);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 125, 90, 30);
        panel.add(loginButton);

        // Login button action
        loginButton.addActionListener(e -> {

            String userId = userField.getText();
            String password = new String(passwordField.getPassword());

           // Add or call the class to validate username and password in the database.
            System.out.println("Entered username is: "+userId);
            System.out.println("Entered password is: "+password);
            
            
        });

        // Add panel to frame
        frame.add(panel);

        // Display frame
        frame.setVisible(true);
    }
}