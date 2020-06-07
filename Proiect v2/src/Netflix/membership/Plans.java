package Netflix.membership;

public class Plans {

    private String name;
    private float price;
    private int numberOfMembers;
    private int numberOfScreen;
    private String resolution;

    public Plans() {
    }

    public Plans(String name, float price, int numberOfMembers, int numberOfScreen, String resolution) {
        this.name = name;
        this.price = price;
        this.numberOfMembers = numberOfMembers;
        this.numberOfScreen = numberOfScreen;
        this.resolution = resolution;
    }

    public Plans(Plans plans) {
        this.name = plans.name;
        this.price = plans.price;
        this.numberOfMembers = plans.numberOfMembers;
        this.numberOfScreen = plans.numberOfScreen;
        this.resolution = plans.resolution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public int getNumberOfScreen() {
        return numberOfScreen;
    }

    public void setNumberOfScreen(int numberOfScreen) {
        this.numberOfScreen = numberOfScreen;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setDetails(String name)
    {
        if (name.equals("basic")) {
            price = (float)8.9;
            numberOfMembers = 1;
            numberOfScreen = 1;
            resolution = "SD";
        } else if (name.equals("standard")) {
            price = (float) 12.99;
            numberOfMembers = 2;
            numberOfScreen = 2;
            resolution = "HD";
        } else if (name.equals("premium")) {
            price = (float) 15.99;
            numberOfScreen = 4;
            numberOfMembers = 4;
            resolution = "HD/4K Ultra HD";
        }  else System.out.println("We don't have this plan.");
    }

    @Override
    public String toString() {
        return "Plans{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numberOfMembers=" + numberOfMembers +
                ", numberOfScreen=" + numberOfScreen +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
