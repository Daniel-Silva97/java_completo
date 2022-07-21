package excecoesEmJava.exercicios.contaBancaria.models.entities;

import excecoesEmJava.exercicios.contaBancaria.models.exceptions.Withdraw;

public class BankAccount {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public BankAccount() {
    }

    public BankAccount(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws Withdraw {

        if (amount > withdrawLimit) {
            throw new Withdraw("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new Withdraw("Not enough balance");

        }


        this.balance -= amount;
    }
}
