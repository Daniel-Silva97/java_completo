package secaoConstrutoresEncapsulamento.exercicios.contaBancaria.entities;

public class BankAccount {
    private final int account;
    private String name;
    private double balance;

    // Construtores
    public BankAccount(int account, String name, double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(int account, String name) {
        this.account = account;
        this.name = name;
    }

    // Getters and Setters
    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    //MakeDeposit and Withdraw Money
    public void makeDeposit(double deposit){
        balance += deposit;
    }
    public void withdrawValue(double withdraw){
        double tax = 5.0;
        balance = balance - withdraw - tax;
    }

    public String toString(){
        return "Account "
                + getAccount()
                + ", Holder: "
                + getName()
                + ", Balance: "
                + getBalance();
    }
}
