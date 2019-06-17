/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.WareHouse;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lt.viko.eif.Classes.Order;
import lt.viko.eif.DAO.WareHouseDAOImplement;

/**
 * Service Implication class
 * @author Laurynas Riauka
 * @version v1
 * @since 2019-06-15
 */
@Path("/WareHouse")
public class WareHouseServiceImp implements WareHouseService {
    WareHouseDAOImplement warehouse = new WareHouseDAOImplement();
    
    /*
    * Method that gets order by ID
    * @param ID
    * @return Order 
    */
    @Override
    @Path("/Orders/{ID}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Order        getOrder(@PathParam("ID") int ID){
        return warehouse.getOrder(ID);
    }
    /*
    * Method that gets orders by ID
    * @return Order list
    */
    @Override
    @Path("/Orders")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order>  getOrders(){
        return warehouse.getOrders();
    }
    /*
    * Method that gets order list
    * @return Order 
    */
    @Override
    @Path("/History")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order>  getHistory(){
        return warehouse.getHistory();
    }
    /*
    * Method that adds new order
    * @return Order 
    */
    @Override
    @Path("/NewOrder")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order        addOrder(Order order){
        return warehouse.addOrder(order);
    }
    /*
    * Method that adds new orders list
    * @return Orders list
    */
    @Override
    @Path("/NewOrders")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order>  addOrders(List<Order> orders){
        return warehouse.addOrders(orders);
    }
    /*
    * Method that adds new order history
    * @return Order 
    */
    @Override
    @Path("/PostHistory")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order        addHistory(Order order){
        return warehouse.addHistory(order);
    }
    
    /*
    * Method that edit order by ID
    * @param ID
    * @return Order 
    */
    @Override
    @Path("/EditOrder/{ID}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order        editOrder(@PathParam("ID") int ID, Order order){
        return warehouse.editOrder(ID, order);
    }
    
    /*
    * Method that delete order by ID
    * @param ID
    * @return boolean true if successfull 
    */
    @Override
    @Path("/DeleteOrders/{ID}")
    @DELETE
    public boolean      deleteOrder(@PathParam("ID") int ID){
        return warehouse.deleteOrder(ID);
    }
    /*
    * Method that deletes orders
    * @return boolean true if successfull 
    */
    @Override
    @Path("/DeleteOrders")
    @DELETE
    public boolean      deleteOrders(){
        return warehouse.deleteOrders();
    }
    /*
    * Method that deletes history
    * @return boolean true if successfull 
    */
    @Override
    @Path("/DeleteHistory")
    @DELETE
    public boolean      deleteHistory(){
        return warehouse.deleteHistory();
    }
}
