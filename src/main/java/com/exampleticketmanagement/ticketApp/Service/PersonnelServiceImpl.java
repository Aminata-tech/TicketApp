package com.exampleticketmanagement.ticketApp.Service;

import com.exampleticketmanagement.ticketApp.Model.Personnel;
import com.exampleticketmanagement.ticketApp.Model.Ticket;
import com.exampleticketmanagement.ticketApp.Repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Service
public class PersonnelServiceImpl implements PersonnelService{

    PersonnelRepository personnelRepository;
    @Autowired
    public PersonnelServiceImpl(PersonnelRepository personnelRepository){
        this.personnelRepository = personnelRepository;
    }

    @Override
    public List<Personnel> findAll() {
        return personnelRepository.findAll();
    }

    @Override
    public Personnel savePersonnel(@RequestBody Personnel personnel) {
        personnel.setTypeuser("Admin");
        return personnelRepository.save(personnel);
    }

    @Override
    public void updatePersonnel(Long id, Personnel personnel) {
        Personnel listpersonnel = personnelRepository.getById(id);
        listpersonnel.setNom(personnel.getNom());
        listpersonnel.setPrenom(personnel.getPrenom());
        listpersonnel.setAdresse(personnel.getAdresse());
        listpersonnel.setEmail(personnel.getEmail());
        listpersonnel.setTypeuser(personnel.getTypeuser());
        listpersonnel.setTel(personnel.getTel());
        listpersonnel.setPassword(personnel.getPassword());


    }

    @Override
    public void DeletePersonnel(Long id) {
personnelRepository.deleteById(id);
    }

    @Override
    public Personnel authPersonnel(String email, String password, String type) {
        return personnelRepository.findOneByEmailAndPasswordAndTypeuser(email, password, type);
    }
}
