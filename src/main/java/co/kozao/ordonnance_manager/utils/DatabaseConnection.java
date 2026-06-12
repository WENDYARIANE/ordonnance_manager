package co.kozao.ordonnance_manager.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = 
        "jdbc:mysql://localhost:3306/ordonnance_manager";
    private static final String USER = "root";
    private static final String PASSWORD = "root123";

    private static Connection connection = null;


    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connected to database !");
            } catch (SQLException e) {
                System.out.println("Connection error : " + e.getMessage());
            }
        }
        return connection;
    }
}