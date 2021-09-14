package com.sofkau.moto.services;

import com.sofkau.moto.dto.MotoDTO;
import com.sofkau.moto.util.Respuesta;

import java.util.List;

public interface MotoServiceInterface {

    Respuesta save(MotoDTO motoDTO);

    List<MotoDTO> getAll();

    MotoDTO getById(int id);

    Respuesta delete(int id);

    Respuesta update(MotoDTO motoDTO);


}
