package days.day47;

public class VictimBank {
   //  int acc_number;
    // int acc_balance;

    // 1. senaryo
    // cozum: acc_balance variable ini private yaparak manipulasyonu onleme

    private int acc_number;
    private int acc_balance;

    public VictimBank(int acc_number,int acc_balance){
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
