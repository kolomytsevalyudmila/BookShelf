
package bookshelf;

/**
 * Book class
 * 
 */
public class Book extends BookBase{
    
    private int pages;

    public Book(int pages, String author, String title, int year) {
        super(author, title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", pages=" + pages;
    }
    
    
}
