package userInterface;

import Netflix.membership.Client;

import javax.swing.*;

/**
 * @author: cati
 */
public class MainPageFrame  {
    public void showMainPage(Client client) {
        MainPage frame = new MainPage(client);
        frame.setTitle("Main Page");
        frame.setVisible(true);
        frame.setBounds(100, 50, 370, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

}

/**/
