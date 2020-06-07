package readwrite.read;

import Netflix.shows.Episodes;
import Netflix.shows.MiniSeries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniSeriesReader extends Reader<MiniSeries> {

    private static List<MiniSeries> miniSeriesList = new ArrayList<MiniSeries>();

    public static void readData() {

        MiniSeriesReader miniSeriesReader = new MiniSeriesReader();

        miniSeriesList = miniSeriesReader.readAndCreateObjects("D:\\Uni\\II\\Sem2\\PAO\\Proiect\\src\\readwrite\\resource\\MiniSeries.csv");

        for (MiniSeries miniSeries : miniSeriesList) {
            System.out.println(miniSeries);
        }
    }

    public static List<MiniSeries> getMiniSeriesList() {
        return Collections.unmodifiableList(miniSeriesList);
    }

    @Override
    MiniSeries createObject(String[] objectDetails) {
        EpisodesReader episodesReader = new EpisodesReader();
        EpisodesReader.readData();
        ArrayList<Episodes> episodesArrayList = new ArrayList<Episodes>(EpisodesReader.getEpisodesList());

        return new MiniSeries(objectDetails[0], objectDetails[1], objectDetails[2], Integer.parseInt(objectDetails[3]), objectDetails[4],
                episodesArrayList);
    }
}
