import java.util.ArrayList;

public class Owner extends User{
    
    public Owner() {    
        super.setUsername("admin");
        super.setPassword("admin");
    }

    public boolean addCustomer(String u, String p, int po, State s) {
        boolean flag = false;
        boolean status = false;
        if (customerList.isEmpty()) {
            Customer newCust = new Customer(u, p, po, s);
            customerList.add(newCust);
            System.out.println("UPDATE: ACCOUNT CREATED");
            flag = true;
        } else {
            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getUsername().equals(u)) {
                   System.out.println("UPDATE: INVALID USERNAME");
                    status = true;
                    break;
                }
            }
            if (!status) {
                Customer newCust = new Customer(u, p, po, s);
                customerList.add(newCust);
                System.out.println("UPDATE: ACCOUNT CREATED");
                flag = true;
            }
        }
        return flag;
    }

    public boolean deleteCustomer(String u) {
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (u.equals(customerList.get(i).getUsername())) {
                customerList.remove(i);
                System.out.println("UPDATE: ACCOUNT DELETED");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("UPDATE: USERNAME DOES NOT EXIST");
        }
        return flag;
    }

    public Customer Customer(String u) {
       
        boolean status = false;
        int index = 0;
        for (int i = 0; i < customerList.size(); i++) {

            if (u.equals(customerList.get(i).getUsername())) {

                status = true;
                index = i;
                break;
            }
        }
        if (status) {
            return customerList.get(index);
        } else {
            System.out.println("UPDATE: USERNAME DOES NOT EXIST");
            return null;
        }
    }
    public ArrayList<Customer> getCustomerList() {
        
        return customerList;
    }
    
    
    //Book logic
    public boolean addBook(String u, int p) {
        boolean flag = false;
        boolean status = false;
        if (bookList.isEmpty()) {
            Book newBook = new Book(u, p);
            bookList.add(newBook);
            System.out.println("UPDATE: New Book Added");
            flag = true;
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getName().equals(u)) {
                   System.out.println("UPDATE: INVALID BOOK NAME");
                    status = true;
                    break;
                }
            }
            if (!status) {
                Book newBook = new Book(u, p);
                bookList.add(newBook);
                System.out.println("UPDATE: BOOK LISTING CREATED");
                flag = true;
            }
        }
        return flag;
    }

    public boolean deleteBook(String u) {
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (u.equals(customerList.get(i).getUsername())) {
                customerList.remove(i);
                System.out.println("UPDATE: BOOK LISTING DELETED");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("UPDATE: BOOK NAME DOES NOT EXIST");
        }
        return flag;
    }

    public Book Book(String u) {
       
        boolean status = false;
        int index = 0;
        for (int i = 0; i < bookList.size(); i++) {

            if (u.equals(bookList.get(i).getName())) {

                status = true;
                index = i;
                break;
            }
        }
        if (status) {
            return bookList.get(index);
        } else {
            System.out.println("UPDATE: USERNAME DOES NOT EXIST");
            return null;
        }
    }
    public ArrayList<Book> getBookList() {
        
        return bookList;
    }
}