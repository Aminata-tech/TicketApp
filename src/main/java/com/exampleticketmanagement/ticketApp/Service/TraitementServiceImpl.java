package com.exampleticketmanagement.ticketApp.Service;


import com.exampleticketmanagement.ticketApp.Model.Traitement;
import com.exampleticketmanagement.ticketApp.Repository.TraitementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TraitementServiceImpl implements TraitementService{
    @Autowired
    TraitementRepository traitementRepository;
    @Override
    public List<Traitement> findAll() {
        return traitementRepository.findAll();
    }

    @Override
    public void saveTraitement(Traitement traitement) {
        traitementRepository.save(traitement);
    }

    @Override
    public void updateTraitementt(Long id, Traitement traitementt) {
        Traitement listtraitement = traitementRepository.getById(id);
        listtraitement.setDate_traitement(new Date());
        listtraitement.setPersonnel(traitementt.getPersonnel());



    }

    @Override
    public void DeleteTraitement(Long id) {
        traitementRepository.deleteById(id);
    }
}
