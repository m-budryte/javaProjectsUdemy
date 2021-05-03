package bankaccountapp;

public class Savings extends Account{
    //list props specific to saving acc
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //constructor to init setting for the savings props
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your savings account features" +
                        "\n Safety Deposit Box Id: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );

    }
    //list any methods specific to savings acc
}
