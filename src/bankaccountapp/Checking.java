package bankaccountapp;

public class Checking extends Account{
    //list the props specific to the checking acc
    private int debitCardNumber;
    private int debitCardPin;

    //constructor to initialise checking account props
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    //list any methods specific to the checking acc
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your checking account features" +
                        "\n Debit Card Number: " + debitCardNumber +
                        "\n Debit Card Pin: " + debitCardPin
        );

    }
}
