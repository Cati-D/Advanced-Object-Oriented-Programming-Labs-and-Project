package Netflix.shows;

import java.util.ArrayList;

public class MiniSeries extends Episodes{

    private String name;
    private String director;
    private String writer;
    private int numberOfPart;
    private ArrayList<Episodes> episodes;
    private String star;

    public MiniSeries( String name, String director, String writer, int numberOfPart, String star) {
        this.name = name;
        this.director = director;
        this.writer = writer;
        this.numberOfPart = numberOfPart;
        this.episodes = new ArrayList<Episodes>();
        this.star = star;
    }

    public MiniSeries(String name, String director, String writer, int numberOfPart, String star, ArrayList<Episodes> episodes) {
        this.name = name;
        this.director = director;
        this.writer = writer;
        this.numberOfPart = numberOfPart;
        this.episodes = new ArrayList<Episodes>(episodes);
        this.star = star;
    }

    public void addEpisodes(Episodes episode) {
        episodes.add(episode);
    }

    public MiniSeries() {

    }

    public String getNameOfMiniSeries() {
        return name;
    }

    public void setNameForMiniSeries(String name) {
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

    public int getNumberOfPart() {
        return numberOfPart;
    }

    public void setNumberOfPart(int numberOfPart) {
        this.numberOfPart = numberOfPart;
    }

    public ArrayList<Episodes> getEpisodes() {
        return episodes;
    }

    public String getStar() {
        return star;
    }

    public void setStars(String star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "MiniSeries{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", numberOfPart=" + numberOfPart +
                //", episodes=" + Arrays.toString(episodes) +
                ", star='" + star + '\'' +
                '}';
    }

    public void prints() {
        System.out.println("MiniSeries{" +
                "name='" + name +
                ", director='" + director +
                ", writer='" + writer +
                ", numberOfPart=" + numberOfPart + ", episodes = ");
        for (int i = 0; i < episodes.size(); i++) {
            System.out.println(episodes.get(i).toString());
        }
    }

    @Override
    protected void nextEpisode() {
        super.nextEpisode();
        if (this.numberOfPart == this.number){
            System.out.println("Written by " + this.writer + '\'' +
                    "Directed by " + this.director + '\'' +
                    "The end.");
        }
    }

    @Override
    public void skip() {
        super.skip();

    }

    @Override
    public void back() {
        super.back();
        if (this.currentMinute == 0) {
            System.out.println(this.star + " in " + '\'' +
                    this.name + '\'');
        }
    }

    @Override
    public void refresh() {
        super.refresh();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }
}
