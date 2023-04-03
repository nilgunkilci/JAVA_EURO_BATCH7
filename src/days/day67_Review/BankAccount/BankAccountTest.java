package days.day67_Review.BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234567","Hohn Doe",12.6);


        // System.out.println(account.AccountNumber); AccountNumber private oldugu icin get method olmadan cagiramiyoruz

        System.out.println("Account number : " + account.getAccountNumber());
        System.out.println("Account Holder Name : " + account.getAccountHolderName());
        System.out.println("Current Balance : " + account.getBalance());

        account.setBalance(5000000);
        System.out.println("Current Balance : " + account.getBalance());

        account.deposit(5000);

        account.withdraw(-100);

        account.withdraw(600000000);

        account.withdraw(200);

        System.out.println(account.toString());

    }
}
