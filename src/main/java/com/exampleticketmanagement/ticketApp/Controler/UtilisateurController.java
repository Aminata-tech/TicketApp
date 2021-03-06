package com.exampleticketmanagement.ticketApp.Controler;
import com.exampleticketmanagement.ticketApp.Model.Utilisateur;

import com.exampleticketmanagement.ticketApp.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/utilisateur")

public class UtilisateurController {

    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/list/utilisateur")
    public List<Utilisateur> listutilisateur(){
        return utilisateurService.findAll();
    }

    @PostMapping("/save/utilisateur")
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.saveUtilisateur(utilisateur);

    }

    @PutMapping("/update/utilisateur/{id}")
    public void uptdateUtilisateur(@PathVariable(value = "id") Long id,Utilisateur utilisateur){
        utilisateurService.updateUtilisateur(id, utilisateur);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        utilisateurService.DeleteUtilisateur(id);
    }

    @GetMapping("/utilisateur/auth/{email}/{password}/{type}")
    public Utilisateur authUtilisateur(@PathVariable("email") String email, @PathVariable("password") String password, @PathVariable("type") String type){
        return utilisateurService.authUtilisateur(email, password, type);
    }
}


