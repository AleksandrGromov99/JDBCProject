package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");
        } catch (SQLException e) {
            throw new RuntimeException("Connection not established");
        }
        return connection;
    }
}
