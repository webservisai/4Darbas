/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.DAO;

import java.util.List;
import lt.viko.eif.Classes.Order;

/**
 *
 * @author Laurynas
 */
public interface WareHouseDAO {
    public Order        getOrder(int ID);
    public List<Order>  getOrders();
    public List<Order>  getHistory();
    
    public Order        addOrder(Order order);
    public List<Order>  addOrders(List<Order> orders);
    public Order        addHistory(Order order);
    
    public Order        editOrder(int ID, Order order);
    
    public boolean      deleteOrder(int ID);
    public boolean      deleteOrders();
    public boolean      deleteHistory();
}
