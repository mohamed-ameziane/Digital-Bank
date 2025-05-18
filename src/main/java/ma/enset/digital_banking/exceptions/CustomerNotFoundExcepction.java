package ma.enset.digital_banking.exceptions;

public class CustomerNotFoundExcepction extends RuntimeException {
    public CustomerNotFoundExcepction(String message){
        super(message);
    }
}
