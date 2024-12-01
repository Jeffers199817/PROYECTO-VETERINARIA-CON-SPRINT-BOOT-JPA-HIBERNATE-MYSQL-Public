package com.milenyumsoft.clinicaveterinaria.service;


import com.milenyumsoft.clinicaveterinaria.model.Mascota;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMascotaService {


    public List<Mascota> listMascota();

    public void createMascota(Mascota mascota);

    public void deleteMascota(Long id);

    public Mascota findMascota(Long id);

    public Mascota updateMascota(Mascota mascota);

    public Mascota updateMascota(Long idOriginal, Long idNuevo, String nombreNuevo , String especieNuevo, String razaNuevo , String colorNuevo);
}
