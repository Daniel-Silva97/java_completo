package excecoesEmJava.exercicios.contaBancaria.models.exceptions;

public class Withdraw extends Exception {
    private static final long serialVersionUID = 1L;

    public Withdraw(String msg){
        super(msg);
    }
}
