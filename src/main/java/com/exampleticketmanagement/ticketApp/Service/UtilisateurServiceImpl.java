package com.exampleticketmanagement.ticketApp.Service;


import com.exampleticketmanagement.ticketApp.Model.Utilisateur;
import com.exampleticketmanagement.ticketApp.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        utilisateur.setTypeuser("User");
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void updateUtilisateur(Long id, Utilisateur utilisateur) {
        Utilisateur listutilisateur = utilisateurRepository.getById(id);
        listutilisateur.setNom(utilisateur.getNom());
        listutilisateur.setPrenom(utilisateur.getPrenom());
        listutilisateur.setAdresse(utilisateur.getAdresse());
        utilisateur.setEmail(utilisateur.getEmail());
        listutilisateur.setTel(utilisateur.getTel());
        listutilisateur.setPassword(utilisateur.getPassword());
    }

    @Override
    public void DeleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public Utilisateur authUtilisateur(String email, String password, String type) {
        return utilisateurRepository.findOneByEmailAndPasswordAndTypeuser(email, password, type);
    }
}
