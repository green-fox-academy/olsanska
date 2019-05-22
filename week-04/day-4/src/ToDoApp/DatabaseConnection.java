package toDoApp;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ToDoApp", "root", "apple");

            Statement query = connect.createStatement();
            query.executeUpdate("INSERT INTO list");

            System.out.println("Connected to database");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null,ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null,ex);
            ex.printStackTrace();
        }
    }

}
