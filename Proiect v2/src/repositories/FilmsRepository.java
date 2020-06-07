package repositories;

import Netflix.membership.Client;
import Netflix.shows.Films;
import connectivity.DataBaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author: cati
 */
public class FilmsRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<Films> getAllFilms() {
        ArrayList<Films> films = new ArrayList<>();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from films_data");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Films film = new Films(rs.getString("name_movie"),
                        rs.getString("director"),
                        rs.getString("writer"),
                        rs.getString("film_studio"),
                        rs.getString("production"),
                        rs.getInt("number_minutes"),
                        rs.getInt("current_minute"),
                        rs.getInt("current_second"));
                films.add(film);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return films;
    }

    public void saveFilm(Films film) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into films_data " +
                    "(name_movie, director, writer, film_studio, production, number_minutes, current_minutes, currrent_seconds) " +
                    "values(?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, film.getName());
            statement.setString(2, film.getDirector());
            statement.setString(3, film.getWriter());
            statement.setString(4, film.getFilmStudio());
            statement.setString(5, film.getProduction());
            statement.setString(6, String.valueOf(film.getNumberOfMinutes()));
            statement.setString(7, String.valueOf(film.getCurrentMinute()));
            statement.setString(8, String.valueOf(film.getCurrentSecond()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFilm(Films film) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from films_data where name_movie = ?");
            statement.setString(1, film.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Films> getFilmsByClient(Client client) {
        ArrayList<Films> films = new ArrayList<>();

        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from films_data where email = ?");
            statement.setString(1, client.getEmailAddress());
            ResultSet rs = statement.executeQuery();
            //VEZI DACA LASI ASTA AICI SAU NU

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  films;
    }

    public void addToMyListRepository(Films films) {

    }

}
