package Netflix.Shows;

public class Episodes extends Commands{

    protected int number;
    protected String name;

    public Episodes(int number, String name, int numberOfMinutes, float currentMinute, float currentSecond) {
        super(numberOfMinutes, currentMinute, currentSecond);
        this.number = number;
        this.name = name;
    }

    public Episodes() {
        super();
    }

    public Episodes(Episodes episodesData) {
        this.number = episodesData.number;
        this.name = episodesData.name;
        this.currentSecond = episodesData.currentSecond;
        this.currentMinute = episodesData.currentMinute;
        this.numberOfMinutes = episodesData.numberOfMinutes;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void nextEpisode() {
        this.number++;
    }

    @Override
    public void skip() {
        super.skip();
        if (this.currentMinute == this.numberOfMinutes) {
            System.out.println("Next episode.");
        }
    }

    @Override
    public void back() {
        super.back();
        if (this.currentMinute == 0) {
            System.out.println("You are at the beginning of the episode.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Episodes{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

