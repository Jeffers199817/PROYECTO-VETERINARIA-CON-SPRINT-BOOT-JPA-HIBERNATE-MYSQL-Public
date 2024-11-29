package com.milenyumsoft.clinicaveterinaria.service;

import com.milenyumsoft.clinicaveterinaria.model.Duenio;


import java.util.List;


public interface IDuenioService {

    public void createDuenio(Duenio duenio);

    public void deleteDuenio(Long id);

    public List<Duenio> traerDuenios();

    public Duenio getDuenio(Long id);

    public Duenio updateDuenio(Duenio duenio);



}
