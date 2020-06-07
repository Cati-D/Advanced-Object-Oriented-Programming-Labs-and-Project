package readwrite.read;

import Netflix.membership.Client;
import Netflix.membership.CreditCard;
import Netflix.membership.Plans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientReader extends Reader<Client> {

    private static List<Client> clientList = new ArrayList<Client>();

    public static void readData() {

        ClientReader clientReader = new ClientReader();
        clientList = clientReader.readAndCreateObjects("D:\\Uni\\II\\Sem2\\PAO\\Proiect\\src\\readwrite\\resource\\Client.csv");

        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    public static List<Client> getClientList() {
        return Collections.unmodifiableList(clientList);
    }

    @Override
    Client createObject(String[] objectDetails) {
        CreditCard creditCard = new CreditCard(objectDetails[4], Integer.parseInt(objectDetails[5]), Integer.parseInt(objectDetails[6]), objectDetails[7], objectDetails[8], objectDetails[9]);
        Plans plans = new Plans(objectDetails[10], Float.parseFloat(objectDetails[11]), Integer.parseInt(objectDetails[12]), Integer.parseInt(objectDetails[13]), objectDetails[14]);
        return new Client(objectDetails[0], objectDetails[1], objectDetails[2], objectDetails[3], creditCard, plans);
    }
}
