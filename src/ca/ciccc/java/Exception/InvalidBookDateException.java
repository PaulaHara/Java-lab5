package ca.ciccc.java.Exception;

import ca.ciccc.java.model.Book;

/**
 * @author paula on 19/04/18.
 */
public class InvalidBookDateException extends Exception {

    /**
     * This exception is throw if the publishedYear of {@link Book} is bigger than 2017
     * @param message
     */
    public InvalidBookDateException(String message){
        super(message);
    }
}
