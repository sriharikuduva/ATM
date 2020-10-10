import metadata.Address;

public class ATM {
    private int atmID;
    private Address location;

    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;
    private CheckDeposit checkDeposit;
    private CashDeposit cashDeposit;

    public int getAtmID() {
        return atmID;
    }
    public void setAtmID(int atmID) {
        this.atmID = atmID;
    }

    public Address getLocation() {
        return location;
    }
    public void setLocation(Address location) {
        this.location = location;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }
    public void setCashDispenser(CashDispenser cashDispenser) {
        this.cashDispenser = cashDispenser;
    }

    public Keypad getKeypad() {
        return keypad;
    }
    public void setKeypad(Keypad keypad) {
        this.keypad = keypad;
    }

    public Screen getScreen() {
        return screen;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Printer getPrinter() {
        return printer;
    }
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public CheckDeposit getCheckDeposit() {
        return checkDeposit;
    }
    public void setCheckDeposit(CheckDeposit checkDeposit) {
        this.checkDeposit = checkDeposit;
    }

    public CashDeposit getCashDeposit() {
        return cashDeposit;
    }
    public void setCashDeposit(CashDeposit cashDeposit) {
        this.cashDeposit = cashDeposit;
    }


    public boolean authenticateUser();
    public boolean makeTransaction(Customer customer, Transaction transaction);
}