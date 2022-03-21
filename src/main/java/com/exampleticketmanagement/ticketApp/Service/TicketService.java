package com.exampleticketmanagement.ticketApp.Service;


import com.exampleticketmanagement.ticketApp.Model.Personnel;
import com.exampleticketmanagement.ticketApp.Model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TicketService {
    List<Ticket> listeTicket() ;

    void saveTicket(Ticket ticket);

    Ticket updateTicket(Long id, Ticket ticket);
    Ticket detailTicket(Long id);

    void DeleteTicket(Long id);

    List<Ticket> mestickets();

}
