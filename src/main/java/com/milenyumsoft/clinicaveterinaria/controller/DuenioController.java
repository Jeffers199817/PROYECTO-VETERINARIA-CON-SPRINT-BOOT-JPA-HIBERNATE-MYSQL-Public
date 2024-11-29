package com.milenyumsoft.clinicaveterinaria.controller;


import com.milenyumsoft.clinicaveterinaria.model.Duenio;
import com.milenyumsoft.clinicaveterinaria.service.DuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DuenioController {


    @Autowired
    private DuenioService duenioService;

    //1 REALIZAR EL CRUD/ABML DE DUENIO

    @PostMapping("duenio/crear")
    public String crearDuenio(@RequestBody Duenio duenio){
        duenioService.createDuenio(duenio);
        return "Dueño creado, exitosamente";
    }

    @GetMapping("duenio/traer")
    public Duenio traerDuenio(@RequestParam Long id){
       Duenio dueno= duenioService.getDuenio(id);
        return dueno;
    }

    @PutMapping("duenio/editar")
    public Duenio editarDuenio(@RequestBody Duenio duenio){

       Duenio dueno = duenioService.updateDuenio(duenio);
        return dueno;
    }

    @DeleteMapping("duenio/eliminar")
    public String eliminarDuenio(@RequestParam Long id){

        duenioService.deleteDuenio(id);
        return "Dueño eliminado exitosamente";
    }


}
