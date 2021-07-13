
package com.railgate;

public class Ticket {
    private int ticketId, trainID, seats;
    private String from, to, date, status;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Ticket() {
    }

    public Ticket(int ticketId, int trainID, String from, String to, String date, int seats) {
        this.ticketId = ticketId;
        this.trainID = trainID;
        this.seats = seats;
        this.from = from;
        this.to = to;
        this.date = date;
        this.status = "Active";
    }
    
    public Ticket(int trainID, String from, String to, String date, int seats) {
        this.trainID = trainID;
        this.seats = seats;
        this.from = from;
        this.to = to;
        this.date = date;
        this.status = "Active";
    }

    @Override
    public String toString() {
        return "Ticket{" + "ticketId=" + ticketId 
                + ", trainID=" + trainID 
                + ", seats=" + seats 
                + ", from=" + from 
                + ", to=" + to 
                + ", date=" + date 
                + ", status=" + status + '}';
    }
    
    
}
