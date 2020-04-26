package Netflix;

import Netflix.Membership.Client;
import Netflix.Shows.Films;
import Netflix.Shows.MiniSeries;
import Netflix.Shows.MyList;
import Netflix.Shows.Series;
import readwrite.read.ClientReader;
import readwrite.read.FilmsReader;
import readwrite.read.MiniSeriesReader;
import readwrite.read.SeriesReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

      /*  Films movie = new Films("Good Will Hunting", "Gus Van Sant", "Affleck and Damon", "Miramax Films", "Be Gentlemen", 126, 5, 20);
        System.out.println(movie.toString());
        Menu(movie);*/

        ClientReader clientReader = new ClientReader();
        ClientReader.readData();
        Client client = ClientReader.getClientList().get(0);
        System.out.println(client.toString());

        FilmsReader filmsReader = new FilmsReader();
        FilmsReader.readData();
        ArrayList<Films> films = new ArrayList<Films>(FilmsReader.getFilmsList());


        MiniSeriesReader miniSeriesReader = new MiniSeriesReader();
        MiniSeriesReader.readData();
        ArrayList<MiniSeries> miniSeries = new ArrayList<MiniSeries>(MiniSeriesReader.getMiniSeriesList());

        SeriesReader seriesReader = new SeriesReader();
        SeriesReader.readData();
        ArrayList<Series> series  = new ArrayList<Series>(SeriesReader.getSeriesList());

        MyList myList = new MyList(films, miniSeries, series);
        myList.viewDetails();



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

        in.close();
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
