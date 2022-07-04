package secaoHerancaPolimorfismo.classeAbstrata.application;


import secaoHerancaPolimorfismo.classeAbstrata.entities.Account;
import secaoHerancaPolimorfismo.classeAbstrata.entities.BusinessAccount;
import secaoHerancaPolimorfismo.classeAbstrata.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        // Não pode instanciar como account quando abstrata
        // Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
    }
}
