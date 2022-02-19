package com.exampleticketmanagement.ticketApp.Controler;

import com.exampleticketmanagement.ticketApp.Model.Traitement;
import com.exampleticketmanagement.ticketApp.Service.TraitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/traitement")
public class TraitementController {

    @Autowired
    TraitementService traitementService;

    @GetMapping("/list/traitement")
    public List<Traitement> listTraitement(){
        return traitementService.findAll();
    }

    @PostMapping("/save/traitement")
    public void saveTraitement(Traitement traitement){
        traitementService.saveTraitement(traitement);

    }

    @PutMapping("/update/traitement/{id}")
    public void updateTraitement(@PathVariable(value = "id") Long id,Traitement traitement){
        traitementService.updateTraitementt(id, traitement);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        traitementService.DeleteTraitement(id);
    }
}
