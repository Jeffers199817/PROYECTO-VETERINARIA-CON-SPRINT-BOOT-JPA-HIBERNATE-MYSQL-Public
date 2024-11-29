package com.milenyumsoft.clinicaveterinaria.controller;

import com.milenyumsoft.clinicaveterinaria.model.Mascota;
import com.milenyumsoft.clinicaveterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @PostMapping("mascota/crear")
    public String crearMascota(@RequestBody Mascota masco) {
        mascotaService.createMascota(masco);
        return "Mascota creada, exitosamente";
    }

    @GetMapping("mascota/traer")
    public Mascota traerMascota(@RequestParam Long id) {

        return mascotaService.findMascota(id);
    }

    @PutMapping("mascota/editar")
    public Mascota editarMascota(@RequestBody Mascota mascota) {
        Mascota masco = mascotaService.updateMascota(mascota);


    return masco;
    }
    @DeleteMapping("mascota/delete")
    public String eliminarMascota(@RequestParam Long id) {
        mascotaService.deleteMascota(id);
        return "Mascota eliminada, exitosamente";
    }
}
