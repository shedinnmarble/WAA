/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yafen
 */
public class AirLine {

    public AirLine(String departure, String arrival, String time, String airLineName, double price) {
        this.departure = departure;
        this.arrival = arrival;
        this.time = time;
        this.airLineName = airLineName;
        this.price = price;
    }
    private String departure;
    private String arrival;
    private String time;
    private String airLineName;
    private double price;

    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the airLineName
     */
    public String getAirLineName() {
        return airLineName;
    }

    /**
     * @param airLineName the airLineName to set
     */
    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
