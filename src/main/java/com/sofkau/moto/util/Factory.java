package com.sofkau.moto.util;


import com.sofkau.moto.dto.MotoDTO;
import com.sofkau.moto.model.Moto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Factory {
    public MotoDTO entityToDTO(Moto moto){
        MotoDTO motoDTO = new MotoDTO();
        motoDTO.setMarca(moto.getNombre());
        motoDTO.setMatricula(moto.getIdentificacion());
        motoDTO.setColor(moto.getApariencia());
        motoDTO.setModelo(moto.getYear());
        return motoDTO;
    }

    public Moto DtoToEntitySave(MotoDTO motoDTO){
        Moto moto = new Moto();
        moto.setApariencia(motoDTO.getColor());
        moto.setNombre(motoDTO.getMarca());
        moto.setYear(motoDTO.getModelo());
        return moto;
    }

    public Moto DtoToEntityUpdate(MotoDTO motoDTO){
        Moto moto = new Moto();
        moto.setIdentificacion(motoDTO.getMatricula());
        moto.setApariencia(motoDTO.getColor());
        moto.setNombre(motoDTO.getMarca());
        moto.setYear(motoDTO.getModelo());
        return moto;
    }

    public List<MotoDTO> listEntityToListDTO(List<Moto> motos){
        List<MotoDTO> motoDTOList = new ArrayList<>();
        motos.forEach(moto -> motoDTOList.add(entityToDTO(moto)));
        return motoDTOList;
    }
}
