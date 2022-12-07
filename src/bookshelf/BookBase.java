
package bookshelf;

/**
 * Base class for example <p>
 * Cannot create objects
 */
public abstract class BookBase implements Comparable<BookBase>{
    
    private String author;
    private String title;
    private int year;

    public BookBase(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    
    @Override
    public int compareTo(BookBase rValue){
        return year - rValue.year;
    }
    
    @Override
    public String toString() {
        return "author=" + author + ", title=" + title + ", year=" + year;
    }
    
    
}
