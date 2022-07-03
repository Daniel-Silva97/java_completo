package secaoHerancaPolimorfismo.heranca.application;

import secaoHerancaPolimorfismo.heranca.entities.Account;
import secaoHerancaPolimorfismo.heranca.entities.BusinessAccount;
import secaoHerancaPolimorfismo.heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UpCasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DownCasting
        // Usando o cast (BusinessAccount) para converter de Account para BusinessAccount
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        // SavingsAccount (acc3) não herda de BusinessAccount, portanto havera um erro de casting nesta linha
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        // instanceOf efetuará a validação se é possível realizar o Downcasting de uma classe para outra antes de
        // executar a linha de codigo.
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
