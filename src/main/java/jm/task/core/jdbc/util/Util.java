package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соединения с БД
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "root";


    private static Statement statement;
    private static ResultSet resultSet;

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection=DriverManager.getConnection(url,user,password);
            System.out.println("Connection established");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection not established");
        }
        return connection;
    }
//
//    statement= connection.createStatement();
}
