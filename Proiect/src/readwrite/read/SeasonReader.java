package readwrite.read;

import Netflix.Shows.Episodes;
import Netflix.Shows.Seasons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonReader extends Reader<Seasons> {

    private static List<Seasons> seasonsList = new ArrayList<>();

    public static void readData() {

        SeasonReader seasonReader = new SeasonReader();
        seasonsList = seasonReader.readAndCreateObjects("C:\\Users\\Cati\\Desktop\\Uni\\II\\Sem2\\PAO\\Proiect\\src\\readwrite\\resource\\Seasons,csv");

        for (Seasons seasons : seasonsList) {
            System.out.println(seasons);
        }
    }

    public static List<Seasons> getSeasonsList() {
        return Collections.unmodifiableList(seasonsList);
    }
    @Override
    Seasons createObject(String[] objectDetails) {
        EpisodesReader episodesReader = new EpisodesReader();
        EpisodesReader.readData();
        ArrayList<Episodes> episodesArrayList = new ArrayList<Episodes>(EpisodesReader.getEpisodesList());

        return new Seasons(Integer.parseInt(objectDetails[0]), Integer.parseInt(objectDetails[2]),
                episodesArrayList);
    }
}
