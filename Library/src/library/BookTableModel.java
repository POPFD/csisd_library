/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import javax.swing.table.*;
import java.util.Vector;

/**
 *
 * @author Jack
 */
public class BookTableModel extends DefaultTableModel {
    
    public BookTableModel() {
        super.addColumn("BookObjID");
        super.addColumn("Title");
        super.addColumn("Author");
        super.addColumn("ISBN");
        super.addColumn("Accession Number");
        super.addColumn("Status");
    }
    
    public void updateBookSet(SetOfBooks books) {
        
        /* Remove current books from TableModel */
        this.setRowCount(0);
        
        /* Add all the new books */
        for (Book tmp : books)
        {
            addBookToTable(tmp);
        }
    }
    
    private void addBookToTable(Book book) {
        Vector row = new Vector();
        
        row.add(book);
        row.add(book.getTitle());
        row.add(book.getAuthor());
        row.add(book.getISBN());
        row.add(book.getAccessionNumber());
        
        if (book.isOnLoan())
            row.add("Loaned To: " + book.getBorrower().getMemberName());
        else
            row.add("Available");
        
        this.addRow(row); 
    }
    
    /* Below method is to make it so cells in table aren't editable */
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
}
