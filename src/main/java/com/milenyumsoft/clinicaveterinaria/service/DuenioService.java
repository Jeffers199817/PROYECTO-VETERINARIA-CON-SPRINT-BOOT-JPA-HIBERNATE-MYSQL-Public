package com.milenyumsoft.clinicaveterinaria.service;

import com.milenyumsoft.clinicaveterinaria.model.Duenio;
import com.milenyumsoft.clinicaveterinaria.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepository;

    @Override
    public void createDuenio(Duenio duenio) {

        duenioRepository.save(duenio);

    }

    @Override
    public void deleteDuenio(Long id) {

        duenioRepository.deleteById(id);
    }

    @Override
    public List<Duenio> traerDuenios() {

        return duenioRepository.findAll();
    }

    @Override
    public Duenio getDuenio(Long id) {
        return duenioRepository.findById(id).get();
    }



    @Override
    public Duenio updateDuenio(Duenio duenio) {

        this.createDuenio(duenio);

   Duenio dueno=this.getDuenio(duenio.getId());


        return dueno;
    }
}
