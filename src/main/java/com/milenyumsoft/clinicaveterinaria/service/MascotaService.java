package com.milenyumsoft.clinicaveterinaria.service;

import com.milenyumsoft.clinicaveterinaria.model.Mascota;
import com.milenyumsoft.clinicaveterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MascotaService implements IMascotaService {

    @Autowired
    IMascotaRepository mascotaRepostory;

    @Override
    public List<Mascota> listMascota() {
        return mascotaRepostory.findAll() ;
    }

    @Override
    public void createMascota(Mascota mascota) {

        mascotaRepostory.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepostory.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascotaRepostory.findById(id).get();
    }

    @Override
    public Mascota updateMascota(Mascota mascota) {

        this.createMascota(mascota);

        Mascota masco = this.findMascota(mascota.getIdMascota());
        return masco;
    }
}
