package com.exampleticketmanagement.ticketApp.Service;

import com.exampleticketmanagement.ticketApp.Model.Personnel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonnelService {

    List<Personnel> findAll() ;

    Personnel savePersonnel(Personnel personnel);

    void updatePersonnel(Long id, Personnel personnel);

    void DeletePersonnel(Long id);
}
