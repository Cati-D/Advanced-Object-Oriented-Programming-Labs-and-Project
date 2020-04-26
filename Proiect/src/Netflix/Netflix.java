package Netflix;

import Netflix.Membership.Client;
import Netflix.Shows.Films;
import Netflix.Shows.MiniSeries;
import Netflix.Shows.MyList;
import Netflix.Shows.Series;
import Netflix.viewMode.DesktopApplication;
import Netflix.viewMode.MobileApplication;
import Netflix.viewMode.Web;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Netflix {

    public MobileApplication mobileApplication;
    public Web web;
    public DesktopApplication desktopApplication;

/*    protected Netflix() throws FileNotFoundException {

        //read the films
        ArrayList<Films> filmsStack = null;
        File FilmsList = new File("src/films.txt");
        Scanner filmsList = new Scanner(FilmsList);

        while (filmsList.hasNextLine()) {
            String temp = filmsList.nextLine();
            String[] data = temp.split(";");
            Films filmsData = new Films(data[0], data[1], data[2], data[3], data[4],
                    Integer.parseInt(data[5]),Float.parseFloat(data[6]), Float.parseFloat(data[7]));
            filmsStack.add(new Films(filmsData)) ;
        }

        filmsList.close();


        //1.read episodes
        ArrayList<Episodes> episodesStack = null;
        File EpisodesList = new File("src/episodes.txt");
        Scanner episodesList = new Scanner(EpisodesList);
        int indexEpisodes = 0;

        while (episodesList.hasNextLine()) {
            String temp = episodesList.nextLine();
            String[] data = temp.split(";");
            Episodes episodesData = new Episodes(Integer.parseInt(data[0]), data[1],
                    Integer.parseInt(data[2]), Float.parseFloat(data[3]), Float.parseFloat(data[4]));
            episodesStack.add(new Episodes(episodesData));
            indexEpisodes++;
        }

        episodesList.close();

        //2.read seasons
        ArrayList<Seasons> seasonsStack = null;
        File SeasonsList = new File("src/seasons.txt");
        Scanner seasonsList = new Scanner(SeasonsList);

        while (seasonsList.hasNextLine()) {
            String temp = seasonsList.nextLine();
            String[] data = temp.split(";");
            Seasons seasonsData = new Seasons(Integer.parseInt(data[0]), Integer.parseInt(data[2]));
            for (int i = 0; i < seasonsData.getNumberOfEpisodes(); i++){
                seasonsData.addEpisodes(new Episodes(episodesStack.get(i)));
            }
            seasonsStack.add(new Seasons(seasonsData));
        }

        seasonsList.close();

        //Now, that we have the episodes and the seasons, we can read the series
        //3.read Series
        ArrayList<Series> seriesStack = null;
        int indexSeasons = 0;
        File SeriesList = new File("src/series.txt");
        Scanner seriesList = new Scanner(SeriesList);

        while (seriesList.hasNextLine()) {
            String temp = seriesList.nextLine();
            String[] data = temp.split(";");
            Series seriesData = new Series(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]));
            for (int i = 0; i < seriesData.getNumberOfSeasons(); i++){
                seriesData.addSeasons(new Seasons(seasonsStack.get(i)));
            }
            seriesStack.add(new Series(seriesData));
        }

        seriesList.close();

        //read MiniSeries
        ArrayList<MiniSeries> miniSeriesStack = null;
        File MiniSeriesList = new File("src/miniSeries.txt");
        Scanner miniSeriesList = new Scanner(MiniSeriesList);

        while (miniSeriesList.hasNextLine()) {
            String temp = miniSeriesList.nextLine();
            String[] data = temp.split(";");
            MiniSeries miniSeriesData = new MiniSeries(data[0], data[1], data[2], Integer.parseInt(data[3]), data[4]);
            for (int i = 0; i < miniSeriesData.getNumberOfPart(); i++) {
                miniSeriesData.addEpisodes(new Episodes(episodesStack.get(indexEpisodes)));
                indexEpisodes++;
            }
        }

        miniSeriesList.close();

        //read Client
        ArrayList<Client> clientStack = null;
        File ClientsInformation = new File("src/client.txt");
        Scanner clientsInformation = new Scanner(ClientsInformation);

        while (clientsInformation.hasNextLine()) {
            String temp = clientsInformation.nextLine();
            String[] data = temp.split("; ");
            Client clientData = new Client(data[0], data[1], data[2],
                    new CreditCard(data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6], data[7], data[8]),
                    new Plans(data[9], Float.parseFloat(data[10]), Integer.parseInt(data[11]), Integer.parseInt(data[12]), data[13]));
            clientStack.add(new Client(clientData));

        }

        clientsInformation.close();

        //create MyList
        MyList myList = new MyList(filmsStack, miniSeriesStack, seriesStack);

        File webInfo = new File("src/web.txt");
        Scanner webNewInfo = new Scanner(webInfo);
        while (webNewInfo.hasNextLine()) {
            String temp = webNewInfo.next();
            String[] data = temp.split(";");
            web = new Web(data[0], clientStack, myList);
           desktopApplication = new DesktopApplication(data[0], Float.parseFloat(data[1]), data[2],
                    clientStack, myList);
           mobileApplication = new MobileApplication(data[0], Float.parseFloat(data[3]), clientStack,
                    myList);

        }

        webNewInfo.close();

    }*/

    public MyList createMyList(ArrayList<Films> films, ArrayList<Series> series, ArrayList<MiniSeries> miniSeries) {
        MyList myList = new MyList(films, miniSeries, series);
        return myList;
    }

    public void webInfo(ArrayList<Client> clientStack, MyList myList) throws FileNotFoundException {
        File webInfo = new File("src/web.txt");
        Scanner webNewInfo = new Scanner(webInfo);
        while (webNewInfo.hasNextLine()) {
            String temp = webNewInfo.next();
            String[] data = temp.split(";");
            web = new Web(data[0], clientStack, myList);
            desktopApplication = new DesktopApplication(data[0], Float.parseFloat(data[1]), data[2],
                    clientStack, myList);
            mobileApplication = new MobileApplication(data[0], Float.parseFloat(data[3]), clientStack,
                    myList);
        }
    }


    public void view() {
        System.out.println("Netflix{" +
                "mobileApplication= ");
        mobileApplication.prints();
        System.out.println(", web= ");
        web.prints();
        System.out.println(", desktopApplication=");
        desktopApplication.prints();

    }

    public MobileApplication getMobileApplication() {
        return mobileApplication;
    }

    public Web getWeb() {
        return web;
    }

    public DesktopApplication getDesktopApplication() {
        return desktopApplication;
    }

}
