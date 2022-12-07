
package bookshelf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class BookShelf{

    
    public static void main(String[] args) {
        
        ArrayList<Book> bookLib = new ArrayList<>();
        bookLib.add(new Book(500, "Herbert Schildt", "Java", 2010));
        bookLib.add(new Book(641, "Eric Freeman", "Patterns", 2000));
        
        ArrayList<Periodical> perLib = new ArrayList<>();
        perLib.add(new Magazine(true, 7, "John Smith", "FoxNews", 1990));
        perLib.add(new Newspaper(false, 1, "NoName", "MK", 1987));
        
        ArrayList<BookBase> lib = new ArrayList<>(bookLib);
        lib.addAll(perLib);
        
        for (BookBase book : lib) {
            System.out.println(book);
        }
        if(lib.get(1).compareTo(lib.get(2)) > 0) System.out.println("Ok");
        
        try {
            File file = new File("Book.txt");
            FileWriter fw = new FileWriter(file);
            for (BookBase book : lib) {
             fw.write(book.toString() + "\n");
            }
            fw.close();
        
            } catch(IOException ex){
            ex.printStackTrace();
        }
        for (BookBase book : lib) {
            if(book instanceof Book){
                Book tmp = (Book) book;
                System.out.println(tmp.toString());
            }
        }
       
        
    }
}
