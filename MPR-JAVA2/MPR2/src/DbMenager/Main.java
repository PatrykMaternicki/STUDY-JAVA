import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
public class Main {
 
    public static final String DB_DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:company.db";
    
    private Connection connect;
    private Statement status;
    
    public Main (){
        try {
            Class.forName(Main.DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC is not exist");
            e.printStackTrace();
        }
 
        try {
            connect = DriverManager.getConnection(DB_URL);
            status = connect.createStatement();
        } catch (SQLException e) {
            System.err.println("No connect");
            e.printStackTrace();
        }
        createDb();
    }
    public boolean createDb(){
        
    }

}