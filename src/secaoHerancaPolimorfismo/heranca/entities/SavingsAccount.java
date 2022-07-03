package secaoHerancaPolimorfismo.heranca.entities;

// "final" adicionado para não permite que novas classes herdem de SavingsAccount
public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;
    }
    //Sobrepondo o método withDraw da SuperClasse
    // Utilizando o final no método para não seja sobreposto em outra classe
    @Override
    public final void withDraw(double amount){
        balance -= amount;
    }
}
