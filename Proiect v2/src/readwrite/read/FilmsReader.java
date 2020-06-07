package readwrite.read;

import Netflix.shows.Films;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilmsReader extends Reader<Films> {

    private static List<Films> filmsList = new ArrayList<Films>();

    public static void readData() {

        FilmsReader filmsReader = new FilmsReader();

        filmsList = filmsReader.readAndCreateObjects("D:\\Uni\\Sem2\\PAO\\Proiect\\src\\readwrite\\resource\\Films.csv");

        for (Films film : filmsList) {
            System.out.println(film);
        }
    }

    public static List<Films> getFilmsList() {
        return Collections.unmodifiableList(filmsList);
    }

    @Override
    Films createObject(String[] objectDetails) {
        return new Films(objectDetails[0], objectDetails[1], objectDetails[2], objectDetails[3], objectDetails[4],
                Integer.parseInt(objectDetails[5]), Float.parseFloat(objectDetails[6]), Float.parseFloat(objectDetails[7]));
    }
}
