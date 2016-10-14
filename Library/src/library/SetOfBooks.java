/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 *
 * @author Kutoma
 */
public class SetOfBooks extends ArrayList<Book> implements java.io.Serializable {


    public SetOfBooks(){
        super();
    }

    public void addBook(Book aBook){
        super.add(aBook);
    }
    
    public void removeBook(Book aBook) {
        super.remove(aBook);
    }
    
    public SetOfBooks findBookByAuthor(String author) {
        SetOfBooks result = new SetOfBooks();
        
        /* Iterate through all books in current set, add if author matches */
        for (Book tmp : this)
        {
            if (tmp.getAuthor().equals(author))
                result.add(tmp);
        }
        
        return result;
    }
    
    public SetOfBooks findBookFromTitle(String title) {
        SetOfBooks result = new SetOfBooks();
        
        /* Iterate through all books in current set, add if title matches */
        for (Book tmp : this)
        {
            if (tmp.getTitle().equals(title))
                result.add(tmp);
        }
        
        return result;
    }
    
    public Book findBookFromAccNumber(int accNo) {
        Book result = null;
        
        /* Iterate through all books in current set, return if accNo matches */
        for (Book tmp : this)
        {
            if (tmp.getAccessionNumber() == accNo)
            {
                result = tmp;
                break;
            }
        }
        
        return result;
    }
    
    public SetOfBooks findBookFromISBN(String ISBN) {
        SetOfBooks result = new SetOfBooks();
        
        /* 
         * In the model it says the passed argument should be of type int.
         * This is incorrect as format for an ISBN is as follows:
         * 978-3-16-148410-0
         * Example of ISBN grabbed from 
         * https://en.wikipedia.org/wiki/International_Standard_Book_Number
         */
        
        /* Iterate through all books in current set, add if ISBN matches */
        for (Book tmp : this)
        {
            if (tmp.getISBN().equals(ISBN))
                result.add(tmp);
        }
        
        return result;   
    }

}
