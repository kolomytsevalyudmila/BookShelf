
package bookshelf;

/**
 * Base class for periodical editions <p>
 * Cannot create objects
 * 
 */
public abstract class Periodical extends BookBase {
    
    private int days;

    public Periodical(int days, String author, String title, int year) {
        super(author, title, year);
        this.days = days;
    }

    public int getDays() {
        return days;
    }
    
    public abstract boolean getType();
    
    
    @Override
    public String toString() {
        return super.toString() + ", days=" + days;
    }
    
    
}
