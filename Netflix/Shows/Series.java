package Netflix.Shows;

import java.util.ArrayList;
import java.util.Arrays;

public class Series extends Seasons{

    private String name;
    private String director;
    private String writer;
    private String star;
    protected int numberOfSeasons;
    protected ArrayList<Seasons> seasons;

    public Series(String name, String director, String writer, String star, int numberOfSeasons) {
        this.name = name;
        this.director = director;
        this.writer = writer;
        this.star = star;
        this.numberOfSeasons = numberOfSeasons;
        this.seasons = new ArrayList<Seasons>();
    }

    public Series() {
    }

    public Series(Series seriesData) {
        this.name = seriesData.name;
        this.director = seriesData.director;
        this.writer = seriesData.writer;
        this.star = seriesData.star;
        this.numberOfSeasons = seriesData.numberOfSeasons;
        this.seasons = new ArrayList<>(seriesData.seasons);
    }

    public void addSeasons(Seasons seasons_) {
        seasons.add(seasons_);
    }

    public String getNameOfSeries() {
        return name;
    }

    public void setNameForSeries(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public ArrayList<Seasons> getSeason() {
        return seasons;
    }


    @Override
    public String toString() {
        return super.toString() + "Series{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", star='" + star + '\'' +
                ", numberOfSeasons=" + numberOfSeasons +
                '}';
    }

    @Override
    public void prints() {
        super.prints();
        System.out.println("Series{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", star='" + star + '\'' +
                ", numberOfSeasons=" + numberOfSeasons);
        for (int i = 0; i < seasons.size(); i++) {
            Seasons seasons_ = new Seasons(seasons.get(i));
            seasons_.prints();
        }
    }

    @Override
    public void skip() {
        super.skip();
        if (this.numberOfSeasons == this.numberOfSeason) {
            System.out.println("Written by " + this.writer + '\'' +
                    "Directed by " + this.director + '\'' +
                    "The end.");
        }
    }

    @Override
    public void nextSeason() {
        super.nextSeason();
        if (this.numberOfSeasons == this.numberOfSeason) {
            System.out.println("Written by " + this.writer + '\'' +
                    "Directed by " + this.director + '\'' +
                    "The end.");
        }
    }
}
