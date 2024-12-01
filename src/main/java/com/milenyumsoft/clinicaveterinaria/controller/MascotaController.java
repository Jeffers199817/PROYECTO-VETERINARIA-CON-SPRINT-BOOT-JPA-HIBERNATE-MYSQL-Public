package com.milenyumsoft.clinicaveterinaria.controller;

import com.milenyumsoft.clinicaveterinaria.model.Mascota;
import com.milenyumsoft.clinicaveterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("mascota/traer/{especie}/{raza}")
    public List<Mascota> traerMascota(@PathVariable String especie, @PathVariable String raza) {
        List<Mascota> listaMascoRazaEspecio = new ArrayList();
        List<Mascota> listaMascota= mascotaService.listMascota();
        for(Mascota masco: listaMascota){
            if(masco.getEspecie().toLowerCase().contains("perro") && masco.getRaza().toLowerCase().contains("caniche")){
                listaMascoRazaEspecio.add(masco);
            }
        }
        return listaMascoRazaEspecio;
    }

    @GetMapping("mascota/editar")
    public Mascota editarMascota(@RequestParam Long idOriginal,
                                 @RequestParam(required = false, name="id") Long idMascotaNuevo,
                                 @RequestParam(required = false, name="nombre" )String nombreNuevo,
                                 @RequestParam(required = false, name="especie") String especieNuevo,
                                 @RequestParam(required = false, name="raza") String razaNuevo,
                                 @RequestParam(required = false, name="color") String colorNuevo){

       Mascota masco= mascotaService.findMascota(idOriginal);
        System.out.println("La entidad de mascota es"  + masco );


        return masco;
    }

}
