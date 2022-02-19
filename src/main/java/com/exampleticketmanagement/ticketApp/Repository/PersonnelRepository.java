package com.exampleticketmanagement.ticketApp.Repository;

import com.exampleticketmanagement.ticketApp.Model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
}
