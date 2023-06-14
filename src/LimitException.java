import javax.naming.LimitExceededException;

public class LimitException extends LimitExceededException {
    public LimitException(String message) {
        super(message);
    }

    public void getRemainingAmount() {
    }
}
