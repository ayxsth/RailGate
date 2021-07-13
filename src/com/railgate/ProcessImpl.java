package com.railgate;

import java.util.List;
import java.sql.*;
import java.util.LinkedList;

public class ProcessImpl {

    int save(Ticket ticket) throws SQLException, ClassNotFoundException {
        Connection con = MySQLConnection.getConnection();
        int rowsEffected = 0;
        if (con != null) {
            final String INSERT = "INSERT INTO ticket(trainid, lfrom, lto, date, seats, status) "
                    + "VALUES(?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(INSERT);
                ps.setInt(1, ticket.getTrainID());
                ps.setString(2, ticket.getFrom());
                ps.setString(3, ticket.getTo());
                ps.setString(4, ticket.getDate());
                ps.setInt(5, ticket.getSeats());
                ps.setString(6, ticket.getStatus());
                rowsEffected = ps.executeUpdate();
                con.close();
            }
        return rowsEffected;
    }

    public List<Ticket> search() throws SQLException, ClassNotFoundException {
        List<Ticket> tickets = new LinkedList<>();
        Connection con = MySQLConnection.getConnection();
        if (con != null) {
            final String SEARCH = "SELECT * FROM ticket";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(SEARCH);
            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setTicketId(rs.getInt("ticketid"));
                ticket.setTrainID(rs.getInt("trainid"));
                ticket.setFrom(rs.getString("lfrom"));
                ticket.setTo(rs.getString("lto"));
                ticket.setDate(rs.getString("date"));
                ticket.setSeats(rs.getInt("seats"));
                ticket.setStatus(rs.getString("status"));
                tickets.add(ticket);
            }
        }
        return tickets;
    }
}
