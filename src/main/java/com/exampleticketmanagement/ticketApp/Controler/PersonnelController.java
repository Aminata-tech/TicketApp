package com.exampleticketmanagement.ticketApp.Controler;

import com.exampleticketmanagement.ticketApp.Model.Personnel;

import com.exampleticketmanagement.ticketApp.Service.PersonnelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/personnel")
public class PersonnelController {

    @Autowired
    PersonnelService personnelService;

    @GetMapping("/list/personnel")
    public List<Personnel> listPersonnel(){
        return personnelService.findAll();
    }

    @PostMapping("/save/personnel")
    public Personnel savePersonnel(@RequestBody Personnel personnel){
       return personnelService.savePersonnel(personnel);

    }

    @PutMapping("/update/personnel/{id}")
    public void updatePersonnel( @PathVariable(value = "id") Long id,@RequestBody Personnel personnel){
        personnelService.updatePersonnel(id, personnel);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        personnelService.DeletePersonnel(id);
    }
}
