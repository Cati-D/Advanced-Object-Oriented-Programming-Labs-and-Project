package repositories;

import Netflix.membership.Client;
import Netflix.membership.CreditCard;
import Netflix.membership.Plans;
import connectivity.DataBaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author: cati
 */
public class ClientRepository {
    //NU UITA SA ADAUGI ID-URILE
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<Client> getAllClients() {
        ArrayList<Client> clients = new ArrayList<>();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from client_data");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Client client = new Client(rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        new CreditCard(rs.getString("card_type"),
                                rs.getInt("card_number"),
                                rs.getInt("cvv"),
                                rs.getString("name_client"),
                                rs.getString("address"),
                                rs.getString("country")),
                        new Plans(rs.getString("name_plan"),
                                rs.getFloat("price"),
                                rs.getInt("number_members"),
                                rs.getInt("number_screen"),
                                rs.getString("resolution")));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
    public Client selectClientDetails(String email) {
        Client client = new Client();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from client_data where email = ?");
            statement.setString(1, email);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                client.setLastName(rs.getString("last_name"));
                client.setFirstName(rs.getString("first_name"));
                client.setEmailAddress(rs.getString("email"));
                client.setPassword(rs.getString("password"));
                client.setCreditCard(new CreditCard(rs.getString("card_type"),
                        rs.getInt("card_number"),
                        rs.getInt("cvv"),
                        rs.getString("name_client"),
                        rs.getString("address"),
                        rs.getString("country")));
                client.setPlans(new Plans(rs.getString("name_plans"),
                        rs.getFloat("price"),
                        rs.getInt("number_members"),
                        rs.getInt("number_screen"),
                        rs.getString("resolution")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    public Client selectClient(String email) {
        Client client = new Client();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select last_name from client_data where email = ?");
            statement.setString(1, email);

            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                client.setLastName("last_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    public Client selectClient(String email, String password) {
        Client client = new Client();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select last_name, first_name" +
                    "email, password,  card_type, card_number, cvv, name_client, address, country " +
                    "name_plans, price, number_members, number_screen, resolution" +
                    "from client_data where email = ? and password = ?");
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                client.setLastName(rs.getString(1));
                client.setFirstName(rs.getString(2));
                client.setEmailAddress(rs.getString(3));
                client.setPassword(rs.getString(4));
                client.setCreditCard(new CreditCard(rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8),
                        rs.getString(9), rs.getString(10)));
                client.setPlans(new Plans(rs.getString(11), rs.getFloat(12), rs.getInt(13), rs.getInt(14), rs.getString(15)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }

    public void saveClient(Client client) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into client_data " +
                    "(last_name, first_name, email, password,  card_type, card_number, cvv, name_client, address, country)" +
                    "(name_plan, price, number_members, number_screen, resolution)" +
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            statement.setString(1, client.getLastName());
            statement.setString(2, client.getFirstName());
            statement.setString(3, client.getEmailAddress());
            statement.setString(4, client.getPassword());
            statement.setString(5, client.getCreditCard().getCardType());
            statement.setInt(6, client.getCreditCard().getCardNumber());
            statement.setInt(7, client.getCreditCard().getCvv());
            statement.setString(8, client.getCreditCard().getName());
            statement.setString(9, client.getCreditCard().getAddress());
            statement.setString(10, client.getCreditCard().getCountry());
            statement.setString(11, client.getPlans().getName());
            statement.setFloat(12, client.getPlans().getPrice());
            statement.setInt(13, client.getPlans().getNumberOfMembers());
            statement.setInt(14, client.getPlans().getNumberOfScreen());
            statement.setString(15, client.getPlans().getResolution());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteClient(Client client) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from client_data where mail = ?");
            statement.setString(1, client.getEmailAddress());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientInfo(Client client, String lastName, String firstName) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("update client_data: " +
                    "set last_name = ?, first_name = ? where email = ?");
            statement.setString(3, client.getEmailAddress());
            statement.setString(1, lastName);
            statement.setString(2, firstName);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
