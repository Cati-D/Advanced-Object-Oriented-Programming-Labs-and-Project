package userInterface.register;

import Netflix.membership.Client;
import Netflix.membership.CreditCard;
import Netflix.membership.Plans;
import services.ClientServiceImpl;
import userInterface.login.LoginForm;
import userInterface.login.LoginFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author: cati
 */
public class RegisterForm extends JFrame implements ActionListener {
    Container container = getContentPane();
    private JLabel lastNameLabel = new JLabel("Last Name");
    private JLabel firstNameLabel = new JLabel("First Name");
    private JLabel emailLabel = new JLabel("Surname");
    private JLabel passwordLabel = new JLabel("Password");
    private JLabel cardTypeLabel = new JLabel("Card Type");
    private JLabel cardNumberLabel = new JLabel("Card Number");
    private JLabel cvvLabel = new JLabel("CVV");
    private JLabel nameClientLabel = new JLabel("Name");
    private JLabel addressLabel = new JLabel("Address");
    private JLabel countryLabel = new JLabel("Country");
    private JLabel namePlanLabel = new JLabel("Name of plan");
    private JLabel pricePlanLabel = new JLabel("Price of the plan");
    private JLabel numberMembersLabel = new JLabel("Number of Members");
    private JLabel numberScreensLabel = new JLabel("Number of screen");
    private JLabel resolutionLabel = new JLabel("Resolution");

    JTextField lastNameTextField = new JTextField();
    JTextField firstNameTextField = new JTextField();
    JTextField emailTextField = new JTextField();
    JTextField passwordTextField = new JTextField();
    JTextField cardTypeTextLabel = new JTextField();
    JTextField cardNumberTextField = new JTextField();
    JTextField cvvTextField = new JTextField();
    JTextField nameClientTextField = new JTextField();
    JTextField addressTextField = new JTextField();
    JTextField countryTextField = new JTextField();
    JTextField namePlanTextField = new JTextField();
    JTextField priceTextField = new JTextField();
    JTextField numberMembersTextField = new JTextField();
    JTextField numberScreensTextField = new JTextField();
    JTextField resolutionTextField = new JTextField();

    JButton registerButton = new JButton("Register");
    JButton resetButton = new JButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JLabel loginLabel = new JLabel("Already have an account?");
    JButton loginButton = new JButton("Login");

    ClientServiceImpl clientService = new ClientServiceImpl();

