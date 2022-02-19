package com.exampleticketmanagement.ticketApp.Repository;

import com.exampleticketmanagement.ticketApp.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
