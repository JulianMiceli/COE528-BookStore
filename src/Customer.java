public class Customer extends User {
    private int points;
    private State level;
    private String levelStatus = null;

    public Customer(String u, String p, int points, State level) {
        super.setUsername(u);
        super.setPassword(p);
        this.points = points;
        this.level = level;
    }
    
    public void setState(State s){
        this.level = s;
    }
    
    public State getState(){
        return level;
    }
    
    public void setPoints(int po){
        this.points = po;
    }
    
    public int getPoints(){
        return points;
    }
    
    public void setStatus(String s){
        this.levelStatus = s;
    }
    
    public String getStatus(){
        return levelStatus;
    }
    
    public void buyBook(Book book){
        bookList.remove(book);
        points += (10 * book.getPrice());
    }
    
    public void buyWithPointsBook(Book book, int Points){
        if(book.getPrice() < (Points % 100)){
            int newPrice = book.getPrice();
            int newPoints = Points;
            while(book.getPrice() > 0 && Points > 99){
                newPrice = newPrice - 1;
                newPoints = newPoints - 100;
            }
            bookList.remove(book);
        }else{
            System.out.println("invalid");
        }
    }
}