    RegisterForm() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        lastNameLabel.setBounds(50, 50, 100, 30);
        firstNameLabel.setBounds(50, 50, 100, 30);
        emailLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 200, 100, 30);
        cardTypeLabel.setBounds(50, 50, 100, 30);
        cardNumberLabel.setBounds(50, 50, 100, 30);
        cvvLabel.setBounds(50, 50, 100, 30);
        nameClientLabel.setBounds(50, 50, 100, 30);
        addressLabel.setBounds(50, 50, 100, 30);
        countryLabel.setBounds(50, 50, 100, 30);
        namePlanLabel.setBounds(50, 50, 100, 30);
        pricePlanLabel.setBounds(50, 50, 100, 30);
        numberMembersLabel.setBounds(50, 50, 100, 30);
        numberScreensLabel.setBounds(50, 50, 100, 30);
        resolutionLabel.setBounds(50, 50, 100, 30);

        lastNameTextField.setBounds(150, 50, 150, 30);
        firstNameTextField.setBounds(150, 50, 150, 30);
        emailTextField.setBounds(150, 100, 150, 30);
        passwordTextField.setBounds(150, 200, 150, 30);
        cardNumberTextField.setBounds(50, 200, 150, 30);
        cardTypeTextLabel.setBounds(50, 200, 150, 30);
        cvvTextField.setBounds(50, 200, 150, 30);
        nameClientTextField.setBounds(150, 50, 150, 3);
        addressTextField.setBounds(150, 50, 150, 3);
        countryTextField.setBounds(150, 50, 150, 3);
        namePlanTextField.setBounds(150, 50, 150, 3);
        priceTextField.setBounds(150, 200, 150, 30);
        numberScreensTextField.setBounds(150, 200, 150, 30);
        numberMembersTextField.setBounds(150, 200, 150, 30);
        resolutionTextField.setBounds(150, 200, 150, 30);

        showPassword.setBounds(150, 360, 150, 30);
        registerButton.setBounds(50, 420, 100, 30);
        resetButton.setBounds(200, 420, 100, 30);
        loginLabel.setBounds(100, 500, 250, 30);
        loginButton.setBounds(130, 530, 100, 30);
    }

    public void addComponentsToContainer() {
        container.add(lastNameLabel);
        container.add(firstNameLabel);
        container.add(emailLabel);
        container.add(passwordLabel);
        container.add(cardNumberLabel);
        container.add(cardTypeLabel);
        container.add(cvvLabel);
        container.add(nameClientLabel);
        container.add(addressLabel);
        container.add(countryLabel);
        container.add(namePlanLabel);
        container.add(pricePlanLabel);
        container.add(numberMembersLabel);
        container.add(numberScreensLabel);
        container.add(resolutionLabel);
        container.add(showPassword);
        container.add(registerButton);
        container.add(resetButton);
        container.add(loginLabel);
        container.add(loginButton);
    }

    public void addActionEvent() {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == registerButton) {
            String lastNameText = lastNameTextField.getText();
            String firstNameText = firstNameTextField.getText();
            String emailText = emailTextField.getText();
            String passwordText = passwordTextField.getText();
            int numberOfCard = Integer.parseInt(cardNumberTextField.getText());
            String cardTypeText = cardTypeLabel.getText();
            int cvv = Integer.parseInt(cvvTextField.getText());
            String nameClientText = nameClientTextField.getText();
            String addressText = addressTextField.getText();
            String countryText = countryTextField.getText();
            String namePlanText = namePlanTextField.getText();
            float price = Float.parseFloat(priceTextField.getText());
            int numberOfMembers = Integer.parseInt(numberMembersTextField.getText());
            int numberOfScreen = Integer.parseInt(numberScreensTextField.getText());
            String resolutionText = resolutionTextField.getText();
            if (clientService.existingEmail(emailText)) {
                JOptionPane.showMessageDialog(this, "You already have an account with this email address.");
            } else {
                Client client = new Client(firstNameText, lastNameText, emailText, passwordText,
                        new CreditCard(cardTypeText, numberOfCard, cvv, nameClientText, addressText, countryText),
                        new Plans(namePlanText, price, numberOfMembers, numberOfScreen, resolutionText)); //AICI ADAUGA NOI CAMPURI PT PLAN CA SA FACI CLIET
                clientService.register(client);
                JOptionPane.showMessageDialog(this, "Registration successfully! Go to the login page!");
            }
            if (actionEvent.getSource() == resetButton) {
                emailTextField.setText("");
                passwordTextField.setText("");
            }
            /*if (actionEvent.getSource() == showPassword) {
                if (showPassword.isSelected()) {
                    passwordTextField.setEchoChar('*');
                } else {
                    passwordTextField.setEchoChar('*');
                }*/
            if (actionEvent.getSource() == loginButton) {
                dispose();
                LoginFrame.main(new String[0]);

            }
        }


    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(11, 2, new Insets(0, 0, 0, 0), -1, -1));
        lastNameLabel = new JLabel();
        lastNameLabel.setText("Last Name");
        panel1.add(lastNameLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        panel1.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 6, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        firstNameLabel = new JLabel();
        firstNameLabel.setText("First Name");
        panel1.add(firstNameLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        emailLabel = new JLabel();
        emailLabel.setText("email");
        panel1.add(emailLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        passwordLabel = new JLabel();
        passwordLabel.setText("password");
        panel1.add(passwordLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cardTypeLabel = new JLabel();
        cardTypeLabel.setText("card type");
        panel1.add(cardTypeLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cardNumberLabel = new JLabel();
        cardNumberLabel.setText("card number");
        panel1.add(cardNumberLabel, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cvvLabel = new JLabel();
        cvvLabel.setText("cvv");
        panel1.add(cvvLabel, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nameClientLabel = new JLabel();
        nameClientLabel.setText("name");
        panel1.add(nameClientLabel, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        addressLabel = new JLabel();
        addressLabel.setText("address");
        panel1.add(addressLabel, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        countryLabel = new JLabel();
        countryLabel.setText("country");
        panel1.add(countryLabel, new com.intellij.uiDesigner.core.GridConstraints(9, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        namePlanLabel = new JLabel();
        namePlanLabel.setText("name plan");
        panel1.add(namePlanLabel, new com.intellij.uiDesigner.core.GridConstraints(10, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }
}
