import java.util.*;

public class Book {
    private String bookName;
    private int bookPrice;
    
        public Book(String n, int p) {
            this.bookName = n;
            this.bookPrice = p;
        }
        
        public void setName(String n){
            bookName = n;
        }
        
        public void setPrice(int P){
            bookPrice = P;
        }
        
        public String getName(){
            return bookName;
        }
        
        public int getPrice() {
            return bookPrice;
        }
}