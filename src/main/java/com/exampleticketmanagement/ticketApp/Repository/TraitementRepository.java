package com.exampleticketmanagement.ticketApp.Repository;

import com.exampleticketmanagement.ticketApp.Model.Traitement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraitementRepository extends JpaRepository<Traitement, Long> {
}
