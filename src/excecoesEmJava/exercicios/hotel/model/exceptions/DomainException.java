package excecoesEmJava.exercicios.hotel.model.exceptions;

// extends RuntimeException - compilador não obriga a tratar
// extends Exception - compilador obriga a tratar
public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
