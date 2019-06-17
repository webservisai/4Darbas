/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lt.viko.eif.DataBase.DataBase;

/**
 *
 * @author Laurynas
 */
public class History {
     private DataBase dataBase = null;
    
    public History() {
        dataBase = new DataBase();
    }
    
    public List<Order> getHistory() throws SQLException {
        List<Order> orders = new ArrayList<Order>();
        ResultSet results = dataBase.Query("SELECT * FROM `history`");
        
        while(results.next()){
            double price = results.getDouble("Price");
            double distance = results.getDouble("Distance");
            double weight = results.getDouble("Weight");
            String startLocation = results.getString("StartLocation");
            String endLocation = results.getString("EndLocation");
            
            orders.add(new Order(price, distance, weight, startLocation, endLocation));
        }

        if(results != null){
            results.close();
        }
        
        return orders;
    }
    
    public Order addHistory(Order order) throws SQLException{
        int row = dataBase.QueryModify("INSERT INTO `history` (Price, Distance, Weight, StartLocation, EndLocation) VALUES ('"+order.getPrice()+"', '"+order.getDistance()+"', '"+order.getWeight()+"', '"+order.getStartLocation()+"', '"+order.getEndLocation()+"')");
        return order;
    }
    
    public boolean deleteHistory() throws SQLException{
        return dataBase.QueryDelete("DELETE FROM `history`");
    }
    
}
