package Netflix.viewMode;

import Netflix.Membership.Client;
import Netflix.Shows.MyList;

import java.util.ArrayList;

public class DesktopApplication {

    private String language;
    private float memory;
    private String location;
    private ArrayList<Client> client;
    private MyList myList;
    private String sound = "on";

    public DesktopApplication(String language, float memory, String location, ArrayList<Client> client_,
                               MyList myList) {
        this.language = language;
        this.memory = memory;
        this.location = location;
        this.client = new ArrayList<Client>(client_);
        this.myList = myList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Client> getClient() {
        return client;
    }

    public void addClient(Client client_) {
        client.add(client_);
    }

    public MyList getMyList() {
        return myList;
    }

    public void setMyList(MyList myList) {
        this.myList = myList;
    }

    public void view() {
        System.out.println("DesktopApplication{" +
                "language='" + language +
                ", memory=" + memory +
                ", location='" + location +
                ", clients = ");
        for (int i = 0; i < client.size(); i++){
            System.out.println(client.get(i).toString());
        }
        System.out.println(", myList=" + myList.toString() +
                ", sound='" + sound + '\'' +
                '}');
    }

    public void prints(){
        System.out.println("DesktopApplication{" +
                "language='" + language + '\'' +
                ", memory=" + memory +
                ", location='" + location + '\'' +
                ", client=" + client +
                ", myList=" + myList);
        for (int i= 0; i < client.size(); i++) {
            System.out.println(client.get(i).toString());
        }
    }
}
