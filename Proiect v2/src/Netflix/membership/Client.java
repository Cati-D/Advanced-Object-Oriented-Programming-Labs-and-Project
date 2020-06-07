package Netflix.membership;

import java.util.Objects;

public class Client{

    private String firstName;
    private String lastName;
    private String emailAddress;
    private CreditCard creditCard;
    private Plans plans;
    private String password;

    public Client(String firstName, String lastName, String emailAddress, String password,
                  CreditCard creditCard, Plans plans) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.creditCard = creditCard;
        this.plans = plans;
    }

    public Client() {
    }

    public Client(Client clientData) {
        this.firstName = clientData.firstName;
        this.lastName = clientData.lastName;
        this.emailAddress = clientData.emailAddress;
        this.password = clientData.password;
        this.creditCard = new CreditCard(clientData.creditCard);
        this.plans = new Plans(clientData.plans);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Plans getPlans() {
        return plans;
    }

    public void setPlans(Plans plans) {
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password= " + password + '\'' +
                ", creditCard=" + creditCard.toString() +
                ", plans=" + plans.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(getFirstName(), client.getFirstName()) &&
                Objects.equals(getLastName(), client.getLastName()) &&
                Objects.equals(getEmailAddress(), client.getEmailAddress()) &&
                Objects.equals(getPassword(), client.getPassword()) &&
                Objects.equals(getCreditCard(), client.getCreditCard()) &&
                Objects.equals(getPlans(), client.getPlans());
    }

}
