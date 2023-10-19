public class BankAccount {
    public double balance;
    public double deposit(double amount){
        return balance+=amount;
    }
    public double withdraw(double amount){
        return balance-=amount;
    }
}
