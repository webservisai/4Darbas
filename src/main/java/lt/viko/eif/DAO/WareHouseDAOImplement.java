/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.DAO;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lt.viko.eif.Classes.History;
import lt.viko.eif.Classes.Order;
import lt.viko.eif.Classes.Orders;
import lt.viko.eif.Classes.Price;

/**
 * WareHouse Implication class
 * @author Laurynas Riauka
 * @version v1
 * @since 2019-06-15
 */

public class WareHouseDAOImplement implements WareHouseDAO {
    private Orders  orders  = new Orders();
    private History history = new History();
    private Price   price   = new Price();
    
    
    /*
    * Method that gets order by ID
    * @Param ID
    * @return Order
    */
    @Override
    public Order        getOrder(int ID){
        Order order = null;
        try {
            order = orders.getOrder(ID);
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return order;
    }
    /*
    * Method that gets orders list
    * @return Order list
    */
    @Override
    public List<Order>  getOrders(){
        List<Order> _orders = null;
        
        try {
            _orders = orders.getOrders();
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return _orders;
    }
    /*
    * Method that gets orders history
    * @return Order list
    */
    @Override
    public List<Order>  getHistory(){
        List<Order> _history = null;
        
        try {
            _history = history.getHistory();
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return _history;
    }
    
    /*
    * Method that add order
    * @Param Order
    * @return Order
    */
    @Override
    public Order        addOrder(Order order){
        try {
            orders.addOrder(order);
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return order;
    }
    /*
    * Method that add orders list
    * @Param List<Order>
    * @return Order list
    */
    @Override
    public List<Order>  addOrders(List<Order> orders){
        for(int i = 0; i < orders.size(); i++){
            try {
                this.orders.addOrder(orders.get(i));
            } catch (SQLException ex) {
                Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return orders;
    }
    /*
    * Method that add orders to history
    * @Param Order
    * @return Order
    */
    @Override
    public Order        addHistory(Order order){
        try {
            return history.addHistory(order);
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /*
    * Method that edits order
    * @Param ID, Order
    * @return Order edited
    */
    @Override
    public Order        editOrder(int ID, Order order){
        try {
            return orders.editOrder(ID, order);
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /*
    * Method that deletes order
    * @Param ID
    * @return boolean if successfull return true
    */
    @Override
    public boolean      deleteOrder(int ID){
        try {
            return orders.deleteOrder(ID);
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    /*
    * Method that deletes orders
    * @return boolean if successfull return true
    */
    @Override
    public boolean      deleteOrders(){
        try {
            return orders.deleteOrders();
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    /*
    * Method that deletes history
    * @return boolean if successfull return true
    */
    @Override
    public boolean      deleteHistory(){
        try {
            return history.deleteHistory();
        } catch (SQLException ex) {
            Logger.getLogger(WareHouseDAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}