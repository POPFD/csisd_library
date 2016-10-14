/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

/**
 *
 * @author Kutoma
 */
public class Book {

    private final String iSBNNumber;
    private final String title;
    private final String author;
    private final int accessionNumber;
    private Member borrower = null;
    
    private static int bookCount = 0;

    public Book(String newTitle, String newAuthor, String newISBN){
        title = newTitle;
        author = newAuthor;
        iSBNNumber = newISBN;
        accessionNumber = bookCount++;
    }

    public void setBorrower(Member theBorrower) {
        borrower = theBorrower;
    }

    public Member getBorrower() {
        return borrower;
    }
    
    public String getISBN() {
        return iSBNNumber;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getAccessionNumber() {
        return accessionNumber;
    }
    
    public String toString() {
        return title + "_" +  Integer.toString(accessionNumber);
    }
    
    public boolean isOnLoan() {
        return (borrower != null);
    }
    
}
