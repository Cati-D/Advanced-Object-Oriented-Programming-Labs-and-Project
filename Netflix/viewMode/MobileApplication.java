package Netflix.viewMode;

import Netflix.Membership.Client;
import Netflix.Shows.MyList;

import java.awt.*;
import java.util.ArrayList;
import java.util.TimerTask;

public class MobileApplication {

    private String language;
    private float memory;
    private ArrayList<Client> client;
    private MyList myList;

    public MobileApplication(String language, float memory, ArrayList<Client> client_, MyList myList) {
        this.language = language;
        this.memory = memory;
        this.client = new ArrayList<Client>();
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


    public void notification() {
        Toolkit.getDefaultToolkit().beep();
        java.util.Timer t = new java.util.Timer();
        final int[] numberOfNotifications = new int[1];
        numberOfNotifications[0] = 0;
        t.schedule(new TimerTask() {
            public void run() {
                numberOfNotifications[0]++;
                System.out.println("***********");
                if (numberOfNotifications[0] == 1000) {
                    System.exit(0);
                }
            }
        }, 5000, 5000);
    }

    public void prints(){
        System.out.println("DesktopApplication{" +
                "language='" + language + '\'' +
                ", memory=" + memory +
                ", client=" + client +
                ", myList=" + myList);
        for (int i= 0; i < client.size(); i++) {
            System.out.println(client.get(i).toString());
        }
    }
}
