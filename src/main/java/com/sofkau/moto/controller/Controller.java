package com.sofkau.moto.controller;

import com.sofkau.moto.dto.MotoDTO;
import com.sofkau.moto.services.MotoServiceInterface;
import com.sofkau.moto.util.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/moto")
public class Controller {
    @Autowired
    private MotoServiceInterface service;

    @GetMapping()
    public List<MotoDTO> getAllMoto(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public MotoDTO getMotoById(@PathVariable Integer id) throws Exception {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public Respuesta deleteMoto(@PathVariable Integer id){
       return service.delete(id);

    }

    @PutMapping
    public Respuesta updateMoto(@RequestBody MotoDTO motoDTO){
        return service.update(motoDTO);
    }

    @PostMapping("/agregar")
    public Respuesta agregarMoto(@RequestBody MotoDTO motoDTO){
        return  service.save(motoDTO);
    }
}
