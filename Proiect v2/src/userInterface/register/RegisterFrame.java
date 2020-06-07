package userInterface.register;


import javax.swing.*;


/**
 * @author: cati
 */
public class RegisterFrame {

    public static void main(String[] args) {
        RegisterForm registerForm = new RegisterForm();
        registerForm.setTitle("Register");
        registerForm.setVisible(true);
        registerForm.setBounds(100, 50, 370, 700);
        registerForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerForm.setResizable(false);

    }
}
