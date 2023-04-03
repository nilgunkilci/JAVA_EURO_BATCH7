package days.day67_Review.BankAccount;

public class BankAccount {
    private String accountNumber;
    private  String accountHolderName;
    private double balance ;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }



    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>=0){
            this.balance=balance;
        }else{
            System.out.println(" Error : Can not set balance to a negative value");
        }

    }
    public void deposit (double amount){
        if (amount >0){
            this.balance += amount ;
            System.out.println("Deposit of $ " + amount + " was successful." );
            System.out.println(" Your current balance is $ " + balance);
        }else {
            System.out.println("Error : Can not deposit amount or Zero");
        }
    }

    public void withdraw (double amount){
        if (amount >0 && amount< balance){
            this.balance += amount ;
            System.out.println("Withdraw of $ " + amount + " was successful." );
            System.out.println(" Your current balance is $ " + balance);
        }else {
            System.out.println("Error : Can not withdraw negatif amount more than current balance");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
