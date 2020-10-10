import java.util.List;

public class Bank {
    private String name, bankCode;
    private List<ATM> atms;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public void addATM(ATM atm) {
        atms.add(atm);
    }
}