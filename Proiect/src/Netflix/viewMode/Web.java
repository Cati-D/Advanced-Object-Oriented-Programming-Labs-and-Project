package Netflix.viewMode;

import Netflix.Membership.Client;
import Netflix.Shows.MyList;

import java.util.ArrayList;

public class  Web {

    private String language;
    private ArrayList<Client> client;
    private MyList myList;

    public Web(String language, ArrayList<Client> clientStack, MyList myList) {
        this.language = language;
        this.client = new ArrayList<Client>(clientStack);
        this.myList = myList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public void prints(){
        System.out.println("DesktopApplication{" +
                "language='" + language +
                ", client=" + client +
                ", myList=" + myList);
        for (int i= 0; i < client.size(); i++) {
            System.out.println(client.get(i).toString());
        }
    }

}
