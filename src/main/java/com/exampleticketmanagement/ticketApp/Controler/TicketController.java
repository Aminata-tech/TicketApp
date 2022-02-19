package com.exampleticketmanagement.ticketApp.Controler;

import com.exampleticketmanagement.ticketApp.Model.Ticket;
import com.exampleticketmanagement.ticketApp.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/list/ticket")
    public List<Ticket> listTicket(){
        return ticketService.listeTicket();
    }

    @PostMapping("/save/ticket")
    public void saveTicket(@RequestBody Ticket ticket){
        ticketService.saveTicket(ticket);

    }

    @PutMapping("/update/ticket/{id}")
    public void updateTicket(@PathVariable(value = "id") Long id,Ticket ticket){
        ticketService.updateTicket(id, ticket);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){

        ticketService.DeleteTicket(id);
    }

    @GetMapping("/listticket")
    public List<Ticket> meslisteticket(){
        return ticketService.mestickets();
    }
}


