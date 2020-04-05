package Netflix.Shows;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MyList {

    private ArrayList<Films> films;
    private ArrayList<MiniSeries> miniSeries;
    private ArrayList<Series> series;

    public MyList(ArrayList<Films> films, ArrayList<MiniSeries> miniSeries, ArrayList<Series> series) {
        this.films = new ArrayList<>(films);
        this.miniSeries = new ArrayList<>(miniSeries);
        this.series = new ArrayList<>(series);
    }

    public MyList(MyList myList_) {
        this.films = new ArrayList<>(myList_.films);
        this.miniSeries = new ArrayList<>(myList_.miniSeries);
        this.series = new ArrayList<>(myList_.series);
    }

    public MyList() {

    }

    public ArrayList<Films> getFilms() {
        return films;

    }

    public void setFilms(ArrayList<Films> films) {
        this.films = films;
    }

    public ArrayList<MiniSeries> getMiniSeries() {
        return miniSeries;
    }

    public void setMiniSeries(ArrayList<MiniSeries> miniSeries) {
        this.miniSeries = miniSeries;
    }

    public ArrayList<Series> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Series> series) {
        this.series = series;
    }

    public void addFilms(Films film) {
        films.add(film);
    }

    public void addSeries(Series series_) {
        series.add(series_);
    }

    public void addMiniSeries(MiniSeries miniSeries_) {
        miniSeries.add(miniSeries_);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "films=" + films +
                ", miniSeries=" + miniSeries +
                ", series=" + series +
                '}';
    }

    public void viewDetails() {
        System.out.println("Films: ");
        for (int i = 0 ; i < films.size(); i++) {
            System.out.println(films.get(i).toString());
        }

        System.out.println("MiniSeries: ");
        for (int i = 0; i < miniSeries.size(); i++){
           miniSeries.get(i).prints();
        }

        System.out.println("Series: ");
        for (int i = 0; i < series.size(); i++){
            series.get(i).prints();
        }
    }

}