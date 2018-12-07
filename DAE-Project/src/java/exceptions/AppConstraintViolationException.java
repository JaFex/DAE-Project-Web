package exceptions;

import javax.validation.ConstraintViolationException;
import util.Utils;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */

public class AppConstraintViolationException extends Exception {

    public AppConstraintViolationException() {
    }

    public AppConstraintViolationException(String message) {
        super(message);
    }

    public AppConstraintViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppConstraintViolationException(Throwable cause) {
        super(cause);
    }

    public AppConstraintViolationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public AppConstraintViolationException(ConstraintViolationException cve) {
        this(Utils.getConstraintViolationMessages(cve), cve);
    }
    
}
