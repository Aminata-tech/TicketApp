package com.exampleticketmanagement.ticketApp.Service;

import com.exampleticketmanagement.ticketApp.Model.Ticket;
import com.exampleticketmanagement.ticketApp.Model.Traitement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TraitementService {
    List<Traitement> findAll() ;

    void saveTraitement(Traitement traitement);

    void updateTraitementt(Long id, Traitement traitementt);

    void DeleteTraitement(Long id);
}
