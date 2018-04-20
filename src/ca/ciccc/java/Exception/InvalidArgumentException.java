package ca.ciccc.java.Exception;

import ca.ciccc.java.model.Name;

/**
 * @author paula on 19/04/18.
 */
public class InvalidArgumentException extends Exception {

    /**
     * This exception is throw if the {@link Name} is null or has the string name empty
     * @param message
     */
    public InvalidArgumentException(String message){
        super(message);
    }
}
