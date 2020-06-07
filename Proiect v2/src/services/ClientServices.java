package services;

import Netflix.membership.Client;

/**
 * @author: cati
 */
public interface ClientServices {
    public boolean  login(String email, String password);

    public void register(Client client);
}
