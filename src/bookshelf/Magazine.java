
package bookshelf;

/**
 * Magazine class
 * 
 */
public class Magazine extends Periodical{

    private boolean gloss;

    public Magazine(boolean gloss, int days, String author, String title, int year) {
        super(days, author, title, year);
        this.gloss = gloss;
    }

    @Override
    public String toString() {
        return super.toString() + ", gloss=" + gloss;
    }

    @Override
    public boolean getType() {
    
        return gloss;
    }
    
    
}
