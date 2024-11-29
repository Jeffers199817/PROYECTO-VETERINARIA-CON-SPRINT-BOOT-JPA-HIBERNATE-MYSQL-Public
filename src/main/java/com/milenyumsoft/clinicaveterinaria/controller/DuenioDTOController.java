package com.milenyumsoft.clinicaveterinaria.controller;

import com.milenyumsoft.clinicaveterinaria.dto.DuenioDTO;
import com.milenyumsoft.clinicaveterinaria.service.IDuenioDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioDTOController {

    @Autowired
    private IDuenioDTOService duenioDTOService;

    @GetMapping("duenio/traerDTO/{id}")
    public DuenioDTO getDuenioDTO(@PathVariable Long id){
       DuenioDTO duenioDTO= duenioDTOService.traerDuenio(id);
        return duenioDTO;
    }
}
