package com.exampleticketmanagement.ticketApp.Service;

import com.exampleticketmanagement.ticketApp.Model.Ticket;
import com.exampleticketmanagement.ticketApp.Model.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UtilisateurService {
    List<Utilisateur> findAll() ;

    Utilisateur saveUtilisateur(Utilisateur utilisateur);

    void updateUtilisateur(Long id, Utilisateur utilisateur);

    void DeleteUtilisateur(Long id);

    public Utilisateur authUtilisateur (String email, String password, String type);

}

