package days.day47;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAcc_number(1234567);
        account.setName("Hasan");
        account.setEmail("hasan@gmail.com");
        account.setAmount(25000.0);
        account.setAddress("10 London Street London");
        account.setPhoneNumber("06765435689");

        System.out.println("account.getAddress() = " + account.getAddress());

        System.out.println(" Account number " + account.getAcc_number() + " Name" + account.getName());

        System.out.println(  account.toString());
    }
}
