import java.util.InputMismatchException;

public class CommandException extends InputMismatchException {

    public CommandException(String message) {
        super(message);
    }
}
