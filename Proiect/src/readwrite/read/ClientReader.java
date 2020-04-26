package readwrite.read;

import Netflix.Membership.Client;
import Netflix.Membership.CreditCard;
import Netflix.Membership.Plans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientReader extends Reader<Client> {

    private static List<Client> clientList = new ArrayList<Client>();

    public static void readData() {

        ClientReader clientReader = new ClientReader();
        clientList = clientReader.readAndCreateObjects("C:\\Users\\Cati\\Desktop\\Uni\\II\\Sem2\\PAO\\Proiect\\src\\readwrite\\resource\\Client.csv");

        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    public static List<Client> getClientList() {
        return Collections.unmodifiableList(clientList);
    }

    @Override
    Client createObject(String[] objectDetails) {
        CreditCard creditCard = new CreditCard(objectDetails[3], Integer.parseInt(objectDetails[4]), Integer.parseInt(objectDetails[5]), objectDetails[6], objectDetails[7], objectDetails[8]);
        Plans plans = new Plans(objectDetails[9], Float.parseFloat(objectDetails[10]), Integer.parseInt(objectDetails[11]), Integer.parseInt(objectDetails[12]), objectDetails[13]);
        return new Client(objectDetails[0], objectDetails[1], objectDetails[2], creditCard, plans);
    }
}
