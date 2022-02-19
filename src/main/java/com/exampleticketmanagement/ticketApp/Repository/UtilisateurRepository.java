package com.exampleticketmanagement.ticketApp.Repository;

import com.exampleticketmanagement.ticketApp.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
