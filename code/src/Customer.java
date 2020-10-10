import metadata.Address;
import metadata.CustomerStatus;

public class Customer {
    private String name, email, phone;
    private Address address;
    private CustomerStatus status;
    private Card card;
    private Account account;

    public boolean makeTransaction(Transaction transaction);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public CustomerStatus getStatus() {
        return status;
    }
    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}