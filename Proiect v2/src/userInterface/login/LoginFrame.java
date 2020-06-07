package userInterface.login;

import javax.swing.*;

/**
 * @author: cati
 */
public class LoginFrame {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setTitle("Login");
        loginForm.setVisible(true);
        loginForm.setBounds(100, 50, 370, 700);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginForm.setResizable(false);
    }
}
