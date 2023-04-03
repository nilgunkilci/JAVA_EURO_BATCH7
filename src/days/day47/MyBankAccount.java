package days.day47;

public class MyBankAccount {

   private int acc_number;
    private int acc_balance;

    public MyBankAccount(int acc_number,int acc_balance){
        this.acc_number= acc_number;
        this.acc_balance=acc_balance;
    }
    public int printAccountNumber(){
        return this.acc_number;
    }
    public int printAccountBalance(){
        return this.acc_balance;
    }
    public void depositMoney(int money){
        this.acc_balance +=money;

    }
}
