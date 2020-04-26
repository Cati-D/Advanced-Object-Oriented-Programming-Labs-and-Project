package Netflix.Membership;


public class CreditCard {

    private String cardType;
    private int cardNumber;
    private int cvv;
    private String name;
    private String address;
    private String country;

    public CreditCard() {
    }

    public CreditCard(String cardType, int cardNumber,
                      int cvv, String name, String address, String country) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public CreditCard(CreditCard creditCard) {
        this.cardType = creditCard.cardType;
        this.cardNumber = creditCard.cardNumber;
        this.cvv = creditCard.cvv;
        this.name = creditCard.name;
        this.address = creditCard.address;
        this.country = creditCard.country;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardType='" + cardType + '\'' +
                ", cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
