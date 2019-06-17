/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.Classes;

/**
 *
 * @author Laurynas
 */
public class Order {
    private double price;
    private double distance;
    private double weight;
    private String startLocation;
    private String endLocation;

    public Order(double price, double distance, double weight, String startLocation, String endLocation) {
        this.price = price;
        this.distance = distance;
        this.weight = weight;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public Order() {
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public double getPrice() {
        return price;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }
    
    
}
