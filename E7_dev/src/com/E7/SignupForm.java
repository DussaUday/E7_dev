package com.E7;

import javax.swing.*;
import java.awt.*;

public class SignupForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public SignupForm() {
        setTitle("Signup Interface");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Signup");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(160, 20, 100, 30);
        panel.add(titleLabel);

        JLabel userLabel = new JLabel("New Username:");
        userLabel.setBounds(50, 70, 100, 25);
        panel.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(160, 70, 180, 25);
        panel.add(usernameField);

        JLabel passLabel = new JLabel("New Password:");
        passLabel.setBounds(50, 110, 100, 25);
        panel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 110, 180, 25);
        panel.add(passwordField);

        JButton signupButton = new JButton("Signup");
        signupButton.setBounds(130, 160, 120, 30);
        panel.add(signupButton);

        add(panel);

        signupButton.addActionListener(e -> {
            String newUser = usernameField.getText();
            String newPass = new String(passwordField.getPassword());

            if(newUser.isEmpty() || newPass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
            } else {
                JOptionPane.showMessageDialog(this, "Signup Successful! Now login.");
                new LoginForm().setVisible(true);
                this.dispose();
            }
        });
    }
}