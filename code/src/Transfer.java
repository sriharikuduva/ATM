public class Transfer extends Transaction {
    private int destinationAccountNumber;

    public int getDestinationAccountNumber() {
        return destinationAccountNumber;
    }
    public void setDestinationAccountNumber(int destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }
}