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

    private int iSBNNumber;
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
    
    public int getISBN() {
        /* 
         * Originally iSBNNumber was of type string,
         * It's redudant so I changed it to type int as it is more efficient.
         */
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
