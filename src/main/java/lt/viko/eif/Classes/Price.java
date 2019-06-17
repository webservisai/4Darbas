/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import lt.viko.eif.DataBase.DataBase;

/**
 *
 * @author Laurynas
 */
public class Price {
    private DataBase dataBase = null;
    
    public Price() {
        dataBase = new DataBase();
    }
    
    public double getPrice(double distance, double weight) throws SQLException {
        ResultSet results = dataBase.Query("SELECT * FROM `prices`");
        results.first();
        
        double price = results.getDouble("Price");
        double factor = results.getDouble("Factor");
        double weightPrice = results.getDouble("WeightPrice");
        double initialPrice = results.getDouble("InitialPrice");

        if(results != null){
            results.close();
        }
        double allDistancePrice = Math.pow(distance, factor) * price;
        double allWeightPrice = weight * weightPrice;
        double totalPrice =  allDistancePrice + allWeightPrice + initialPrice;
        
        return totalPrice;
    }
    
}
