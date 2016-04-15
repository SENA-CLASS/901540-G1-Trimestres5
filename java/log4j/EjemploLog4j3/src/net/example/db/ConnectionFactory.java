/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.example.db;

/**
 *
 * @author hernando
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
import javax.sql.DataSource;
 

 
public class ConnectionFactory {
    private static interface Singleton {
        final ConnectionFactory INSTANCE = new ConnectionFactory();
    }
 
    private final Connection dataSource;
 
    private ConnectionFactory() throws SQLException {
       
        
        String user = "root";
        String pass = "123456789";
        String url = "jdbc:mysql://localhost:3306/exampleDb";
       
        Connection connectionFactory = DriverManager.getConnection(url, user, pass);
              
        
    }
 
    public static Connection getDatabaseConnection() throws SQLException {
        return Singleton.INSTANCE.dataSource.getConnection();
    }
}