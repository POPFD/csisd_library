/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kutoma
 */
public class Member {
    private final int memberNumber;
    private final String name;
    private SetOfBooks currentLoans = new SetOfBooks();
    private static int memberCount = 0;
    
    public Member(String aName){
        name = aName;
        memberNumber = memberCount++;
        currentLoans = new SetOfBooks();
    }

    public String toString(){
        return Integer.toString(memberNumber) + " " + name;
    }

    public void borrowBook(Book aBook){
        aBook.setBorrower(this);
        currentLoans.addBook(aBook);
    }
    
    public void returnBook(Book aBook) {
        currentLoans.removeBook(aBook);
        aBook.setBorrower(null);        
    }
    
    public SetOfBooks getBooksOnLoan() {
        return currentLoans;
    }
    
    public String getMemberName() {
        /* 
         * To preserve encapsulation we use get functions.
         * This is because we do not want to make name attribute public.
         */
        return name;
    }
    
    public int getMemberNumber() {
        /* 
         * To preserve encapsulation we use get functions.
         * This is because we do not want to make memberNumber attribute public.
         */
        return memberNumber;
    }

}
