package repositories;

import Netflix.shows.Episodes;
import Netflix.shows.MiniSeries;
import connectivity.DataBaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author: cati
 */
public class MiniSeriesRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<MiniSeries> getAllMiniseries() {
        ArrayList<MiniSeries> miniSeries = new ArrayList<>();

        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from miniseries_data");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                MiniSeries miniSeries_ = new MiniSeries(rs.getString("name_miniseries"),
                        rs.getString("director"),
                        rs.getString("writer"),
                        rs.getInt("number_parts"),
                        rs.getString("star"),
                        new ArrayList<Episodes> (Collections.singleton(new Episodes(rs.getInt("number_episode"),
                                rs.getString("name_episode"),
                                rs.getInt("number_minutes"),
                                rs.getFloat("current_minute"),
                                rs.getFloat("current_second")))));
                miniSeries.add(miniSeries_);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return miniSeries;
    }

    public void saveMiniSeries(MiniSeries miniSeries) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into minieries_data " +
                    "(name_miniseries, director, writer, number_parts, star)," +
                    "(number_episode, name_episode, number_minutes, current_minute, current_second)" +
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, miniSeries.getNameOfMiniSeries());
            statement.setString(2, miniSeries.getDirector());
            statement.setString(3, miniSeries.getWriter());
            statement.setInt(4, miniSeries.getNumberOfPart());
            statement.setString(5, miniSeries.getStar());
            statement.setInt(6, miniSeries.getNumber());
            statement.setString(7, miniSeries.getName());
            statement.setInt(8, miniSeries.getNumberOfMinutes());
            statement.setFloat(9, miniSeries.getCurrentMinute());
            statement.setFloat(8, miniSeries.getCurrentSecond());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateMiniSeriesNumberOfEpisodes(Episodes episode, String nameOfMiniSeries) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("update number_parts =? and " +
                    "(number_episode, name_episode)" +
                    " for miniseries_data where name_miniseries = ?");
            statement.setString(4, nameOfMiniSeries);
            statement.setInt(1, episode.getNumber());
            statement.setInt(2, episode.getNumber());
            statement.setString(3, episode.getName());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMiniSeries(MiniSeries miniSeries) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from miniseries_data where name_miniseries = ?");
            statement.setString(1, miniSeries.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
