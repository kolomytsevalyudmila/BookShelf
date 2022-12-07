
package bookshelf;

/**
 * Newspaper class
 * 
 */
public class Newspaper extends Periodical {
    
    private boolean color;

    public Newspaper(boolean color, int days, String author, String title, int year) {
        super(days, author, title, year);
        this.color = color;
    }

    public boolean isColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color=" + color;
    }

    @Override
    public boolean getType() {
        return color;
    }
    
}
