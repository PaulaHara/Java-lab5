package ca.ciccc.java.model;

import ca.ciccc.java.Exception.InvalidArgumentException;
import ca.ciccc.java.Exception.InvalidBookDateException;

/**
 * @author paula on 19/04/18.
 */
public final class Biography extends Book {

    private Name subject;

    /**
     * Constructor for Biography
     * @param authorFirstName
     * @param authorLastName
     * @param bookTitle
     * @param publishedYear
     * @param subject
     * @throws InvalidArgumentException
     * @throws InvalidBookDateException
     */
    public Biography(Name authorFirstName, Name authorLastName, String bookTitle, int publishedYear, Name subject) throws InvalidArgumentException, InvalidBookDateException {
        super(authorFirstName, authorLastName, bookTitle, publishedYear);
        this.setSubject(subject);
    }

    /**
     * Set the subject of this biography
     * @param subject
     */
    public void setSubject(Name subject) {
        this.subject = subject;
    }

    /**
     * Get the subject of this biography
     * @return subject
     */
    public Name getSubject() {
        return subject;
    }

    /**
     * Biographies are equals if they have the same subject
     * @param o
     * @return true if equals, false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof Biography){
            Biography biography = (Biography) o;
            if(o == this || this.subject.equals(biography.getSubject())){
                return true;
            }
        }
        return false;
    }

    /**
     * Return a string with all the information about this biography
     * @return string
     */
    @Override
    public String toString() {
        return "Biography [Author's First Name: "+this.getAuthorFirstName()+", Author's Last Name: "+this.getAuthorLastName()+", " +
                "Book Title: "+this.getBookTitle()+", Published Year: "+this.getPublishedYear()+", Subject: "+this.getSubject()+"]";
    }
}
