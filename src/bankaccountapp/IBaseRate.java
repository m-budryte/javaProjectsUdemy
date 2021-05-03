package bankaccountapp;

public interface IBaseRate {
    //method that returns the base rate
    default double getBaseRate() {
        return 6.9;
    }
}
