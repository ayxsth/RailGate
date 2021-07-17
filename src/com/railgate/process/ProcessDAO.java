package com.railgate.process;

import com.railgate.Ticket;
import java.sql.SQLException;
import java.util.List;

public interface ProcessDAO {

    int save(Ticket ticket) throws SQLException, ClassNotFoundException;

    List<Ticket> search() throws SQLException, ClassNotFoundException;

    Ticket getOne(int ticketId) throws SQLException, ClassNotFoundException;

    int remove(int trainId) throws SQLException, ClassNotFoundException;
}
