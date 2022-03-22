import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Main extends Application {
    Stage window;
    public Scene loginScene, interfaceScene, booksScene, customersScene;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(80, 40, 80, 40));
        
        Text info = new Text("Welcome to the BookStore App");
        Text username = new Text("Username:");
        Text password = new Text("Password:");
        
        TextField userInput = new TextField();
        TextField passInput = new TextField();
        
        Button login = new Button("Login");
        login.setTranslateX(220);
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if("admin".equalsIgnoreCase(userInput.getText()) && "admin".equalsIgnoreCase(passInput.getText())){
                    System.out.println("Successful Login!");
                    window.setScene(catalogueScene());
                    userInput.clear();
                    passInput.clear();
                }else{
                    System.out.println("Incorrect Login.");
                }
            }
        });
        
        pane.setHgap(10);
        pane.setVgap(2);
        
        pane.add(info,0,0);
        pane.add(username,0,1);
        pane.add(userInput,1,1);
        pane.add(password,0,2);
        pane.add(passInput,1,2);
        pane.add(login,0,3);
        
        loginScene = new Scene(pane, 500, 300);
        window.setTitle("BookStore App"); 
        window.setScene(loginScene); 
        window.show(); 
    }
    
    public Scene catalogueScene() {
        GridPane secondpage = new GridPane();
        secondpage.setAlignment(Pos.CENTER); 
        Button books = new Button("Books");
        books.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(loginScene);
                System.out.println("Logging out.....");
            }
        });
        
        Button customers = new Button("Customers");
        customers.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(loginScene);
                System.out.println("Logging out.....");
            }
        });
        
        Button logout = new Button("Logout");
        logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.setScene(loginScene);
                System.out.println("Logging out.....");
            }
        });
        
        books.setMinHeight(50);
        books.setMinWidth(200);
        customers.setMinHeight(50);
        customers.setMinWidth(200);
        logout.setMinHeight(50);
        logout.setMinWidth(200);
        
        secondpage.add(books,0,0);
        secondpage.add(customers,0,1);
        secondpage.add(logout,0,2);
        
        secondpage.setVgap(10);
        
        interfaceScene = new Scene(secondpage, 500, 300);
        return interfaceScene;
    }
    
//    public Scene cScene() {
//        TableColumn firstNameCol = new TableColumn("First Name");
//        firstNameCol.setMinWidth(100);
//        
//        TableColumn lastNameCol = new TableColumn("Last Name");
//        lastNameCol.setMinWidth(100);
//        
//        TableColumn emailCol = new TableColumn("Email");
//        emailCol.setMinWidth(200);
//        
////        table.setItems(data);
////        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
//        
////        booksScene = new Scene(secondpage, 500, 300);
////        return booksScene;
//    }
    
//    public Scene bScene() {
//       customersScene = new Scene(secondpage, 500, 300);
//        return customersScene;
//    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}