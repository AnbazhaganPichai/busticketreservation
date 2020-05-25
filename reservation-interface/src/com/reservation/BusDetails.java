package com.reservation;

import java.util.Date;

/**
 * Created by GBS05161 on 06-03-2019.
 */
public class BusDetails {
    private String busID;
    private String busName;
    private String from;
    private String destination;
    private String ticketAvailable;
    private Date travelDate;
    private String ticketID;

    public String getBusID() {
        return busID;
    }

    public void setBusID(String busID) {
        this.busID = busID;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTicketAvailable() {
        return ticketAvailable;
    }

    public void setTicketAvailable(String ticketAvailable) {
        this.ticketAvailable = ticketAvailable;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
}
