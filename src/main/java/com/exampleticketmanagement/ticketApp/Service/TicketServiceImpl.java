package com.exampleticketmanagement.ticketApp.Service;

import com.exampleticketmanagement.ticketApp.Model.Ticket;
import com.exampleticketmanagement.ticketApp.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;
    @Override
    public List<Ticket> listeTicket() {
        return ticketRepository.findAll();
    }

    @Override
    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void updateTicket(Long id, Ticket ticket) {
       Ticket listticket = ticketRepository.getById(id);
       listticket.setDate_envoie(new Date());
       listticket.setDescription(ticket.getDescription());
       listticket.setNum_ticket(ticket.getNum_ticket());
       listticket.setEtat(ticket.getEtat());
       listticket.setPersonnel(ticket.getPersonnel());
       listticket.setUtilisateur(ticket.getUtilisateur());
    }

    @Override
    public void DeleteTicket(Long id) {

        ticketRepository.deleteById(id);
    }

    @Override
    public List<Ticket> mestickets() {
        return ticketRepository.findAll();
    }
}
