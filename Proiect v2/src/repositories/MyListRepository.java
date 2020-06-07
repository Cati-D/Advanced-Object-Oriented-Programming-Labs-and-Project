package repositories;

import Netflix.shows.MyList;
import connectivity.DataBaseConnection;

/**
 * @author: cati
 */
public class MyListRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public MyList getMyList() {
        MyList myList = new MyList();

        return myList;
    }

    /*
    public Films getFilmsByName(String name_films) {

    }

    public MiniSeries getMiniSeriesByName(String name_miniseries) {

    }

    public Series getSeriesByName(String name_series) {

    }*/
}

 /*       try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from mylist_data ");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                try {
                    Films film = new Films(rs.getString("name_movie"),
                            rs.getString("director"),
                            rs.getString("writer"),
                            rs.getString("film_studio"),
                            rs.getString("production"),
                            rs.getInt("number_minutes"),
                            rs.getInt("current_minute"),
                            rs.getInt("current_second"));
                    films.add(film);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
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
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
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
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
        e.printStackTrace();
    }

}*/

            /*while (rs.next()) {
                MyList myList = new MyList(new ArrayList<Films>(Collections.singleton(new Films(rs.getString("name_movie"),
                        rs.getString("name_director"),
                        rs.getString("name_writer"),
                        rs.getString("film_studio"),
                        rs.getString("production"),
                        rs.getInt("number_minutes"),
                        rs.getFloat("current_minute"),
                        rs.getFloat("current_second")))),
                        new ArrayList<MiniSeries>(Collections.singleton(new MiniSeries(rs.getString("name_miniseries"),
                                rs.getString("director"),
                                rs.getString("writer"),
                                rs.getInt("number_parts"),
                                rs.getString("star"),
                                new ArrayList<Episodes>(Collections.singleton(new Episodes(rs.getInt("number_episode"),
                                        rs.getString("name_episode"),
                                        rs.getInt("number_minutes"),
                                        rs.getFloat("current_minute"),
                                        rs.getFloat("cureent_second"))))))),
                        new ArrayList<Series>(Collections.singleton(new Series(rs.getString("name_series"),
                                rs.getString("director"),
                                rs.getString("writer"),
                                rs.getString("star"),
                                rs.getInt("number_parts"),
                                new ArrayList<Seasons>(Collections.singleton(new Seasons(rs.getInt("number_episodes"),
                                        rs.getInt("number_season"),
                                        new ArrayList<Episodes>(Collections.singleton(new Episodes(rs.getInt("number_episode"),
                                                rs.getString("name_episode"),
                                                rs.getInt("number_minutes"),
                                                rs.getFloat("current_minute"),
                                                rs.getFloat("cureent_second")))))))))));
            }*/


