package com.exampleticketmanagement.ticketApp.Service;

import com.exampleticketmanagement.ticketApp.EmailSenderService;
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

    @Autowired
    EmailSenderService emailSenderService;

    @Override
    public List<Ticket> listeTicket() {
        return ticketRepository.findAll();
    }

    @Override
    public void saveTicket(Ticket ticket) {
        emailSenderService._sendEmail(ticket.getUtilisateur().getEmail(), "Votre demande a éte prise en charge", "Message de confirmation");
        ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Long id, Ticket ticket) {
       Ticket listticket = ticketRepository.findById(id).get();
      // listticket.setDate_envoie(new Date());
       listticket.setDescription(ticket.getDescription());
       listticket.setNum_ticket(ticket.getNum_ticket());
       listticket.setEtat(ticket.getEtat());
       listticket.setStatut(ticket.getStatut());
       listticket.setPersonnel(ticket.getPersonnel());
       listticket.setUtilisateur(ticket.getUtilisateur());

        if (listticket.getStatut().equals("traites")) {
            emailSenderService._sendEmail(listticket.getUtilisateur().getEmail(), "Votre demande a éte validée avec succès", "Message de validation");
        }
        if (listticket.getStatut().equals("rejeter")) {
            emailSenderService._sendEmail(listticket.getUtilisateur().getEmail(), "Désolé votre demande a éte réjetée", "Message de rejet");
        }

       return ticketRepository.save(listticket);
    }

    @Override
    public Ticket detailTicket(Long id) {
        return ticketRepository.findById(id).get();
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
