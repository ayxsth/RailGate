package com.railgate.process;

import com.railgate.Ticket;
import com.railgate.process.ProcessDAO;
import com.railgate.database.MySQLConnection;
import java.util.List;
import java.sql.*;
import java.util.LinkedList;

public class ProcessImpl implements ProcessDAO {

    @Override
    public int save(Ticket ticket) throws SQLException, ClassNotFoundException {
        Connection con = MySQLConnection.getConnection();
        int rowsEffected = 0;
        if (con != null) {
            final String INSERT = "INSERT INTO ticket(trainid, lfrom, lto, date, seats, status) "
                    + "VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setInt(1, ticket.getTrainId());
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

    @Override
    public List<Ticket> search() throws SQLException, ClassNotFoundException {
        List<Ticket> tickets = new LinkedList<>();
        Connection con = MySQLConnection.getConnection();
        if (con != null) {
            final String SEARCH = "SELECT * FROM ticket ORDER BY status";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(SEARCH);
            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setTicketId(rs.getInt("ticketid"));
                ticket.setTrainId(rs.getInt("trainid"));
                ticket.setFrom(rs.getString("lfrom"));
                ticket.setTo(rs.getString("lto"));
                ticket.setDate(rs.getString("date"));
                ticket.setSeats(rs.getInt("seats"));
                ticket.setStatus(rs.getString("status"));
                tickets.add(ticket);
            }
        }
        con.close();
        return tickets;
    }

    @Override
    public Ticket getOne(int ticketId) throws SQLException, ClassNotFoundException {
        Connection con = MySQLConnection.getConnection();
        final String GET_ONE = "SELECT * FROM ticket WHERE ticketid = ?";
        PreparedStatement preparedStatement = con.prepareStatement(GET_ONE);
        preparedStatement.setInt(1, ticketId);
        ResultSet resultSet = preparedStatement.executeQuery();
        Ticket ticket = null;
        while (resultSet.next()) {
            ticket = new Ticket();
            ticket.setTicketId(resultSet.getInt("ticketid"));
            ticket.setTrainId(resultSet.getInt("trainid"));
            ticket.setFrom(resultSet.getString("lfrom"));
            ticket.setTo(resultSet.getString("lto"));
            ticket.setDate(resultSet.getString("date"));
            ticket.setSeats(resultSet.getInt("seats"));
            ticket.setStatus(resultSet.getString("status"));
        }
        con.close();
        return ticket;
    }

    @Override
    public int remove(int trainId) throws SQLException, ClassNotFoundException {
        Connection con = MySQLConnection.getConnection();
        final String DELETE = "DELETE FROM ticket WHERE ticketid = ?";
        PreparedStatement preparedStatement = con.prepareStatement(DELETE);
        preparedStatement.setInt(1, trainId);
        int affectedRow = preparedStatement.executeUpdate();
        con.close();
        return affectedRow;
    }
}
