package Netflix;

import Netflix.Shows.*;
import Netflix.viewMode.DesktopApplication;
import Netflix.viewMode.MobileApplication;
import Netflix.viewMode.Web;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.NumberFormatException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*try {
            Netflix netflix = new Netflix();
            System.out.println(netflix.getDesktopApplication());
            System.out.println(netflix.getMobileApplication());
            System.out.println(netflix.getWeb());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Select an action: ");
        System.out.println("1. Skip");
        System.out.println("2. Back");
        System.out.println("3. ");
    }*/

        Films movie = new Films("Good Will Hunting", "Gus Van Sant", "Affleck and Damon", "Miramax Films", "Be Gentlemen", 126, 5, 20);
        System.out.println(movie.toString());
        Menu(movie);


    }

    public static void Menu(Films filmsData) throws IOException{

        Scanner in = new Scanner(System.in);
        boolean input = true;
        listMenu();

        do {
            System.out.println("Enter your choice: ");
            String choice = in.nextLine();
            System.out.println();

            switch (choice.trim()) {
                case "1":
                    filmsData.skip();
                    break;
                case "2":
                    filmsData.back();
                    break;
                case "3":
                    filmsData.pause();
                    break;
                case "4":
                    filmsData.resume();
                    break;
                case "5" :
                    filmsData.refresh();
                    break;
                case "Q":
                    System.out.println("Have a nice day!");
                    input = false;
                    break;
                case "Menu":
                    listMenu();
                    break;
                default:
                    System.out.println("Error! Invalid input.");
            }
        }while(input);
    }

    public static void listMenu() {
        System.out.println("Welcome!\n");
        System.out.print("Pick an action for a movie: ");
        System.out.println();
        System.out.println("1. Skip.");
        System.out.println("2. Back.");
        System.out.println("3. Pause");
        System.out.println("4. Resume");
        System.out.println("5. Refresh.");

        System.out.println();
        System.out.println("To see the menu again type 'Menu'.");
        System.out.println("To exit the menu type 'Q'.");
        System.out.println();
    }
}
