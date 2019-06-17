/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurynas
 */
public class DataBase {
    private static final String ADDRESS = "localhost";
    private static final String PORT = "3306";
    private static final String TABLE = "webservisai";
    private static final String USER = "root";
    private static final String PASSWORD = "123";
    
    private static Connection connection = null;
    private ResultSet results = null;
    
    static {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver"); 
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection("jdbc:mysql://"+ADDRESS+":"+PORT+"/"+TABLE+"?user="+USER+"&password="+PASSWORD);
            if (connection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet Query(String query){
        try {
            Statement statement = connection.createStatement();
            results = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return results;
    }
    public int QueryModify(String query){
        int rowEffected = 0;
        try {
            Statement statement = connection.createStatement();
            rowEffected = statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowEffected;
    }
    public boolean QueryDelete(String query){
        try {
            Statement statement = connection.createStatement();
            return !statement.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void End(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
