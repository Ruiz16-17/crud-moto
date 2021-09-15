package com.sofkau.moto.services;

import com.sofkau.moto.dto.MotoDTO;
import com.sofkau.moto.model.Moto;
import com.sofkau.moto.repository.MotoRepos;
import com.sofkau.moto.util.Factory;
import com.sofkau.moto.util.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MotoServiceImp implements MotoServiceInterface{

    @Autowired
    private MotoRepos motoRepos;
    @Autowired
    private Factory factory;

    @Override
    public Respuesta save(MotoDTO motoDTO) {
        if(motoRepos.existsById(motoDTO.getMatricula())){
            motoRepos.save(factory.DtoToEntitySave(motoDTO));
            return new Respuesta("Borrado!");
        }
        return new Respuesta("No existe registro con el "+ motoDTO.getMatricula());
    }

    @Override
    public List<MotoDTO> getAll() {
        List<Moto> list = motoRepos.findAll();
        return factory.listEntityToListDTO(list);
    }

    @Override
    public MotoDTO getById(int id){
        return factory.entityToDTO(motoRepos.getById(id));
    }

    @Override
    public Respuesta delete(int id) {
        if(motoRepos.existsById(id)){
            motoRepos.deleteById(id);
            return new Respuesta("Borrado!");
        }
        return new Respuesta("No existe registro con el "+ id);
    }

    @Override
    public Respuesta update(MotoDTO motoDTO) {
        if(motoRepos.existsById(motoDTO.getMatricula())){
            motoRepos.save(factory.DtoToEntitySave(motoDTO));
            return new Respuesta("Borrado!");
        }
        return new Respuesta("No existe registro con el "+ motoDTO.getMatricula());
    }
}
