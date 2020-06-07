package readwrite.read;

import Netflix.shows.Episodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EpisodesReader extends Reader<Episodes> {

    private static List<Episodes> episodesList = new ArrayList<Episodes>();

    public static void readData() {
        EpisodesReader episodesReader = new EpisodesReader();

        episodesList = episodesReader.readAndCreateObjects("D:\\Uni\\Sem2\\II\\PAO\\Proiect\\src\\readwrite\\resource\\Episodes.csv");

        for (Episodes episodes : episodesList) {
            System.out.println(episodes);
        }
    }

    public static List<Episodes> getEpisodesList() {
        return Collections.unmodifiableList(episodesList);
    }

    @Override
    Episodes createObject(String[] objectDetails) {
        return new Episodes(Integer.parseInt(objectDetails[0]), objectDetails[1],
                Integer.parseInt(objectDetails[2]), Float.parseFloat(objectDetails[3]), Float.parseFloat(objectDetails[4]));
    }
}
