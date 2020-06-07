package repositories;

import Netflix.shows.Episodes;
import Netflix.shows.Seasons;
import Netflix.shows.Series;
import connectivity.DataBaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: cati
 */
public class SeriesRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<Series> getAllSeries() {
        ArrayList<Series> series = new ArrayList<>();

        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from series_data");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Series series_ = new Series(rs.getString("name_series"),
                        rs.getString("director"),
                        rs.getString("writer"),
                        rs.getString("star"),
                        rs.getInt("number_seasons"),
                        new ArrayList<Seasons> (Collections.singleton(new Seasons(rs.getInt("number_episodes"),
                                rs.getInt("number_parts"),
                                new ArrayList<Episodes> (Collections.singleton(new Episodes(rs.getInt("number_episode"),
                                        rs.getString("name_episode"),
                                                rs.getInt("number_minutes"),
                                        rs.getFloat("current_minute"),
                                        rs.getFloat("current_second"))))))));

                series.add(series_);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return series;
    }

    public void saveSeries(Series series) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into series " +
                    "(name_series, director, writer, star, number_parts)," +
                    "(number_episodes, number_season)" +
                    "(number_eps, name_eps, number_minutes, current_minute, current_second)" +
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, series.getNameOfSeries());
            statement.setString(2, series.getDirector());
            statement.setString(3, series.getWriter());
            statement.setString(4, series.getStar());
            statement.setInt(5, series.getNumberOfSeasons());
            statement.setInt(6, series.getNumberOfEpisodes());
            statement.setInt(7, series.getNumberOfSeason());
            statement.setInt(8, series.getNumber());
            statement.setString(9, series.getName());
            statement.setInt(10, series.getNumberOfMinutes());
            statement.setFloat(11, series.getCurrentMinute());
            statement.setFloat(12, series.getCurrentSecond());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSeriesNumberOfSeasons(Seasons seasons, String nameOfSeries) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("update number_parts =? and " +
                    "(number_episodes, number_season)" +
                    " for series where name_series = ?");
            statement.setString(4, nameOfSeries);
            statement.setInt(2, seasons.getNumberOfEpisodes());
            statement.setInt(1, seasons.getNumberOfSeason() + 1);
            statement.setInt(3, seasons.getNumberOfSeason());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSeries(Series series) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from series where name_series = ?");
            statement.setString(1, series.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
