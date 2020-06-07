package readwrite.read;

import Netflix.shows.Seasons;
import Netflix.shows.Series;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeriesReader extends Reader<Series>{

    private static List<Series> seriesList = new ArrayList<Series>();

    public static void readData() {

        SeriesReader seriesReader = new SeriesReader();
        seriesList = seriesReader.readAndCreateObjects("D:\\Uni\\II\\Sem2\\PAO\\Proiect\\src\\readwrite\\resource\\Series.csv");

        for (Series series : seriesList) {
            System.out.println(series);
        }
    }

    public static List<Series> getSeriesList() {
        return Collections.unmodifiableList(seriesList);
    }

    @Override
    Series createObject(String[] objectDetails) {
        SeasonReader seasonsReader = new SeasonReader();
        SeasonReader.readData();
        ArrayList<Seasons> seasonsArrayList = new ArrayList<>(SeasonReader.getSeasonsList());

        return new Series(objectDetails[0], objectDetails[1], objectDetails[2], objectDetails[3], Integer.parseInt(objectDetails[4]),
                seasonsArrayList);
    }
}
