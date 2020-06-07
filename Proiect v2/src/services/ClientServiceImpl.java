package services;

import Netflix.membership.Client;
import repositories.ClientRepository;

/**
 * @author: cati
 */
public class ClientServiceImpl implements ClientServices {
    private static ClientRepository clientRepository = new ClientRepository();

    @Override
    public boolean login(String email, String password) {
        Client client = clientRepository.selectClient(email, password);
        if (client.getFirstName() != null) {
            return true;
        }
        return false;
    }

    public boolean existingEmail(String email) {
        Client client = clientRepository.selectClient(email);
        if (client.getEmailAddress().length() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void register(Client client) {
        clientRepository.saveClient(client);
    }
}
