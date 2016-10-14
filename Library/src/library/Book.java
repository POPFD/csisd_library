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

    private String iSBNNumber;
    private String title;
    private String author;
    private int accessionNumber;
    private Member borrower = null;
    
    private static int bookCount = 0;

    public Book(String name){
        title = name;
        accessionNumber = bookCount++;
    }

    public void setBorrower(Member theBorrower) {
        borrower = theBorrower;
    }

    public Member getBorrower() {
        return borrower;
    }
    
    public String toString() {
        return title + "_" +  Integer.toString(accessionNumber);
    }
    
    public boolean isOnLoan() {
        return (borrower != null);
    }
    
}
