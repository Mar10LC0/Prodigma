package mario.prodigma.reusablePhoneBookLibrary.exception;

/**
 * Created on 18.01.2022
 *
 * @author Mario Çoku
 */

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
