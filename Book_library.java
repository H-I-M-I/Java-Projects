
package h;

class library{
    
    String[] books;
    int noOfBooks;
    
    library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    
    void addBook(String bookie){
        this.books[noOfBooks] = bookie;
        noOfBooks++;
        System.out.println("The book '"+bookie+"' has been added.");
    }
    
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String booklet : this.books){
            if(booklet == null) continue;
            System.out.println("- "+booklet);
        }
        
    }
    
    void issuedBooks(String book){
        for(int i=0; i<noOfBooks; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book "+book+" has been issued.");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The book "+book+" does not exist.");
    }
}

public class Book_library {
    
    public static void main(String[] args){
        
        library L = new library();
        
        L.addBook("Harry Potter");
        L.addBook("Sherlock Holmes");
        L.addBook("Robinson Crusoe");
        L.addBook("Gulliver's Travels");
        L.addBook("Alice’s Adventures in Wonderland");
        L.addBook("The Adventures of Huckleberry Finn");
        
        L.showAvailableBooks();
        L.issuedBooks("Sherlock Holmes");
        
        L.showAvailableBooks();
    }
}
