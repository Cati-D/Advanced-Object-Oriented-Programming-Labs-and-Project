package Netflix.Shows;

public class Films extends Commands{

    private String name;
    private String director;
    private String writer;
    private String filmStudio;
    private String production;

    public Films(String name, String director, String writer, String filmStudio, String production,
                 int numberOfMinutes, float currentMinute, float currentSecond) {
        super(numberOfMinutes, currentMinute, currentSecond);
        this.name = name;
        this.director = director;
        this.writer = writer;
        this.filmStudio = filmStudio;
        this.production = production;
    }

    public Films() {
    }

    public Films(Films filmsData) {
        this.director = filmsData.director;
        this.name = filmsData.name;
        this.writer = filmsData.writer;
        this.filmStudio = filmsData.filmStudio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String getFilmStudio() {
        return filmStudio;
    }

    public void setFilmStudio(String filmStudio) {
        this.filmStudio = filmStudio;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Films{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", filmStudio='" + filmStudio + '\'' +
                ", production='" + production + '\'' +
                '}' + super.toString();
    }

    @Override
    public void skip() {
        super.skip();
        if (this.currentMinute == this.numberOfMinutes) {
            System.out.println("Written by " + this.writer + '\'' +
                    "Directed by " + this.director + '\'' +
                    "The end.");
        }
    }

    @Override
    public void back() {
        super.back();
        if (this.currentMinute == 0) {
            System.out.println(this.filmStudio + " present " + '\'' +
                    "a" + this.production + "production" + '\'' +
                    this.name + '\'');
        }
    }

}
