package com.exampleticketmanagement.ticketApp.Repository;

import com.exampleticketmanagement.ticketApp.Model.Personnel;
import com.exampleticketmanagement.ticketApp.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
    Personnel findOneByEmailAndPasswordAndTypeuser(String email, String password, String type);
}
