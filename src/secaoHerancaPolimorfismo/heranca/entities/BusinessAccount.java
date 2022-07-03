package secaoHerancaPolimorfismo.heranca.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){}

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount){
        if (amount <= loanLimit){
            deposit(amount);
        }
    }
    @Override
    public void withDraw(double amount){
        // Usando o método withdraw da Superclasse
        super.withDraw(amount);
        // Depois desconto 2 do resultado
        balance -= 2.0;
    }
}
