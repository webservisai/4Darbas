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
public class Orders {
    private DataBase dataBase = null;
    private Price price = new Price();
    
    public Orders() {
        dataBase = new DataBase();
    }
    
    public Order getOrder(int ID) throws SQLException {
        ResultSet results = dataBase.Query("SELECT * FROM `orders`");
        results.absolute(ID);
        
        double price = results.getDouble("Price");
        double distance = results.getDouble("Distance");
        double weight = results.getDouble("Weight");
        String startLocation = results.getString("StartLocation");
        String endLocation = results.getString("EndLocation");

        results.close();
        
        return new Order(price, distance, weight, startLocation, endLocation);
    }
    
    public List<Order> getOrders() throws SQLException {
        List<Order> orders = new ArrayList<>();
        ResultSet results = dataBase.Query("SELECT * FROM `orders`");
        
        while(results.next()){
            double price = results.getDouble("Price");
            double distance = results.getDouble("Distance");
            double weight = results.getDouble("Weight");
            String startLocation = results.getString("StartLocation");
            String endLocation = results.getString("EndLocation");
            
            orders.add(new Order(price, distance, weight, startLocation, endLocation));
        }

        results.close();
        
        return orders;
    }
    
    public Order addOrder(Order order) throws SQLException{
        double price = this.price.getPrice(order.getDistance(), order.getWeight());
        order.setPrice(price);
        int row = dataBase.QueryModify("INSERT INTO `orders` (Price, Distance, Weight, StartLocation, EndLocation) VALUES ('"+order.getPrice()+"', '"+order.getDistance()+"', '"+order.getWeight()+"', '"+order.getStartLocation()+"', '"+order.getEndLocation()+"')");
        return order;
    }
    
    public Order editOrder(int ID, Order order) throws SQLException{
        int row = dataBase.QueryModify("UPDATE `orders` SET Price = "+order.getPrice()+" , Distance = "+order.getDistance()+", Weight = "+order.getWeight()+", StartLocation = '"+order.getStartLocation()+"', EndLocation = '"+order.getEndLocation()+"' WHERE ID = '"+ID+"'");
        
        if(row != 0){
            return order;
        }
        return null;
    }
    
    public boolean deleteOrder(int ID) throws SQLException{
        return dataBase.QueryDelete("DELETE FROM `orders` WHERE ID = '"+ID+"'");
    }
    
    public boolean deleteOrders() throws SQLException{
        return dataBase.QueryDelete("DELETE FROM `orders`");
    }
    
}
