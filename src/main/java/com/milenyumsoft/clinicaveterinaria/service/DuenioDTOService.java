package com.milenyumsoft.clinicaveterinaria.service;

import com.milenyumsoft.clinicaveterinaria.dto.DuenioDTO;

import com.milenyumsoft.clinicaveterinaria.model.Duenio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioDTOService implements IDuenioDTOService{


    @Autowired
    private IDuenioService duenioService;
    @Override
    public DuenioDTO traerDuenio(Long id) {

        Duenio duenio= duenioService.getDuenio(id);
        DuenioDTO duenioDTO = new DuenioDTO();

        duenioDTO.setNombre_mascota(duenio.getMasco().getNombre());
        duenioDTO.setEspecie(duenio.getMasco().getEspecie());
        duenioDTO.setRaza(duenio.getMasco().getRaza());
        duenioDTO.setNombre_duenio(duenio.getNombre());
        duenioDTO.setApellido_duenio(duenio.getApellido());

        return duenioDTO;
    }
}
